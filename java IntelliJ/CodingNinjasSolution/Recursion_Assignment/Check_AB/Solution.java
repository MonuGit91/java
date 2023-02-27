package CodingNinjasSolution.Recursion_Assignment.Check_AB;

public class Solution {
    public static boolean checkAB(String input) {
        if (input.length()==0)
        {
            return true;
        }
        if (input.charAt(0) != 'a')
        {
            return false;
        }
        if (input.length() >= 3 && "abb".equals(input.substring(0,3)))
        {
            return checkAB(input.substring(3));
        }
        else
        {
            return checkAB(input.substring(1));
        }
    }
}
/*
a --> a
a or aa or bba -->aaabba
bb or abb --> bbabb
----> aaaabbabbabb
*/