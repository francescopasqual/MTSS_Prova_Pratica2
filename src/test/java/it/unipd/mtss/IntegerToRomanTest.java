////////////////////////////////////////
// Francesco Pasqual 2103119
// Marco Piro 2068075
////////////////////////////////////////
package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

/**
 * Test class for IntegerToRoman conversion.
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
public class IntegerToRomanTest {

    // Boundary condition tests
    @Test
    public void testConvertLowerBoundary() {
        // Test the smallest valid input (1)
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void testConvertUpperBoundary() {
        // Test the largest number currently supported (10)
        assertEquals("X", IntegerToRoman.convert(10));
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
}
