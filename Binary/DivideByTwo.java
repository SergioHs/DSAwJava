package Binary;

public class DivideByTwo {
    /*
        Divide a number by 2 using bitwise operations
        Statement: Given a number n, return n / 2 without using /.
        Input: n = 10
        Output: 5
        Complexity: O(1) time, O(1) space
     */

    public static int DivideByTwoFn(int num){
        return num >> 1;
    }



    public static void main(String[] args){
        System.out.println("2 divided by 2 is " + DivideByTwoFn(2));
        System.out.println("1028 divided by 2 is " + DivideByTwoFn(1028));

    }







}
