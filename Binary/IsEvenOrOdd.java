package Binary;

public class IsEvenOrOdd {
    /*
        Check if a number is even or odd
        Statement: Given an integer n, determine whether it is even or odd using bitwise operations.
        Input: n = 11
        Output: Odd
        Input: n = 128
        Output: Even
        Complexity: O(1) time, O(1) space
     */

    public static String IsEvenOrOddFn(int num){

        //simplified solution
        /*if((num & 1) == 0){
            return "Even";
        } else {
            return "Odd";
        }*/


        if(((num >> 0) & 1) == 0){
            return "Even";
        } else {
            return "Odd";
        }
    }

    public static void main(String[] args){

        System.out.println("11 is: " + IsEvenOrOddFn(11));
        System.out.println("128 is: " + IsEvenOrOddFn(128));

    }

}
