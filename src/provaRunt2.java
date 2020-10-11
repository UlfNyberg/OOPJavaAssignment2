import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class provaRunt2 {

    public List<Person> movi;

    public static void main(String[] args) {
        Person m = new Person();
        //m.textFileToArrayList();
    }

    public void textFileToArrayList() {
        movi = new ArrayList<Person>();
        BufferedReader br = null;
        Person e = null;
        try {
            br = new BufferedReader(new FileReader("src/customers.txt"));
        } catch (FileNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }
        String line;
        try {
            while ((line = br.readLine()) != null) {
                String data[] = line.split(",");
                e = new Person();
                e.setPersonNummer(data[0]);
                e.setNamn(data[1]);
                e.setMedlemsDatum(data[2]);

                movi.add(e);
            }
            for(Person i : movi){
                System.out.println(i.getPersonNummer()+","+i.getNamn()+","+i.getMedlemsDatum());
            }
            br.close();

        } catch (IOException io) {
            io.printStackTrace();
        }}}

