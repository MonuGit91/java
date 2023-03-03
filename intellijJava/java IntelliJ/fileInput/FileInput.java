package fileInput;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class FileInput {
    public static File input = new File("/Users/narenderkumarchoudhary/Public/Education/java/java IntelliJ/fileInput/input.txt");
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));;
    public static Scanner scan = new Scanner(System.in);;

    public static void fileInput() {
        if(input.exists()) {
            try{
                scan = new Scanner(input);
                br = new BufferedReader(new FileReader(input));
//                System.err.println("input file founded");
            } catch(Exception e){
//                System.err.println("input file not found!!");
            }
        }
    }
}
