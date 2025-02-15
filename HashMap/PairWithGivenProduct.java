package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairWithGivenProduct {

    /*
    Pair with given product
    Statement: Given an array and a number p, find two numbers whose product is equal to p.
    Input: [10, 20, 9, 40], p = 400
    Output: (10, 40)
    Complexity: Time O(n), Space O(n);
     */

    public static int[] PairWithGivenProductFn(int[] nums, int product){
        Map<Integer, Integer> map = new HashMap();
        int[] result;

        for(int num : nums){
            if(map.containsKey(product/num)){
                return new int[] {num, map.get(product/num)};
            }
            map.put(num, num);
        }

         throw new IllegalArgumentException("Not exists");
    }



    public static void  main (String[] args){

        int[] nums = {10, 20, 9, 40};
        int product = 400;
        System.out.println(Arrays.toString(PairWithGivenProductFn(nums, product)));
    }
}
