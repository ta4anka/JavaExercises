package codewars;

/*You are given an odd-length array of integers, in which all of them are the same,
except for one single number.
Complete the method which accepts such an array, and returns that single different number.
The input array will always be valid! (odd-length >= 3)
Examples
[1, 1, 2] ==> 2
[17, 17, 3, 17, 17, 17, 17] ==> 3*/


import java.util.Arrays;

public class StrayNumber {
    static int stray(int[] numbers) {
        Arrays.sort(numbers);
        int searchedNumber = numbers[numbers.length - 1];
        for (int i = 0; i < numbers.length - 1; i += 2) {
            if (numbers[i] != numbers[i + 1]) {
                searchedNumber = numbers[i];
            }else if(numbers[i] == numbers[i + 1]){
                continue;
            }
            else {
                searchedNumber = numbers[numbers.length - 1];
            }
        }
        return searchedNumber;
    }

    public static void main(String[] args) {
        int [] some = {17, 17, 34, 17,17};
        System.out.println(stray(some) == 34);
        int [] some1 = {17, 17, 3, 17,17};
        System.out.println(stray(some1) == 3);
    }
}


/* from site:
class StrayNumber  {
    static int stray(int[] numbers) {
        int ret = 0;
        for(int i : numbers) ret ^= i;
        return ret;
    }
}*/
