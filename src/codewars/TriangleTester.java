package codewars;

/*Implement a method that accepts 3 integer values a, b, c.
The method should return true if a triangle can be built with the sides of given length
 and false in any other case.
 (In this case, all triangles must have surface greater than 0 to be accepted).*/


/*
The triangle inequality states:
 for any triangle, the sum of the lengths of any two sides must be greater
than or equal to the length of the remaining side.

 */

public class TriangleTester{
    public static boolean isTriangle(int a, int b, int c){
        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        }
        if (a + b > c && a + c > b && b + c >a) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isTriangle(1,1,2)); // false
        System.out.println(isTriangle(1,2,2));// true

    }
}
