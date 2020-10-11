/**
 * Created by: Ulf Nyberg
 * Date: 2020-10-10
 * Time: 15:58
 * Project: OOPJava Inlämningsuppgift02
 * Copyright: MIT
 */
public class Person {
    protected String personNummer;
    protected String namn;
    protected String medlemsDatum;

    public Person(){}

    public Person (String personNummer, String namn, String medlemsDatum){
        this.personNummer = personNummer;
        this.namn = namn;
        this.medlemsDatum = medlemsDatum;
    }

    public Person (String personNummer, String namn){  //TILLFÄLLIG!
        this.personNummer = personNummer;
        this.namn = namn;}



    public String getMedlemsDatum(){
        return medlemsDatum;
    }

    public String getNamn(){
        return namn;
    }

    public String getPersonNummer() {
        return personNummer;
    }

    public void setPersonNummer(String personNummer) {
        this.personNummer = personNummer;
    }

    public void setNamn(String namn) {
        this.namn = namn;
    }

    public void setMedlemsDatum(String medlemsDatum) {
        this.medlemsDatum = medlemsDatum;
    }
}
