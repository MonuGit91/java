package CodingNinjasSolution.Recursion_Assignment.Check_Palindrome_recursive;


public class solution {
    public static boolean helper(String str, int i, int j) {
        if(i >= j) return true;

        if(str.charAt(i) != str.charAt(j)) return false;

        return helper(str, i+1, j-1);
    }
    public static boolean isStringPalindrome(String input) {
        // Write your code here
        return helper(input, 0, input.length()-1);
    }
}
