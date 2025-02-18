package HashMap;

import java.util.HashMap;

public class SubArrayZeroSum {
    /*
        Subarray with zero sum
        Statement: Check if there is a subarray with sum equal to zero.
        Input: [4, 2, -3, 1, 6]
        Output: true (because 2, -3, 1 sums to 0)
        Complexity: Time O(n), Space O(n);

     */

    public static boolean SubArrayZeroSumFn(int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;

        for(int num : array){
             sum  += num;
             if(sum == 0 || map.containsValue(sum)){
                 return true;
             }
             map.put(sum, sum);
        }
        return false;
    }

    public static void main(String[] args){
        int[] input = {4, 2, -3, 1, 6};
        System.out.println("There is a subarray with zero sum: " + SubArrayZeroSumFn(input));

    }
}
