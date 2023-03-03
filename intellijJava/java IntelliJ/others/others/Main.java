package others.others;

import java.io.*;
import java.util.*;
public class Main {
    public static File input = new File("input.txt");
    public static Scanner file;
    private static void scannerObject() {
        try{
            file = new Scanner(input);
        } catch(Exception e){
            System.err.println("input not found!!");
        }
    }
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        scannerObject();

        int arr[] = new int[10];
        for(int i = 0; i < 9; i++) {
            int a = file.nextInt();
            System.out.print(a);
        }
    }
}
