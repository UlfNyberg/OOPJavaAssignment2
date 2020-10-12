import org.junit.Test;

import java.io.*;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


/**
 * Created by: Ulf Nyberg
 * Date: 2020-10-09
 * Time: 08:27
 * Project: OOPJava Inlämningsuppgift02
 * Copyright: MIT
 */
public class TestDemoTest {

    public TestDemo td = new TestDemo();

    @Test
    public final void kollaSåAttRättFilÄrInputFilAvMedlemmarTest (){
        assertTrue(td.tempPath.equals("src/customers.txt"));
        assertFalse(td.tempPath.equals("src/nyaKunderLoggade.txt"));

    }

    @Test
    public final void kollaSåAttRättFilÄrOutputFilAvBesökandeMedlemmarTest (){
        assertTrue(td.outputPath.equals("src/nyaKunderLoggade.txt"));
        assertFalse(td.outputPath.equals("src/customers.txt"));
    }

    @Test
    public final void kollaKundInfoStartarMedVittTeckenTest(){
        assertTrue(td.kundPersonNummerOchNamn.equals(""));
        assertNotNull(td.kundPersonNummerOchNamn);
        assertTrue(td.kundMedlemsDatum.equals(""));
        assertNotNull(td.kundMedlemsDatum);
    }

    @Test
    public final void printWriterTillTestFilTest() throws IOException {
        String outputPath = "Test/tempTest.txt";
        PrintWriter writer = new PrintWriter
                (new BufferedWriter(new FileWriter(outputPath)));
        writer.println("Printout-testet funkade och testades lyckat den " + LocalDate.now());
        writer.close();
        assertTrue(!outputPath.isEmpty());
    }


    @Test
    public final void inteMedlemAvbrytProgramOutputTest () {
        //att boolean 'personenFinns' är false i startläget
        assertTrue((!td.personenFinns));
        assertFalse((td.personenFinns));

    }

    @Test
    public final void medlemsInfoMeddelandeTest(){
        assertTrue(td.medlemsInfoMeddelande("19910101111, John Lee Hooker",
                "1968-01-01").equals("Info (Personnummer och namn): " +
                "19910101111, John Lee Hooker" + "\n"
                + "Senaste betaldatum för medlemskap: " + "1968-01-01"));
        assertFalse(td.medlemsInfoMeddelande("19910101111, John Lee Hooker",
                "1968-01-01").equals("Info  " +
                "19910101111, John Lee Hooker" + "\n"
                + "Senaste  " + "1968-01-01"));;
    }

    @Test
    public final void fileReaderTillTestFilTest () throws FileNotFoundException {
        String tempPath = "Test/tempTest.txt";
        BufferedReader reader = new BufferedReader(
                    new FileReader(tempPath));
        assertTrue(!tempPath.isEmpty());
        assertFalse(td.tempPath.isBlank());

    }





}
