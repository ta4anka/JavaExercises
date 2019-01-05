package codewars;
/*Task
Given a list lst and a number N, create a new list that contains each number of
lst at most N times without reordering. For example if N = 2, and the input is
[1,2,3,1,2,1,2,3], you take [1,2,3,1,2], drop the next [1,2]
since this would lead to 1 and 2 being in the result 3 times,
and then take 3, which leads to [1,2,3,1,2,3].
Example
EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3)
// return [1, 1, 3, 3, 7, 2, 2, 2]*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public  class EnoughIsEnough {

    public static int[]  deleteNth(int[] elements, int maxOccurrences) {
        if(maxOccurrences <= 0){
            return new int[0];
        }
        List<Integer> aList = new ArrayList<>();
        for(int i: elements)
        {
            aList.add(i);
        }
        //===========================================
        int counter;
        for(int i = 0; i < aList.size(); i++){
            counter = 0;
            for(int j = 0; j < aList.size(); j++){
                if(aList.get(i).equals(aList.get(j))){
                    counter++;
                    if(counter > maxOccurrences)
                    aList.remove(j);
                }
            }
        }
        int [] resultArr = new int[aList.size()];
        for(int i = 0; i < aList.size(); i++){
            resultArr[i] = aList.get(i);
        }
        return resultArr;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(deleteNth(new int[]{20,37,20,21}, 1)));

    }
}
