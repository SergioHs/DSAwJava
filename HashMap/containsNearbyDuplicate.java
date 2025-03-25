package HashMap;

import java.util.HashMap;

public class containsNearbyDuplicate {
    /*
    Contains duplicate within range k
    Statement: Given an array and an integer k, check if there exist two distinct indices (i, j)
    such that nums[i] == nums[j] and |i - j| <= k.
    Input: [1,2,3,1], k = 3
    Output: true
    Complexity: Time O(n), Space O(n);
    */

    public static boolean containsNearbyDuplicateFn(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && i - map.get(nums[i]) <= k) {
                return true;
            }
            map.put(nums[i], i); // Atualiza o último índice do número
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsNearbyDuplicateFn(new int[]{1, 2, 3, 1}, 3)); // true
        System.out.println(containsNearbyDuplicateFn(new int[]{1, 0, 1, 1}, 1)); // true
        System.out.println(containsNearbyDuplicateFn(new int[]{1, 2, 3, 1, 2, 3}, 2)); // false
    }
}
