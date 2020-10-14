import java.io.*;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by: Ulf Nyberg
 * Date: 2020-10-09
 * Time: 08:26
 * Project: OOPJava Inlämningsuppgift02
 * Copyright: MIT
 */

public class TestDemo {

    Scanner scan = new Scanner(System.in);
    LocalDate dagensDatum = LocalDate.now();
    LocalDate ettÅrSedan = dagensDatum.minusYears(1);
    String kundPersonNummerOchNamn = "";
    String kundMedlemsDatum = "";
    String inPath = "src/customers.txt";
    String outputPath = "src/nyaKunderLoggade.txt";
    boolean personenFinns = false;
    String svarNamn = "";


    //metod: om namnet finns i txt-filen, pritas personens info i en info-text
    public String medlemsInfoMeddelande (String kundPersonNummerOchNamn , String kundMedlemsDatum){
        return("Info (Personnummer och namn): " + kundPersonNummerOchNamn + "\n"
                + "Senaste betaldatum för medlemskap: " + kundMedlemsDatum);
    }

    //metod: om namnet inte finns i txt-filen
    public void inteMedlemAvbrytProgram() {
        if(!personenFinns){
            System.out.println("Du har inte varit medlem förr");
            System.exit(0);}
    }



    public void mainProgram() {

        //try with resources
        try { BufferedReader reader = new BufferedReader(new FileReader(inPath));
            PrintWriter writer = new PrintWriter(
                    new BufferedWriter(new FileWriter(outputPath, true)));

            System.out.println("Ange kundens för- och efternamn eller kundens personnummer: ");
            svarNamn = scan.next();



            while ((kundPersonNummerOchNamn = reader.readLine()) != null) { // =första raden i txt-filen

                kundPersonNummerOchNamn.trim();
                kundMedlemsDatum  = reader.readLine();  // =andra raden i txt-filen


                if (kundPersonNummerOchNamn.toLowerCase().contains(svarNamn.toLowerCase()) ) {
                    kundMedlemsDatum.trim();
                    LocalDate membership = LocalDate.parse(kundMedlemsDatum);
                    personenFinns = true;

                    System.out.println(medlemsInfoMeddelande(kundPersonNummerOchNamn , kundMedlemsDatum));
                    {
                        if (membership.isAfter(ettÅrSedan)){
                            System.out.println("Du är aktiv medlem");
                            writer.println(kundPersonNummerOchNamn + " " + dagensDatum);
                            writer.close();}
                        else
                            System.out.println(("Ditt medlemskap har utgått"));
                    }
                }
            }
            inteMedlemAvbrytProgram();      //om namnet inte hittas i txt-filen


        } catch (FileNotFoundException e){
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
            System.exit(0);
        }
        catch (IOException e){
            System.out.println("Det gick inte att skriva till filen");
            e.printStackTrace();
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("Något blev fel...");
            e.printStackTrace();
            System.out.flush();
            System.exit(0);
        }
    }


    public static void main(String[] args) {
        TestDemo t = new TestDemo();
        t.mainProgram();
    }
}
