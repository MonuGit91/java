package testing;

import java.io.*;
import java.util.*;

class Node {
    String data;
    Node left, right;

    public Node(String data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class Solution {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        String str[] = scan.nextLine().trim().split("[' ']");
        int n = str.length;
        System.out.println((n+1)/2);

    }
}

//public class Solution extends FileInput {
//    public static Node insertData(String str) {
//        if(str == null) return null;
//
//        String arr[] = str.trim().split("[' ']");
//        Queue<Node> q = new LinkedList<>();
//        Node root = new Node(arr[0]);
//        q.add(root);
//
//        int i = 1;
//        while(!q.isEmpty() || i >= arr.length) {
//            int size = q.size();
//            while(size-- > 0) {
//                Node temp = q.poll();
//                if(i < arr.length) temp.left = new Node(arr[i++]);
//                if(i < arr.length) temp.right = new Node(arr[i++]);
//                if(temp.left != null) q.add(temp.left);
//                if(temp.right != null) q.add(temp.right);
//            }
//        }
//
//        return root;
//    }
//
//    public static int countLeefs(Node root) {
//        if(root == null) return 0;
//
//        if(root.left == null && root.right == null) return 1;
//        System.out.println(root.data);
//        return countLeefs(root.left) + countLeefs(root.right);
//    }
//    public static void main(String[] args) {
//        fileInput();
//        String str = scan.nextLine();
//        Node root = insertData(str);
//        int count = countLeefs(root);
//        System.out.println(count);
//    }
//}


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
