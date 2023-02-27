package dsa.others.others;


public class Overloading
{
    int value;
    Overloading() {
        System.out.println("Default constructor");
    }
    
    Overloading(int data) {
        this.value = data;
        System.out.println("Overloaded constructor");
    }

}
/*
Output:
Default constructor
Overloaded constructor
*/