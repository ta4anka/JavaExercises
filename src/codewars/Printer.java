package codewars;
/*In a factory a printer prints labels for boxes. For one kind of boxes the printer
has to use colors which,
for the sake of simplicity, are named with letters from a to m.
The colors used by the printer are recorded in a control string.
For example a "good" control string would be aaabbbbhaijjjm
meaning that the printer used three times color a, four times color b,
one time color h then one time color a...
Sometimes there are problems: lack of colors, technical malfunction and
a "bad" control string is produced e.g. aaaxbbbbyyhwawiwjjjwwm.
You have to write a function printer_error which given a string will
output the error rate of the printer as a string representing a
rational whose numerator is the number of errors and the denominator
the length of the control string. Don't reduce this fraction to a simpler expression.
The string has a length greater or equal to one and contains only letters from a to z.
#Examples:
s="aaabbbbhaijjjm"
error_printer(s) => "0/14"
s="aaaxbbbbyyhwawiwjjjwwm"
error_printer(s) => "8/22"*/

/*info:
The basic English alphabet is mapped in Unicode to the same numerical
value as the plain old ASCII:
The range A-Z is mapped to [65-90] (or [0x41-0x5a] in hex),
and [a-z] is mapped to [97-122] (hex [0x61-0x7a]).*/

import java.io.UnsupportedEncodingException;

public class Printer {

    public static String printerError(String s) {
// converting String to array of ASCII value of a characters:
        int [] asciiArray = new int[s.length()];
        for(int i = 0;i<asciiArray.length;i++){
            asciiArray[i] = s.charAt(i);
        }
        // getting ascii value of range(from a to m):
        int asciiA = 'a';
        int asciiM = 'm';

        int counter=0;
        for (int value : asciiArray) {
            if (value < asciiA || value > asciiM) {
                counter++;
            }
        }
        return counter+"/"+asciiArray.length;
    }

    public static void main(String[] args){
        System.out.println(printerError("aaabbbbhaijjjm"));
        System.out.println(printerError("aaaxbbbbyyhwawiwjjjwwm"));
    }
}


/* Best solution:
public class Printer {
public static String printerError(String s) {
        String errors = s.replaceAll("[a-m]",""); //using Regex --> public String replaceAll(String regex, String replacement)
        return "" + errors.length() + "/" + s.length();
    }
}*/
