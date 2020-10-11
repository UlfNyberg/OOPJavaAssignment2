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
    LocalDate t1 = LocalDate.now();
    LocalDate ettÅrSedan = t1.minusYears(1);
    String kundPersonNummerOchNamn = "";
    String kundMedlemsDatum = "";
    final String tempPath = "src/customers.txt";
    final String outputPath = "src/nyaKunderLoggade.txt";
    //boolean test = false; //public boolean test = false;
    boolean personenFinns = false;
    String svarNamn = "";


    /*
    public String getCustomer(String svarNamn) {


        if (kundPersonNummerOchNamn.toLowerCase().contains(svarNamn.toLowerCase())) {
            kundMedlemsDatum.trim();
            LocalDate membership = LocalDate.parse(kundMedlemsDatum);
            personenFinns = true;

            System.out.println("Info: " + kundPersonNummerOchNamn + ", "
                    + "Medlemskapsdatum: " + kundMedlemsDatum);
            {
                if (membership.isAfter(ettÅrSedan)) {
                    System.out.println("Du är aktiv medlem");
                    writer.println(kundPersonNummerOchNamn + " " + t1);
                    writer.close();
                } else
                    System.out.println(("Ditt medlemskap har utgått"));
            }

        }

    }
        if(!personenFinns)

    {
        System.out.println("Du har inte varit medlem förr");
        System.exit(0);
    }

}}}}}}

     */

    public void inteMedlemAvbrytProgram() {
        if(!personenFinns){
            System.out.println("Du har inte varit medlem förr");
            System.exit(0);}
    }





    public TestDemo() {








        //System.out.println("Ange kundens för- och efternamn eller kundens personnummer: ");
        //svarNamn = scan.next();


        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(tempPath));
            PrintWriter writer = new PrintWriter(
                    new BufferedWriter(new FileWriter(outputPath, true)));

            System.out.println("Ange kundens för- och efternamn eller kundens personnummer: ");
            svarNamn = scan.next();

            while ((kundPersonNummerOchNamn = reader.readLine()) != null) {

                kundPersonNummerOchNamn.trim();
                kundMedlemsDatum  = reader.readLine();

                if (kundPersonNummerOchNamn.toLowerCase().contains(svarNamn.toLowerCase()) ) {
                    kundMedlemsDatum.trim();
                    LocalDate membership = LocalDate.parse(kundMedlemsDatum);
                    personenFinns = true;

                    System.out.println("Info: " + kundPersonNummerOchNamn + ", "
                            + "Medlemskapsdatum: " + kundMedlemsDatum);
                    {
                        if (membership.isAfter(ettÅrSedan)){
                            System.out.println("Du är aktiv medlem");
                            writer.println(kundPersonNummerOchNamn + " " + t1);
                            writer.close();}
                        else
                            System.out.println(("Ditt medlemskap har utgått"));
                    }
                }
            }
            //if (!personenFinns) {
             //   System.out.println("Du har inte varit medlem förr");
             //   System.exit(0);}
            inteMedlemAvbrytProgram();


        } catch (Exception e) {
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.out.flush();
            System.exit(0);
        }




    }


    public static void main(String[] args) {
        TestDemo t = new TestDemo();
    }


}

/*
while(true) {
            String s = tempPath.readLine();
            if (s == null)
                break;
            if (s.indexOf(txt) >= 0)
                utström.println(s);
        }
 */



                /*
                String rad1 = reader.readLine();
                String rad2 = reader.readLine();
                int datum = Integer.parseInt(rad2);
                System.out.println(rad2);

                 */

                /*
                while (true) {
                    String rad1 = reader.readLine();
                    String rad2 = reader.readLine();
                    int datum = Integer.parseInt(rad2);
                    if (rad1.equals(svarNamn))
                        System.out.println(svarNamn + " " + datum);
                }

                 */




                /*
                FileWriter writer = new FileWriter("/Users/UlfNyberg/Desktop/newfile.txt");
                if (tempLine == namn && LocalDate || tempLine == personNr && LocalDate)
                writer.write(fileContent);
                writer.close();

                 */
