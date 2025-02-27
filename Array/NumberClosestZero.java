package Array;

public class NumberClosestZero {

    /*
    Number closest to zero in an array
     */

    public static int NumberClosestZeroFn(int[] input){
        int number = input[0];
        int auxDiff = Math.abs(number);

        for(int num : input){
            if(Math.abs(num) < auxDiff){
                auxDiff = Math.abs(num);
                number = num;
            }
        }

        return number;
    }

    public static void main(String[] args){
        int[] input = {11, -1, 3, 9, -2, -7, 22};
        System.out.println(NumberClosestZeroFn(input));
    }
}
