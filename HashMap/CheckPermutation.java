package HashMap;

import java.util.HashMap;

public class CheckPermutation {
    /*
        Check the permutation
        Statement: Given two strings, check if one is a permutation of the other.
        Input: "listen", "silent"
        Output: true
        Complexity: Time O(n), Space O(n);
     */

    public static boolean CheckPermutationFn(String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<string1.length(); i++){
            Character character = string1.charAt(i);
            map.put(character, map.getOrDefault(character, 0) + 1);
        }

        for(int i=0; i<string2.length(); i++){
            Character character = string2.charAt(i);
            if(!map.containsKey(character) || map.get(character) == 0){
                return false;
            } else {
                map.put(character, map.get(character) - 1);
            }
        }
        return true;
    }

    public static void main(String[] args){
        String string1 = "listen";
        String string2 = "silent";
        System.out.println(CheckPermutationFn(string1, string2));

    }
}
