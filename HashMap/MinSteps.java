package HashMap;

import java.util.HashMap;

public class MinSteps {

    /*
    You are given two strings of the same length s and t. In one step you can choose any character of t and replace it with another character.
    Return the minimum number of steps to make t an anagram of s.
    An Anagram of a string is a string that contains the same characters with a different (or the same) ordering.
    Input: s = "bab", t = "aba"
    Output: 1
     */

    public static int MinStepsFn(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int count = 0;


        for(int i=0; i<s.length(); i++){
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }

        for(HashMap.Entry<Character, Integer> set : map.entrySet()){
            if(set.getValue() > 0){
                count += set.getValue();
            }
        }

        return count;
    }

    public static void main(String[] args){
        String s = "leetcode";
        String t = "practice";

        System.out.println(MinStepsFn(s, t));
    }
}
