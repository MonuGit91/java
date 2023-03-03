package CodingNinjasSolution.Recursion_Assignment.String_to_Integer;


public class solution {
    public static int convertStringToInt(String input){
        // Write your code here
        if(input.length() == 0) return 0;

        int val = input.charAt(0) - '0';
        return (val * (int)Math.pow(10, input.length()-1)) + convertStringToInt(input.substring(1));
    }
}
