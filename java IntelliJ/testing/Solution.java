package testing;

import java.io.*;
import java.util.*;

class Node {
    public int data;
    public List<Node> children;

    public Node(int data) {
        this.data = data;
        this.children = new LinkedList<Node>();
    }
}

class Tree {
    public Node root;

    public Tree(int data) {
        this.root = new Node(data);
    }

    public static Node getTree(String input[]) {
        if(input.length == 0 || input[0].equals("null")) return null;
        Node root = new Node(Integer.parseInt(input[0]));
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 2;
        while (!q.isEmpty()) {
            Node temp = q.poll();
            while (i < input.length && !input[i].equals("null")) {
                Node newNode = new Node(Integer.parseInt(input[i]));
                temp.children.add(newNode);
                q.add(newNode);
                i++;
            }
            i++;
        }
        return root;
    }

    static void printTree(Node root) {
        if(root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        List<List<Integer>> grid = new LinkedList<>();
        while (!q.isEmpty()) {
            int size = q.size();
            grid.add(new LinkedList<>());
            while(size-- > 0) {
                Node temp = q.poll();
                grid.get(grid.size()-1).add(temp.data);

                if(temp.children == null) continue;
                for(Node child : temp.children) {
                    q.add(child);
                }
            }
        }
        System.out.println(grid);
    }
}


//-------------------------------------Solution--------------------------------------------------
class Solution extends FileInput {

    // Input method
    private static String[] takeInput() {
        String input[] = new String[0];

        try {
            input = br.readLine().trim().split(",");
        } catch (Exception e) {
        }

        if (input.length > 0) {
            input[0] = input[0].replace("[", "");
            input[input.length - 1] = input[input.length - 1].replace("]", "");
        }

        return input;
    }

    //Main Method
    public static void main(String[] args) {
        fileInput();
        String input[] = takeInput();
        Node root = Tree.getTree(input);
        Tree.printTree(root);


    }
}


//----------------------------------------FileInput--------------------------------------------
class FileInput {
    private static File input = new File("/Users/narenderkumarchoudhary/Public/Education/java/java IntelliJ/fileInput/input.txt");
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static Scanner scan = new Scanner(System.in);
    ;

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
