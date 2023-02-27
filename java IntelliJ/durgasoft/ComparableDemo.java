package durgasoft;

import java.util.*;

public class ComparableDemo {
    public static void main(String [] arg) {
        System.out.println("A".compareTo("Z"));// -ve
        System.out.println("Z".compareTo("K"));//+ve
        System.out.println("A".compareTo("A"));//0
        System.out.println("A".compareTo(null));//Run Time Error: NullPointerException
    }
}
