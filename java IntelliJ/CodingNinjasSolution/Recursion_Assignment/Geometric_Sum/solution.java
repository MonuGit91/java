package CodingNinjasSolution.Recursion_Assignment.Geometric_Sum;

import java.lang.*;
public class solution {

    public static double findGeometricSum(int k){
        // Write your code here
        if(k == 0) return 1;
        return findGeometricSum(k-1)+(1/Math.pow(2, k));
    }
}
