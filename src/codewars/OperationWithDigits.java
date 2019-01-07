package codewars;


public class OperationWithDigits {

    public static int FindSumOfDigits(int number){
        int sum = 0;

        while(number > 0){
            sum += number%10;
            number /= 10;
        }
        return sum;
    }

    public static int FindSumOfDigits2(int number){
        int sum = 0;
        for(; number> 0;number/= 10){
            sum += number%10;
        }
        return sum;
    }

    public static int FindCountOfDigits(int number){
        return Integer.toString(number).length();
    }

    public static int FindCountOfDigits2(int number){
        int count = 0;

        while(number != 0) {
            number /= 10;
            ++count;
        }
        return count;
    }

    public static int FindCountOfDigits3(int number){
        int count = 0;
        for(; number != 0; number /= 10, count++){
            //empty body!
            }
        return count;
    }

// -------------------------------------------------------------
    public static void main(String[] args) {
        System.out.println(FindSumOfDigits(135)); // 9
        System.out.println(FindSumOfDigits2(135)); // 9

        System.out.println(FindCountOfDigits(135)); // 3
        System.out.println(FindCountOfDigits2(135)); // 3
        System.out.println(FindCountOfDigits3(135)); // 3
    }
}
