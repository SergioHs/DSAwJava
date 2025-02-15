package HashMap;

import java.util.HashMap;

public class CoutingPairsWithDifferenceK {

    /*
    Counting pairs with difference k
    Statement: Given an array and a number `k`, count how many pairs have exactly `k` difference.
    Input: [1, 5, 3, 4, 2], k = 2
    Output: 3 (pairs: (1,3), (3,5), (2,4))
    Complexity: Time O(n), Space O(n);
    */

    public static int CountingPairsWithDifferenceKFn(int k, int[] array){

        HashMap<Integer, Integer> map = new HashMap<>();
        int pairs = 0;

        for(int num : array){
            if(map.containsValue(num-k)){
                pairs++;
            }
            if (map.containsValue(num+k)){
                pairs++;
            }
            map.put(num, num);
        }
        return pairs;
    }

    public static void main (String[] args){
        int[] input = {1, 5, 3, 4, 2};
        int k = 2;
        System.out.println("The counting of pairs with difference K is: " + CountingPairsWithDifferenceKFn(k, input));
    }


}
