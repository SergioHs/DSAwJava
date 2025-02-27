package HashMap;

import java.util.HashMap;

public class MaxValueFreqHash {

    /*

    Check the Max Value Frequency in an array

     */

    public static int MaxValueFreqFn(int[] input){
        HashMap<Integer, Integer> map = new HashMap<>();
        int MaxValue = 0;

        for(int i=0; i<input.length; i++){
            if(input[i] > MaxValue){
                MaxValue = input[i];
            }
            map.put(input[i], map.getOrDefault(input[i], 0) + 1);
        }

        return map.get(MaxValue);
    }

    public static void main(String[] args){
        int[] input = {1, 9, 3, 11, 4, 11, 6, 9, 11, 12};

        System.out.println(MaxValueFreqFn(input));


    }
}
