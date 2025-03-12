package Strings;

public class IsSubsequence {
        /*
            You are given two strings s and t. Return true if s is a subsequence of t, or false otherwise.

            A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters.
            For example, "ace" is a subsequence of "abcde" while "aec" is not.

            The algorithm should run in O(n) time complexity, where n is the length of t.

            Example 1:
            Input: s = "abc", t = "ahbgdc"
            Output: true
        */

    public static boolean IsSubsequenceFn(String s, String t){
        int indexS = 0;

        for(int i=0; i<t.length(); i++){
            if(indexS < s.length() && s.charAt(indexS) == t.charAt(i)){
                indexS++;
            }
        }

        return indexS == s.length();
    }

    public static void main(String[] args){
        System.out.println(IsSubsequenceFn("abc", "ahbgdc"));
    }
}
