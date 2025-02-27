package Array;

import java.util.HashMap;

public class MaxValueFreq {

    /*
    Check the Max Value Frequency in an array
     */

    public static int MaxValueFreqFn(int[] input){
        int MaxValue = 0;
        int count = 0;

        for(int i=0; i<input.length; i++){
            if(input[i] > MaxValue){
                MaxValue = input[i];
            }
        }

        for(int i=0; i<input.length; i++){
            if(input[i] == MaxValue){
                count+=1;
            }
        }

        return count;
    }

    public static void main(String[] args){
        int[] input = {1, 9, 3, 11, 4, 11, 6, 9, 11, 12};
        System.out.println(MaxValueFreqFn(input));


    }
}
