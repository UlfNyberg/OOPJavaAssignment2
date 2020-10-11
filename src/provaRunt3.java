import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
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

public class provaRunt3 {

    public provaRunt3() {

        Scanner scan = new Scanner(System.in);
        LocalDate t1 = LocalDate.now();
        LocalDate ettÅrSedan = t1.minusYears(1);
        String tempLine = "";
        String rad2 = "";
        //String lolo = tempLine + " " + rad2;
        final String tempPath = "src/customers.txt";
        final String outputPath = "src/nyaKunderLoggade.txt";
        boolean test = false; //public boolean test = false;

        double temp;
        String svarNamn = "";

        /*
        //läser in data till programmet
        public int readInputData(String prompt, String optionalTestParameter){

            if(test){
                scan = new Scanner(optionalTestParameter);
            }
            else{
                scan = new Scanner(System.in);
            }

            while (true) {
                try {
                    System.out.println(prompt);
                    return scan.nextInt();

                } catch (InputMismatchException e) {
                    System.out.println("Felaktigt tal!");
                    scan.next();
                } catch (NoSuchElementException e) {
                    System.out.println("Indata saknas!");
                    scan.next();
                } catch (Exception e) {
                    System.out.println("Ospecifierat fel inträffade, försök igen!");
                    scan.next();
                    e.printStackTrace();
                }
            }
        }

         */




















        System.out.println("Ange kundens för- och efternamn eller kundens personnummer: ");
        //svarPersonNummer = scan.nextInt();
        svarNamn = scan.next();

        /*
    public String getCustomer(String svarNamn, String tempLine){
            if (tempLine.toLowerCase().contains(svarNamn.toLowerCase()) ) {
                rad2.trim();
                LocalDate membership = LocalDate.parse(rad2);
                System.out.println("Info: " + tempLine + " " + "Medlemskapsdatum: " + rad2);

        }

         */






        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(tempPath));
            PrintWriter writer = new PrintWriter(
                    new BufferedWriter(new FileWriter(outputPath, true)));

            while ((tempLine = reader.readLine()) != null) {

                tempLine.trim();
                rad2 = reader.readLine();

                //rad2.trim();
                //LocalDate membership = LocalDate.parse(rad2);

                //tempLine.
                //System.out.println(tempLine);


                if (tempLine.toLowerCase().contains(svarNamn.toLowerCase()) ) {
                    rad2.trim();
                    LocalDate membership = LocalDate.parse(rad2);


                    //System.out.println(tempLine.substring(12) + " " + reader.readLine());
                    System.out.println("Info: " + tempLine + " " + "Medlemskapsdatum: " + rad2);
                    //writer.println(tempLine + " " + t1);
                    //writer.close();
                    System.out.println(membership);
                    {
                        if (membership.isAfter(ettÅrSedan)){
                            System.out.println("Du är aktiv medlem");
                            writer.println(tempLine + " " + t1);
                            writer.close();}
                        else
                            System.out.println(("Ditt medlemskap har utgått"));
                    }
                }
                //else {
                //System.out.println("11Du har inte varit medlem förr");
                //break;}








            }

        } catch (Exception e) {
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.out.flush();
            System.exit(0);
        }


        /*
        public boolean (LocalDate ettÅrSedan, String rad2){

            return true;
        }

         */






    }


    public static void main(String[] args) {
        TestDemo t = new TestDemo();
    }


}
