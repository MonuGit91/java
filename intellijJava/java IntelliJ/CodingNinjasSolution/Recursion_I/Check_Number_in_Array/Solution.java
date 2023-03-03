package CodingNinjasSolution.Recursion_I.Check_Number_in_Array;

public class Solution {
    public static boolean checkNumberHelper(int arr[], int x, int n) {
        if(n == 0) return false;

        if(arr[n-1] == x) return true;

        return checkNumberHelper(arr, x, n-1);
    }
    public static boolean checkNumber(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return checkNumberHelper(input, x, input.length);
    }
}