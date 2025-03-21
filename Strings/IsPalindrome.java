package Strings;

public class IsPalindrome {
    /*
        Given a string s, return true if it is a palindrome, or false otherwise.

        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters
        and removing all non-alphanumeric characters, it reads the same forward and backward.
        Alphanumeric characters include letters and numbers.

        Example 1:
        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
    */

    public static boolean IsPalindromeFn(String s) {
        String cleanedString = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder newString = new StringBuilder();

        for (int i = 1; i <= cleanedString.length(); i++) {
            newString.append(cleanedString.charAt(cleanedString.length() - i));
        }

        return newString.toString().equals(cleanedString);
    }

    public static void main(String[] args) {
        System.out.println(IsPalindromeFn("A man, a plan, a canal: Panama"));
    }
}
