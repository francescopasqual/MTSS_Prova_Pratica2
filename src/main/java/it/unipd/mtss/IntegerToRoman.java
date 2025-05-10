////////////////////////////////////////////////////////////////////
// FRANCESCO PASQUAL 2103119
// MARCO PIRO 2068075
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) {
        if (number < 1 || number > 1000) {
            throw new IllegalArgumentException("Number must be between 1 and 1000");
        }

        String[] romanNumerals = {
            "M", "CM", "D", "CD", "C", "XC", "L",
            "XL", "X", "IX", "V", "IV", "I"
        };
        int[] values = {
            1000, 900, 500, 400, 100, 90, 50,
            40, 10, 9, 5, 4, 1
        };

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result.append(romanNumerals[i]);
            }
        }

        return result.toString();
    }
}