package CodingNinjasSolution.Recursion_I.Print_First_N_Natural_Numbers_Code;

public class Solution {

    public static void print(int n){
        //Write your code here
        if(n == 0) return;
        print(n-1);
        System.out.print(n + " ");
    }
}
