package Array;

public class SecondLargestElement {
    /*
    Statement: Given an array of integers, return the second largest element.
    Input: nums = {3, 7, 1, 9, 4, 9}
    Output: 7
    Complexity: O(n) time, O(1) space
     */

    public static int SecondLargestElementFn(int[] input){

        int largest = 0;
        int secondLargest = 0;

        for(int num : input){
            if(num > largest){
                largest = num;
            }
        }

        for(int num : input){
            if(num > secondLargest && num < largest){
                secondLargest = num;
            }
        }

        return secondLargest;
    }

    public static void main(String[] args){
        int[] input = {1,2,3,4,5,6,8};
        System.out.println(SecondLargestElementFn(input));

    }
}
