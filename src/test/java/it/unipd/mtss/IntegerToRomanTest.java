////////////////////////////////////////
// Francesco Pasqual 2103119
// Marco Piro 2068075
////////////////////////////////////////

package it.unipd.mtss;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.Test;

public class IntegerToRomanTest {

    @Test
    public void shouldReturnIWhenConverting1() {
        assertEquals("I", IntegerToRoman.convert(1));
    }

    @Test
    public void shouldReturnIIWhenConverting2() {
        assertEquals("II", IntegerToRoman.convert(2));
    }

    @Test
    public void shouldReturnIIIWhenConverting3() {
        assertEquals("III", IntegerToRoman.convert(3));
    }

    @Test
    public void shouldReturnIVWhenConverting4() {
        assertEquals("IV", IntegerToRoman.convert(4));
    }

    @Test
    public void shouldReturnVWhenConverting5() {
        assertEquals("V", IntegerToRoman.convert(5));
    }

    @Test
    public void shouldReturnVIWhenConverting6() {
        assertEquals("VI", IntegerToRoman.convert(6));
    }

    @Test
    public void shouldReturnVIIWhenConverting7() {
        assertEquals("VII", IntegerToRoman.convert(7));
    }

    @Test
    public void shouldReturnVIIIWhenConverting8() {
        assertEquals("VIII", IntegerToRoman.convert(8));
    }

    @Test
    public void shouldReturnIXWhenConverting9() {
        assertEquals("IX", IntegerToRoman.convert(9));
    }

    @Test
    public void shouldReturnXWhenConverting10() {
        assertEquals("X", IntegerToRoman.convert(10));
    }

    @Test
    public void shouldReturnMWhenConverting1000() {
        assertEquals("M", IntegerToRoman.convert(1000));
    }

    @Test
    public void shouldThrowExceptionWhenConverting0() {
        assertThrows(IllegalArgumentException.class,
            () -> IntegerToRoman.convert(0));
    }

    @Test
    public void shouldThrowExceptionWhenConvertingNegative() {
        assertThrows(IllegalArgumentException.class,
            () -> IntegerToRoman.convert(-1));
    }

    @Test
    public void shouldThrowExceptionWhenConvertingAboveLimit() {
        assertThrows(IllegalArgumentException.class,
            () -> IntegerToRoman.convert(1001));
    }
}