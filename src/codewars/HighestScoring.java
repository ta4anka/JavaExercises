package codewars;

/*
Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to it's position in the alphabet:
a = 1, b = 2, c = 3 etc.
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid*/

public class HighestScoring {
    public static String high(String s) {
        int asciiCounter = 0;
        int TempAsciiCounter = 0;
        String MaxWord = "";
        String [] SetOfWords = s.split(" ");

        for(int i = 0; i < SetOfWords.length; i++){
            char [] OneWord = SetOfWords[i].toCharArray();
            for(int j = 0; j < OneWord.length; j++){

                int ascii = OneWord[j] - 96;
                asciiCounter += ascii;
                }
                if(asciiCounter>TempAsciiCounter){
                TempAsciiCounter = asciiCounter;
                MaxWord = SetOfWords[i];
            }
            asciiCounter = 0;
            }
            return MaxWord;
    }

    public static void main(String[] args) {
        System.out.println(high("what time are we climbing up to the volcano")); // volcano
    }
}
