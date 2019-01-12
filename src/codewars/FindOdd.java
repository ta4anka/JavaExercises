package codewars;
/*
Given an array, find the int that appears an odd number
of times.
There will always be only one integer that appears an odd
number of times.
{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5} --> 5
*/
public class FindOdd {
    public static int findIt(int[] a) {
        int counter;
        int findNumber = 0;
        for(int i = 0; i < a.length; i++){
            counter = 0;
            for( int j = 0;j < a.length; j++){
                if(a[i] == a[j]){
                    counter++;
                }
            }
            if(counter % 2 == 1){
                findNumber = a[i];
                break;
            }
        }
        return findNumber;
    }

    public static void main(String[] args) {
        int [] testArr = {20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5};
        System.out.println(findIt(testArr));
    }
}


/* from the site:
public class FindOdd {
    public static int findIt(int[] A) {
        int xor = 0;
        for (int i = 0; i < A.length; i++) {
            xor ^= A[i];
        }
        return xor;
    }
}*/
