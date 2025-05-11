////////////////////////////////////////
// Francesco Pasqual 2103119
// Marco Piro 2068075
////////////////////////////////////////
package it.unipd.mtss;
  
public class IntegerToRoman {
    private static final int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] symbols = {"M", "CM", "D", "CD","C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"}; 
    
    public static String convert(int number) {
        if (number <= 0 || number > 1000) {
            throw new IllegalArgumentException("Number must be between 1 and 1000");
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