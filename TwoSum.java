import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    /*
    Two Sum
    Statement: Given an array of integers and a target, find two numbers whose sum is equal to the target.
    Input: [2, 7, 11, 15], target = 9
    Output: [0, 1] (indices of the numbers that sum to 9)
    Complexity: Time O(n), Space O(n);
     */

    public static int[] twoSumFn(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        int index = 0;

        for (int num : array){
            int diff = target - num;

            if(map.containsKey(diff)){
                return new int[]{map.get(diff), index};
            }
            map.put(num, index);
            index++;
        }

        throw new IllegalArgumentException("There's no solution");
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;

        int[] result = twoSumFn(nums, target);

        System.out.println("Index: [" + result[0] + " , " + result[1] + "] = " + target);
    }
}