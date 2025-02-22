package Binary;

public class IsPowerOfTwo {
    /*
     Statement: Given a number n, return true if it is a power of 2, otherwise return false.
     Input: n = 16
     Output: true
     Input: n = 18
     Output: false
     Complexity: O(1) time, O(1) space
     */

    public static boolean IsPowerOfTwoFn(int num){

        int count = 0;
        for(int i=31;i>=0;i--){
            int bit = (num >> i) & 1;
            if(bit == 1){
                count++;
            }
        }

        return count == 1;
    }

    public static void main(String[] args){
        System.out.println("Is 2 power of two? " + IsPowerOfTwoFn(2));
        System.out.println("Is 3 power of two? " + IsPowerOfTwoFn(3));
        System.out.println("Is 4 power of two? " + IsPowerOfTwoFn(4));
        System.out.println("Is 16 power of two? " + IsPowerOfTwoFn(16));
        System.out.println("Is 512 power of two? " + IsPowerOfTwoFn(512));
        System.out.println("Is 256 power of two? " + IsPowerOfTwoFn(256));
        System.out.println("Is 100 power of two? " + IsPowerOfTwoFn(1000));

    }
}
