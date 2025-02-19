package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class GroupAnagrams {
    /*
    Group Anagrams
    Statement: Given a list of words, group words that are anagrams of each other.
    Input: ["bat", "tab", "cat", "tac", "act"]
    Output: [["bat", "tab"], ["cat", "tac", "act"]]'
    Complexity:  O(m log m) where m is the average size of the words;
     */

    public static ArrayList<ArrayList<String>> GroupAnagramsFn(String[] array){
        HashMap<String, ArrayList<String>> map = new HashMap<>();

        String[] orderedArray = new String[array.length];
        for(int i=0; i<array.length; i++){
            char[] chars = array[i].toCharArray();
            Arrays.sort(chars);
            orderedArray[i] = new String(chars);

        }

        for(int j=0; j<orderedArray.length; j++){
            String word = orderedArray[j];
            String wordUnordered = array[j];
            ArrayList<String> arrayOfThisString = map.getOrDefault(word, new ArrayList<String>());
            arrayOfThisString.add(wordUnordered);
            map.put(word, arrayOfThisString);
        }

        ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
        int k = 0;
        for(Map.Entry<String, ArrayList<String>> entry : map.entrySet()){
            result.add(entry.getValue());
        }
        return result;
    }

    public static void main(String[] args){
        String[] input = {"bat", "tab", "cat", "tac", "act"};
        System.out.println(Arrays.toString(input));
        System.out.println(GroupAnagramsFn(input));
    }
}
