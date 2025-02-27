package Strings;

public class InverseString {
    /*
    String inversion
     */

    public static String InverseStringFn(String input){
        String newString = "";

       for(int i=0; i<input.length(); i++){
            newString += input.charAt(input.length() - i-1);
       }

        /*for(int i=input.length()-1; i != 0; i--){
            newString += input.charAt(i);
        }*/

        return newString;
    }


    public static void main(String[] args){
        String input = "anticonstitucionalissimamente";
        System.out.println(InverseStringFn(input));
    }
}
