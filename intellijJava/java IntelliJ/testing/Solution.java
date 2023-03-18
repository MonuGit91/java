package testing;

import java.io.*;
import java.net.URL;
import java.util.*;
class TrieNode {
    char data;
    int value;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

    public TrieNode(char data) {
        this.data = data;
        this.value = 0;
        isTerminating = false;
        children = new TrieNode[26];
    }
}


class Solution extends FileInput {
    public static void pattern1(int n) {
/*
1     1
 2   2
  3 3
   4
  5 5
 6   6
7     7
*/
        for(int i = 1; i <= 2*n-1; i++) {
            for(int j = 1;  j <= n*2-1; j++) {
                if(i == j || j == (2*n-(i))) System.out.print(i);
                else System.out.print(" ");
            }
            System.out.println();
        }

    }
    public static void pattern2(int n) {
        /*
   *
  ***
 *****
  ***
   *
         */
        for(int i = 0; i < n; i++) {
            for(int j = 0; j <2*n-1; j++) {
                if(j >= n-i-1 && j <= n+i-1)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
        for(int i = 1; i < n; i++) {
            for(int j = 0; j < 2*n-1; j++) {
                if(j >= i && j <= 2*n-i-2)System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void pattern3(int n) {
        /*


         */
    }
    //Main Method
    public static void main(String[] args) {
//        fileInput();
//        int n = scan.nextInt();
//        pattern1(n);
//        pattern2(n);
        try {
            String url = "https://en.wikipedia.org/wiki/BHIM";
            URL parsedUrl = new URL(url);

            System.out.println("Protocol: " + parsedUrl.getProtocol());
            System.out.println("Host: " + parsedUrl.getHost());
            System.out.println("Path: " + parsedUrl.getPath());
            System.out.println("Query: " + parsedUrl.getQuery());
            System.out.println("Fragment: " + parsedUrl.getRef());

        }
        catch (Exception e) {}

    }
}


//-------------------------------------------------------FileInput---------------------------------------------------------------------------
class FileInput {
    private static File input = new File("/Users/narenderkumarchoudhary/Public/education/java/intellijJava/java IntelliJ/fileInput/input.txt");
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Scanner scan = new Scanner(System.in);

    public static void fileInput() {
        if (input.exists()) {
            try {
                scan = new Scanner(input);
                br = new BufferedReader(new FileReader(input));
//                System.err.println("input file founded");
            } catch (Exception e) {
//                System.err.println("input file not found!!");
            }
        }
    }

}
