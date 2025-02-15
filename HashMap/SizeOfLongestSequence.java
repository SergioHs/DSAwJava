package HashMap;

import java.util.HashMap;
import java.util.Map;

public class SizeOfLongestSequence {

    /*
        Longest sequence of consecutive elements
        Statement: Given an unordered array, find the length of the longest sequence of consecutive numbers.
        Input: [100, 4, 200, 1, 3, 2]
        Output: 4 (sequence: [1, 2, 3, 4])
        Complexity: Time O(n), Space O(n);
     */

    public static int SizeOfLongestSequenceFn(int[] array){
        if (array.length == 0) return 0;

        Map<Integer, Integer> map = new HashMap<>();
        int size = 0;

        for (int num : array){
            if(!map.containsKey(num)){
                int left =  map.getOrDefault(num -1, 0);
                int right = map.getOrDefault(num + 1, 0);
                int length = left + right + 1;

                map.put(num, length);
                map.put(num - left, length);
                map.put(num + right, length);

                size = Math.max(size, length);
            }
        }
        return size;
    }

    public static void main (String[] args){
        int[] input = {100, 4, 200, 1, 3, 2};
        System.out.println("The size of the longest sequence in the array is: " + SizeOfLongestSequenceFn(input));

    }

}

