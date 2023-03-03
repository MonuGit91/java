package CodingNinjasSolution.Recursion_I.Sum_Of_Array;

public class Solution {

    public static int sumHelper(int arr[], int n) {
        if(n == 0) return 0;
        return arr[n-1] + sumHelper(arr, n-1);

    }
    public static int sum(int input[]) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        int n = input.length;
        return sumHelper(input, n);
    }
}