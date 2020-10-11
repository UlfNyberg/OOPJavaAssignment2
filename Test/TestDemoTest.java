import org.junit.Test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
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
    public final void dostuff1 (){
        assertTrue(td.tempPath.equals("src/customers.txt"));
        //assert

    }

    @Test
    public final void dostuff2 (){
        //assertTrue(td.kundPersonNummerOchNamn.equals(""));
        //assertNotNull(td.kundPersonNummerOchNamn);
        //assertTrue(td.inteMedlemAvbrytProgram());

    }

    @Test
    public final void dostuff3 (){
        final String outputPath;
       // PrintWriter writer = new PrintWriter(
               // new BufferedWriter(new FileWriter(outputPath, true)));
        //writer.println("Testet funkar och testades" + LocalDate.now());
        //writer.close();

    }

    @Test
    public final void isAdditionCorrect (){
        assertTrue(3+3 == 6);
    }


}
