////////////////////////////////////////
// Francesco Pasqual 2103119
// Marco Piro 2068075
////////////////////////////////////////
package it.unipd.mtss;
  
public class IntegerToRoman {
    private static final int[] values = {10, 9, 5, 4, 1};
    private static final String[] symbols = {"X", "IX", "V", "IV", "I"};
    
    public static String convert(int number) {
    if (number <= 0) {
        throw new IllegalArgumentException("Number must be greater than 0");
    }

    StringBuilder roman = new StringBuilder();
    for (int i = 0; i < values.length && number >= 0; i++) {
        while (values[i] <= number) {
            number -= values[i];
            roman.append(symbols[i]);
        }
    }
    return roman.toString();
    }
}