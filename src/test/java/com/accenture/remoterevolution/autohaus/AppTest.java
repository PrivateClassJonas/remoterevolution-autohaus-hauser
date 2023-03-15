package com.accenture.remoterevolution.autohaus;

import static org.junit.Assert.assertTrue;

import com.accenture.remoterevolution.autohaus.commando.ShowCommand;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * Unit test for simple App.
 */
public class AppTest {
    /**
     * Rigorous Test :-)
     */

    @BeforeEach
    void setup(){

    }
    @Test
    public void testShowCommandTrue() {
        List<Kraftfahrzeug> testListe = new ArrayList<>();
        Auto testAuto1 = new Auto(Marken.BMW, "testAuto1", 1);
        testListe.add(testAuto1);

        ShowCommand testShowCommand = new ShowCommand(testListe);
        String testInput = "show";
        Scanner testScanner = new Scanner(System.in);

        //try {
        if (testShowCommand.shouldExecute(testInput)) {
            testShowCommand.execute();
            String testOutput = "";
            int testIndex = 3;

            for (int i = 0; i < testIndex; i++) {
                testOutput += testScanner.nextLine() + "/";
            }

            assertTrue(true);
        }

        //}catch(Exception e){

        //}

        //assertTrue( true );
    }


}
