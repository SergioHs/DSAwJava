package Binary;

public class MultiplyByTwo {

    /*
        Multiply a number by 2 using bitwise operations
        Statement: Given a number n, return n * 2 without using *.
        Input: n = 6
        Output: 12
        Complexity: O(1) time, O(1) space
     */


    public static int MultiplyByTwoFn(int num){
        return num << 1;

    }


    public static void main(String[] args){
        System.out.println("2 times 2 is: " + MultiplyByTwoFn(2));
        System.out.println("8 times 2 is: " + MultiplyByTwoFn(8));
        System.out.println("9 times 2 is: " + MultiplyByTwoFn(9));

    }
}
