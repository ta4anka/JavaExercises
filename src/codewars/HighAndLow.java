package codewars;
/*
In this little assignment you are given a string of space separated numbers,
and have to return the highest and lowest number.
Example:
HighAndLow("1 2 3 4 5")  // return "5 1"
HighAndLow("1 2 -3 4 5") // return "5 -3"
HighAndLow("1 9 3 4 -5") // return "9 -5"
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighAndLow {
    public static String HighAndLowFind(String numbers) {

        String[] sepStr = numbers.split(" ");
        int[] arr = new int[sepStr.length];
        List<Integer> aList = new ArrayList<>();

        for (String aSepStr : sepStr) {
            aList.add(Integer.parseInt(aSepStr));
        }

        int max = Collections.max(aList);
        int min = Collections.min(aList);

        return max + " " + min;
    }

    public static void main(String[] args) {
        System.out.println(HighAndLowFind("1 9 3 4 -5"));
    }

}


/* from the site

import java.util.Arrays;

public class Kata  {
    public static String HighAndLow(String numbers) {

        int min = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .min()
                .getAsInt();

        int max = Arrays.stream(numbers.split(" "))
                .mapToInt(i -> Integer.parseInt(i))
                .max()
                .getAsInt();

        return String.format("%d %d", max, min);
    }
}*/
