package codewars;

/*  Complete the method/function so that it converts dash/underscore delimited words into camel casing.
The first word within the output should be capitalized only if the original word was capitalized.
Examples
toCamelCase("the-stealth-warrior"); // returns "theStealthWarrior"
toCamelCase("The_Stealth_Warrior"); // returns "TheStealthWarrior"  */

class toCamelCase{
    static String toCamelCase(String s) {
        String newStr = "";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '-' || c == '_') {
                newStr += ("" + s.charAt(i+1)).toUpperCase();
                i++; // skipping lower letter;
                } else {
                newStr += c;
            }
        }
        return newStr;
    }
    public static void main(String[] args) {
        System.out.println(toCamelCase("the-stealth-warrior"));
        System.out.println(toCamelCase("The_Stealth_Warrior"));
    }
}

