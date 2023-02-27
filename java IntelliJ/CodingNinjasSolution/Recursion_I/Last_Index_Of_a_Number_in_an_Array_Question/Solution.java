package CodingNinjasSolution.Recursion_I.Last_Index_Of_a_Number_in_an_Array_Question;


public class Solution {
    public static int lastIndexHelper(int arr[], int x, int i) {
        if(i == -1) return -1;

        if(arr[i] == x) return i;

        return lastIndexHelper(arr, x, i-1);
    }
    public static int lastIndex(int input[], int x) {
        /* Your class should be named Solution
         * Don't write main().
         * Don't read input, it is passed as function argument.
         * Return output and don't print it.
         * Taking input and printing output is handled automatically.
         */
        return lastIndexHelper(input, x, input.length-1);
    }

}