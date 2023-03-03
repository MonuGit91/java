package CodingNinjasSolution.Recursion_Assignment.All_Indices_of_Number;

public class Solution {
    static int i = 0;
    public static int[] allIndexes(int input[], int x) {
        if(i >= input.length) return new int[0];;
        i++;
        int small[] = allIndexes(input, x);
        i--;
        if(input[i] == x) {
            int ans[] = new int[small.length+1];
            ans[0] = i;
            for(int j = 1; j < ans.length; j++) ans[j] = small[j-1];
            return ans;
        }

        return small;
    }

}