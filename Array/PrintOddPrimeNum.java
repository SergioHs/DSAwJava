package Array;

public class PrintOddPrimeNum {
    /*
        Printing odd prime numbers
     */

    public static boolean isPrime(int num){
        if(num < 2){
            return false;
        }
        for(int i=2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void PrintOddPrimeNumFn(int[] nums){
        for(int num : nums){
            if(isPrime(num) && num % 2 != 0){
                System.out.println(num);
            }
        }
    }

    public static void main(String[] args){
        int[] input = {1,2,3,4,5,6,104729};
        PrintOddPrimeNumFn(input);

    }
}
