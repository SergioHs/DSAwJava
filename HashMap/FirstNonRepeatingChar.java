package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingChar {
    /*
        First non-repeating character
        Statement: Given a string, find the first non-repeating character.
        Input: "abacabad"
        Output: 'c'
     */

    public static Character FirstNonRepeatingCharFn(String input){
        HashMap<Character, Integer> map = new HashMap<>();

        for(int i=0; i<input.length(); i++){
            Character letter = input.charAt(i);
            if(map.containsKey(letter)){
                map.put(letter, map.get(letter)+1);
            } else {
                map.put(letter, 1);
            }
        }

        for(int i=0; i<input.length(); i++){
            if(map.get(input.charAt(i)) == 1){
                return input.charAt(i);
            }
        }
        return null;
    }

    public static void main(String[] args){
        String input = "abacabad";
        System.out.println(FirstNonRepeatingCharFn(input));
    }
}
