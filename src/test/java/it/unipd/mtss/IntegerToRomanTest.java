////////////////////////////////////////
// Francesco Pasqual 2103119
// Marco Piro 2068075
////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import org.junit.Test;

public class IntegerToRomanTest {

    // Boundary condition tests
    @Test
    public void testConvertLowerBoundary() {
        // Test the smallest valid input (1)
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvertUpperBoundary() {
        // Test the largest number currently supported (100)
        assertEquals("C", IntegerToRoman.convert(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertZero() {
        // Error condition: Zero is not a valid Roman numeral
        IntegerToRoman.convert(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertNegative() {
        // Error condition: Negative numbers aren't valid Roman numerals
        IntegerToRoman.convert(-5);
    }

    // Thorough tests for all values 1-10
    @Test
    public void testConvertOne() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvertTwo() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void testConvertThree() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void testConvertFour() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void testConvertFive() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void testConvertSix() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void testConvertSeven() {
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void testConvertEight() {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void testConvertNine() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void testConvertTen() {
        assertEquals("X", IntegerToRoman.convert(10));
    }
// test per arrivare fino a 100 a passi di 5
    @Test 
    public void testConvertFifteen() {
        assertEquals("XV", IntegerToRoman.convert(15));
    }

    @Test   
    public void testConvertTwenty() {
        assertEquals("XX", IntegerToRoman.convert(20));
    }

    @Test
    public void testConvertTwentyFive() {
        assertEquals("XXV", IntegerToRoman.convert(25));
    }

    @Test
    public void testConvertThirtyThree() {
        assertEquals("XXXIII", IntegerToRoman.convert(33));
    }

    @Test
    public void testConvertThirtyFive() {
        assertEquals("XXXV", IntegerToRoman.convert(35));
    }

    @Test 
    public void testConvertThirtyEight() {
        assertEquals("XXXVIII", IntegerToRoman.convert(38));
    }

    @Test
    public void testConvertForty() {
        assertEquals("XL", IntegerToRoman.convert(40));
    }

    @Test
    public void testConvertFortyFive() {
        assertEquals("XLV", IntegerToRoman.convert(45));
    }

    @Test
    public void testConvertFifty() {
        assertEquals("L", IntegerToRoman.convert(50));
    }

    @Test
    public void testConvertFiftyFive() {
        assertEquals("LV", IntegerToRoman.convert(55));
    }

    @Test
    public void testConvertSixty() {
        assertEquals("LX", IntegerToRoman.convert(60));
    }

    // adesso a passi di 4
    @Test
    public void testConvertSixtyFour() {
        assertEquals("LXIV", IntegerToRoman.convert(64));
    }

    @Test
    public void testConvertSixtyEight() {
        assertEquals("LXVIII", IntegerToRoman.convert(68));
    }

    @Test
    public void testConvertSeventySeven() {
        assertEquals("LXXVII", IntegerToRoman.convert(77));
    }

    @Test
    public void testConvertEighty() {
        assertEquals("LXXX", IntegerToRoman.convert(80));
    }

    @Test
    public void testConvertEightyOne() {
        assertEquals("LXXXI", IntegerToRoman.convert(81));
    }


    // Test parametrizzato per numeri da 100 a 1000
    @Test
    public void testConvertHundredsToThousand() {
        // Array di test cases con input e output atteso
        Object[][] testCases = {
            {100, "C"},
            {200, "CC"},
            {300, "CCC"},
            {400, "CD"},
            {500, "D"},
            {600, "DC"},
            {700, "DCC"},
            {800, "DCCC"},
            {900, "CM"},
            {1000, "M"}
        };
        
        // Test dei casi principali
        for (Object[] testCase : testCases) {
            int input = (int) testCase[0];
            String expected = (String) testCase[1];
            assertEquals(expected, IntegerToRoman.convert(input));
        }

        // Test sistematico ogni 50 numeri
        for (int i = 100; i < 1000; i += 50) {
            String result = IntegerToRoman.convert(i);
            // Verifica che il risultato non sia vuoto
            assertTrue("Conversion failed for " + i, result != null && !result.isEmpty());
        }

        // Test specifici per casi particolari
        assertEquals("CDXLIV", IntegerToRoman.convert(444));
        assertEquals("CDXCIX", IntegerToRoman.convert(499));
        assertEquals("DCXCIX", IntegerToRoman.convert(699));
        assertEquals("CMXCIX", IntegerToRoman.convert(999));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testConvertAboveThousand() {
        IntegerToRoman.convert(1001);
    }
}

