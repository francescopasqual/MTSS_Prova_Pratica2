////////////////////////////////////////
// Francesco Pasqual 2103119
// Marco Piro 2068075
////////////////////////////////////////
package it.unipd.mtss;

public class RomanPrinter {

    public static String print(int num) {
        return printAsciiArt(IntegerToRoman.convert(num));
    }

    private static String printAsciiArt(String romanNumber) {
        if (romanNumber == null || romanNumber.isEmpty()) {
            throw new IllegalArgumentException("Roman number cannot be null or empty");
        }

        StringBuilder result = new StringBuilder();
        String[] lines = new String[6]; // 6 lines for each ASCII art character
        for (int i = 0; i < 6; i++) {
            lines[i] = "";
        }

        for (char c : romanNumber.toCharArray()) {
            switch (c) {
                case 'I':
                    lines[0] += " _____ ";
                    lines[1] += "|_   _|";
                    lines[2] += "  | |  ";
                    lines[3] += "  | |  ";
                    lines[4] += " _| |_ ";
                    lines[5] += "|_____|";
                    break;
                case 'V':
                    lines[0] += "__      __";
                    lines[1] += "\\ \\    / /";
                    lines[2] += " \\ \\  / / ";
                    lines[3] += "  \\ \\/ /  ";
                    lines[4] += "   \\  /   ";
                    lines[5] += "    \\/    ";
                    break;
                case 'X':
                    lines[0] += "__   __";
                    lines[1] += "\\ \\ / /";
                    lines[2] += " \\ V / ";
                    lines[3] += "  > <  ";
                    lines[4] += " / . \\ ";
                    lines[5] += "/_/ \\_\\";
                    break;

                case 'L':
                    lines[0] += "  _      ";
                    lines[1] += " | |     ";
                    lines[2] += " | |     ";
                    lines[3] += " | |     ";
                    lines[4] += " | |____ ";
                    lines[5] += " |______|";
                    break;

                case 'C':
                    lines[0] += "   _____ ";
                    lines[1] += "  / ____|";
                    lines[2] += " | |     ";
                    lines[3] += " | |     ";
                    lines[4] += " | |____ ";
                    lines[5] += "  \\_____|";
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported Roman numeral: " + c);
            }
        }

        // Combine all lines
        for (String line : lines) {
            result.append(line).append("\n");
        }

        return result.toString();
    }
}


