////////////////////////////////////////
// Francesco Pasqual 2103119
// Marco Piro 2068075
////////////////////////////////////////
package it.unipd.mtss;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Test class for RomanPrinter.
 * Tests follow A-TRIP principles:
 * - Automatic: Can be run without manual intervention
 * - Thorough: Tests all possible scenarios
 * - Repeatable: Consistent results on each run
 * - Independent: Each test works on its own
 * - Professional: Well-structured and documented
 *
 * And BICEP principles:
 * - Boundary conditions: Tests boundary values
 * - Inverse relationships: Tests relationships between input and output
 * - Cross-check: Verifies results using alternate means
 * - Error conditions: Tests error handling
 * - Performance: Considers efficiency (where relevant)
 */
public class RomanPrinterTest {

    private static final String I_ASCII = " _____ \n|_   _|\n  | |  \n  | |  \n _| |_ \n|_____|\n";
    private static final String V_ASCII = "__      __\n\\ \\    / /\n \\ \\  / / \n  \\ \\/ /  \n   \\  /   \n    \\/    \n";
    private static final String X_ASCII = "__   __\n\\ \\ / /\n \\ V / \n  > <  \n / . \\ \n/_/ \\_\\\n";
    private static final String L_ASCII = "  _      \n | |     \n | |     \n | |     \n | |____ \n |______|\n";
    private static final String C_ASCII = "   _____ \n"
                                    + "  / ____|\n"
                                    + " | |     \n"
                                    + " | |     \n"
                                    + " | |____ \n"
                                    + "  \\_____|\n";

    @Test
    public void testPrint_I() {
        assertEquals(I_ASCII, RomanPrinter.print(1));
    }

    @Test
    public void testPrint_II() {
        String result = RomanPrinter.print(2);
        assertTrue(result.startsWith(" _____  _____ "));
        assertEquals(6, result.split("\n").length);
    }

    @Test
    public void testPrint_III() {
        String result = RomanPrinter.print(3);
        assertTrue(result.startsWith(" _____  _____  _____ "));
        assertEquals(6, result.split("\n").length);
    }

    @Test
    public void testPrint_IV() {
        String result = RomanPrinter.print(4);
        assertTrue(result.contains(" _____ ")); // I
        assertTrue(result.contains("__      __")); // V
    }

    @Test
    public void testPrint_V() {
        assertEquals(V_ASCII, RomanPrinter.print(5));
    }

    @Test
    public void testPrint_VI() {
        String result = RomanPrinter.print(6);
        assertTrue(result.contains("__      __")); // V
        assertTrue(result.contains(" _____ ")); // I
    }

    @Test
    public void testPrint_VII() {
        String result = RomanPrinter.print(7);
        assertEquals(6, result.split("\n").length);
        assertTrue(result.contains("__      __")); // V
        assertEquals(2, countOccurrences(result, " _____ ")); // II after V
    }

    @Test
    public void testPrint_VIII() {
        String result = RomanPrinter.print(8);
        assertEquals(6, result.split("\n").length);
        assertTrue(result.contains("__      __")); // V
        assertEquals(3, countOccurrences(result, " _____ ")); // III after V
    }

    @Test
    public void testPrint_IX() {
        String result = RomanPrinter.print(9);
        assertTrue(result.contains(" _____ ")); // I
        assertTrue(result.contains("__   __")); // X
    }

    @Test
    public void testPrint_X() {
        assertEquals(X_ASCII, RomanPrinter.print(10));
    }

    @Test
    public void testPrint_L() {
        assertEquals(L_ASCII, RomanPrinter.print(50));
    }

    @Test
    public void testPrint_C() {
        assertEquals(C_ASCII, RomanPrinter.print(100));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintWithZero() {
        RomanPrinter.print(0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintWithNegativeNumber() {
        RomanPrinter.print(-1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testPrintTooLargeNumber() {
        RomanPrinter.print(4000);
    }

    @Test
    public void testCorrectLineCountForAll() {
        for (int i = 1; i <= 10; i++) {
            String result = RomanPrinter.print(i);
            assertEquals(6, result.split("\n").length);
        }
    }

    @Test
    public void testNoNullOrEmptyOutput() {
        for (int i = 1; i <= 10; i++) {
            String result = RomanPrinter.print(i);
            assertNotNull(result);
            assertFalse(result.isEmpty());
        }
    }

    @Test
    public void testPrint_AllNumbersFromIntegerToRomanTest() {
        int[] numbers = {
            1, 2, 3, 4, 5, 6, 7, 8, 9, 10,
            15, 20, 25, 33, 35, 38, 40, 45, 50, 55, 60,
            64, 68, 77, 80, 81, 100
        };
        for (int n : numbers) {
            String result = RomanPrinter.print(n);
            assertNotNull("Output should not be null for n=" + n, result);
            assertFalse("Output should not be empty for n=" + n, result.isEmpty());
            assertEquals("Output should have 6 lines for n=" + n, 6, result.split("\n").length);
        }
    }

    // Helper method to count occurrences of a substring
    private int countOccurrences(String str, String substr) {
        int count = 0, idx = 0;
        while ((idx = str.indexOf(substr, idx)) != -1) {
            count++;
            idx += substr.length();
        }
        return count;
    }
}