package Array;

import java.util.HashSet;

public class MissingNumber {
    /*
        Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
        Input: nums = [3,0,1]
        Output: 2;
        Complexity O(n);
     */

    public static int MissingNumberFn(int[] nums){
        int size = nums.length;

        HashSet<Integer> set = new HashSet();
        for(int num : nums){
            set.add(num);
        }

        for(int num : nums){
            if(set.add(0)){
                return 0;
            }
            if(set.add(num+1) && num != size){
                return num+1;
            }
        }

        return size;
    }

    public static void main(String[] args){

        int[] nums = {3,2,1};
        System.out.println(MissingNumberFn(nums));

    }
}
