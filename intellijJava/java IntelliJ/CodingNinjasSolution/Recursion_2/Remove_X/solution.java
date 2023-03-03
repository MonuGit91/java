package CodingNinjasSolution.Recursion_2.Remove_X;

public class solution {

    // Return the changed string
    public static String removeX(String str){
        // Write your code here
        if(str.length() == 0) return "";

        String smallAns = removeX(str.substring(1));
        if(str.charAt(0) == 'x') {
            return smallAns;
        }
        return str.charAt(0)+smallAns;
    }
}
