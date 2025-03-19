package Array;

import java.util.HashSet;

public class ContainsDuplicate {
    /*
    Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    Ex: Input: nums = [1,2,3,1] - Output: true
    Complexity: O(n)
     */

    public static boolean ConstainsDuplicateFn(int[] nums){
        HashSet<Integer> set = new HashSet();

        for(int num: nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,1};
        System.out.println(ConstainsDuplicateFn(nums));
    }
}
