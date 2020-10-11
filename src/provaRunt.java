import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;

/**
 * Created by: Ulf Nyberg
 * Date: 2020-10-09
 * Time: 08:26
 * Project: OOPJava Inlämningsuppgift02
 * Copyright: MIT
 */

public class provaRunt {

    public provaRunt() {

        Scanner scan = new Scanner(System.in);
        LocalDate t1 = LocalDate.now();
        LocalDate ettÅrSedan = t1.minusYears(1);
        String tempLine = "";
        String rad2 = "";
        String lolo = tempLine + " " + rad2;
        final String tempPath = "src/customers.txt";
        final String outputPath = "src/nyaKunderLoggade.txt";
        boolean test = false; //public boolean test = false;

        String svarNamn = "";




        System.out.println("Ange kundens för- och efternamn eller kundens personnummer: ");

        svarNamn = scan.next();









        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(tempPath));
            PrintWriter writer = new PrintWriter(
                    new BufferedWriter(new FileWriter(outputPath, true)));

            ArrayList<Person> nyperson = new ArrayList<>();

            while ((tempLine = reader.readLine()) != null) {

                tempLine.trim();
                rad2 = reader.readLine();
                List<String> lines = Files.readAllLines(Paths.get("src/customers.txt"));
                //System.out.println(lines);
                //lines.forEach(System.out::println);
                //System.out.println(Arrays.toString(lines.toArray()));


                String [] data = tempLine.split(",");
                nyperson.add(new Person(data[0],data[1], data[2]));

                //rad2.trim();
                //LocalDate membership = LocalDate.parse(rad2);

                //tempLine.
                //System.out.println(tempLine);
                for (Person p : nyperson ){
                    System.out.println(p);
                    if (p.getPersonNummer().equalsIgnoreCase("7603021234")){
                        System.out.println("TJAAAAAAA!");
                    }
                    else
                        System.out.println("WHAAAAAAAA");

                }


                if (tempLine.toLowerCase().contains(svarNamn.toLowerCase()) ) {
                    rad2.trim();
                    LocalDate membership = LocalDate.parse(rad2);



                    //System.out.println(tempLine.substring(12) + " " + reader.readLine());
                    System.out.println("Info: " + tempLine + " " + "Medlemskapsdatum: " + rad2);
                    //writer.println(tempLine + " " + t1);
                    //writer.close();
                    System.out.println(membership);
                    {
                        if (membership.isAfter(ettÅrSedan))
                            System.out.println("Du är aktiv medlem");
                        else
                            System.out.println(("Ditt medlemskap har utgått"));
                    }
                }

                //else if (svarNamn != tempLine){
                //System.out.println("11Du har inte varit medlem förr");
                //break;}









                /*
                String rad1 = reader.readLine();
                String rad2 = reader.readLine();
                int datum = Integer.parseInt(rad2);
                System.out.println(rad2);

                 */







            }


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
//HAr provat att lägga till fler olika sorters arrayförslag men inga funkar
//jag har även en Person class med kontruktor (personnummer, namn, medlemsdatum)
//listan man läser in består av an massa person info på två rader per person
//t.ex:
//7812122323, Inga Ingasson
//2013-10-09
//så mitt förlag på array är:
//
//ArrayList<Person> nyperson = new ArrayList<>();
//while ((tempLine = reader.readLine()) != null) {
//String [] data = tempLine.split(",");
//nyperson.add(new Person(data[0],data[1], data[2]));