import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.*;





/**
 * Created by: Ulf Nyberg
 * Date: 2020-10-11
 * Time: 08:12
 * Project: OOPJava Inlämningsuppgift02
 * Copyright: MIT
 */
public class provaRunt4 {

    final String tempPath = "src/customers.txt";
    final String outputPath = "src/nyaKunderLoggade.txt";

    public void readTwoLinesWriteToFileIfTall(Scanner sc, ArrayList<Person> nyperson){
        String firstLine = "";
        String secondLine = "";
        if(sc.hasNext()){
            firstLine = sc.nextLine();
            //nyperson.add(firstLine);
            if (sc.hasNext()) {
                secondLine = sc.nextLine();
            }}}






    public provaRunt4 () {

        //final String tempPath = "src/customers.txt";
        //final String outputPath = "src/nyaKunderLoggade.txt";

        Scanner scan = new Scanner(System.in);
        LocalDate t1 = LocalDate.now();
        LocalDate ettÅrSedan = t1.minusYears(1);
        String tempLine = "";
        String rad2 = "";
        ArrayList<Person> nyperson = new ArrayList<>();


        try(PrintWriter w = new PrintWriter(new BufferedWriter
                (new FileWriter(outputPath, true)));
            Scanner fileScanner = new Scanner(tempPath);){

            while(fileScanner.hasNext()){
               // readFromFileToList(fileScanner);
            }

            while(fileScanner.hasNext()){
               // readTwoLinesWriteToFileIfTall(fileScanner, w);
            }


        }
        catch (FileNotFoundException e){
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
            System.exit(0);
        }
        catch (IOException e){
            System.out.println("Det gick inte att skriva till fil");
            e.printStackTrace();
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }







    }










    public static void main(String[] args) {
        provaRunt4 laj = new provaRunt4();
    }




    }

    //PrintWriter writer = new PrintWriter(
//                    new BufferedWriter(new FileWriter(outputPath, true)));




/*
    public List<Person> generateListFromFile(String tempPath){
        List<Person> nyPerson = new ArrayList<>();
        try {

            Scanner sc = new Scanner(new File(tempPath));
            while(sc.hasNextLine()){
                String [] data = sc.delimiter().split(",");
                nyPerson.add(new Person(data[0], data [1], data [2]));  //sc.nextDouble()
            }
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }
        return nyPerson;

        for(Person p : nyPerson)
        if (p.equals("7603021234"))
            System.out.println("Yes", data [3]);

        System.out.println();
    }

     */
        /*
        ArrayList<Person> nyperson = new ArrayList<>();

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader(tempPath));


            while ((tempLine = reader.readLine()) != null) {
                String[] data = tempLine.split(",");
                nyperson.add(new Person(data[0], data[1], data [2]));


            }

        } catch (Exception e) {
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.out.flush();
            System.exit(0);
        }

        for (Person p : nyperson)
            System.out.println(p);

         */
