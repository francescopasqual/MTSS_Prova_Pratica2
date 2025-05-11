////////////////////////////////////////
// Francesco Pasqual 2103119
// Marco Piro 2068075
////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.lang.reflect.Method;

import org.junit.Before;
import org.junit.Test;

public class RomanPrinterTest {

    RomanPrinter romanPrinter;
    Method printAsciiArt;

    // Set up the test
    @Before
    public void setUp() throws Exception {
        romanPrinter = new RomanPrinter();
        printAsciiArt = RomanPrinter.class.getDeclaredMethod("printAsciiArt", String.class);
        printAsciiArt.setAccessible(true);
    }

    // Make access to private method
    public String RomanPrinter_printAsciiArt(String romanNumber) {
        if(printAsciiArt != null){
            try {
                return (String) printAsciiArt.invoke(romanPrinter, romanNumber);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "";
    }

    // Check if the public method works
    @Test
    public void checkRomanPrint() {
        assertNotEquals("", RomanPrinter.print(1));
        assertNotEquals("", RomanPrinter.print(19));
        assertNotEquals("", RomanPrinter.print(100));
        assertNotEquals("", RomanPrinter.print(715));
        assertNotEquals("", RomanPrinter.print(999));
        assertNotEquals("", RomanPrinter.print(518));
        assertNotEquals("", RomanPrinter.print(567));
        assertNotEquals("", RomanPrinter.print(10));
        assertNotEquals("", RomanPrinter.print(56));
        assertNotEquals("", RomanPrinter.print(42));
        assertNotEquals("", RomanPrinter.print(37));
        assertNotEquals("", RomanPrinter.print(666));

    }

    // Check if the private method works
    @Test
    public void checkPrivateMethodOfPrint() {
        assertEquals("", RomanPrinter_printAsciiArt(""));
        assertEquals("", RomanPrinter_printAsciiArt(null));
        assertEquals("",RomanPrinter_printAsciiArt("A"));
    }

    // 
    @Test(timeout=1000)
    public void test() {
        for(int i = 1; i<=1000; i++){
            System.out.println(RomanPrinter.print(i) + "- " + i);
        }
    }
}