package Binary;

public class CountZeros {
    /*
     Statement: Given a positive integer n, return the number of 0 bits in its binary representation.
     Input: n = 11 (binary 1011)
     Output: 1
     Complexity: O(log n) time, O(1) space
     */

    public static int CountZerosFn(int n){
        int count = 0;
        boolean foundOne = false;

        while(n > 0){
            if((n & 1) == 0 && foundOne){
                count++;
            } else {
                foundOne = true;
            }
            n = n >> 1;
        }
        return count;
    }

    public static void main(String[] args){
        int input = 18;
        System.out.println(CountZerosFn(input));
    }
}
