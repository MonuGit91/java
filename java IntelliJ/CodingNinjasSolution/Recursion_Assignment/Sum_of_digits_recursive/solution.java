package CodingNinjasSolution.Recursion_Assignment.Sum_of_digits_recursive;


public class solution {

    public static int sumOfDigits(int input){
        // Write your code here
        if(input == 0) return input;

        return sumOfDigits(input/10) + (input % 10);
    }
}

