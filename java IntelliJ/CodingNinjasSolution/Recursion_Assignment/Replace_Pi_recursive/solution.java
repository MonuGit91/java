package CodingNinjasSolution.Recursion_Assignment.Replace_Pi_recursive;

public class solution {
    public static int i = 0;
    public static String replace(String input){
        if(i > input.length()-2) return input.substring(i);
        if(input.charAt(i)=='p' && input.charAt(i+1)=='i') {
            i += 2;
            return "3.14"+replace(input);
        }
        else return input.charAt(i++)+replace(input);
    }
}
