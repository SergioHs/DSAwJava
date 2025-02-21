package Binary;

public class HammingWeight {

    /*
    Count Set Bits (HammingWeight)
    Statement: Given a positive integer n, return the number of set bits (1s) in its binary representation (also known as the Hamming weight).
    Input: n = 11
    Output: 3
    Explanation: The binary representation of 11 is 1011, which contains three set bits.
    Complexity: Time O(log n), Space O(1)
     */

    public static int HammingWeightFn(int n){
        int count = 0;

        while(n > 0){
            count += (n & 1);
            n >>= 1;
        }

        return count;
    }

    public static void main(String[] args){
        int input = 11;
        System.out.println(HammingWeightFn(input));
    }
}
