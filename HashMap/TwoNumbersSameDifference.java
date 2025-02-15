package HashMap;

import java.util.HashMap;

public class TwoNumbersSameDifference {

    /*
    Two numbers with the same difference
    Statement:** Given an array and a number k, check if there is a pair (a, b) where a - b = k.
    Input: [5, 20, 3, 2, 50, 80], k = 78
    Output: true (since 80 - 2 = 78)
    Complexity: Time O(n), Space O(n);
     */


    public static boolean TwoNumbersSameDifferenceFn(int k, int[] array){
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num : array){
            map.put(num, num);
            if(map.containsValue(num-k) || map.containsValue(num+k)){
                return true;
            }
        }

        return false;

    }

    public static void main(String[] args){
        int[] input = {5, 20, 3, 2, 50, 80};
        int k = 78;
        System.out.println("There are two numbers with the same difference? " + TwoNumbersSameDifferenceFn(k, input));
    }
}
