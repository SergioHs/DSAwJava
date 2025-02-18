package HashMap;

import java.util.HashMap;

public class WordFrequency {

    /*
        Word Frequency
        Statement: Given a list of words, count how many times each word appears.
        Input: ["java", "python", "java", "c", "python", "java"]
        Output: {java=3, python=2, c=1}
        Complexity: Time O(n), Space O(n);
     */

    public static HashMap<String, Integer> WordFrequencyFn(String[] array){
        HashMap<String, Integer> map = new HashMap<>();

        for(String name : array){
            if(map.containsKey(name)){
                map.put(name, map.get(name) + 1);
            } else {
                map.put(name, 1);
            }
        }

        return map;
    }
    public static void main(String[] args){
        String[] input = {"java", "python", "java", "c", "python", "java"};
        System.out.println(WordFrequencyFn(input));
    }
}
