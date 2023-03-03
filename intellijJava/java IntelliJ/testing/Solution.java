package testing;

import java.io.*;
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

class Trie {
    private TrieNode root;
    public int count;

    public Trie() {
        root = new TrieNode('\0');
    }

    private void add(TrieNode root, String word, int value) {
        if (word.length() == 0) {
            root.isTerminating = true;
            root.value = value;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if (child == null) {
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
        }
        add(child, word.substring(1), value);
    }

    public void add(String word, int value) {
        add(root, word, value);
    }

    public int search1(TrieNode root, int sum) {
        if (root.isTerminating) {
            sum += root.value;
        }
        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null) {
                sum = search1(root.children[i], sum);
            }
        }
        return sum;
    }

    private int search(TrieNode root, String word) {
        if (word.length() == 0) {
            return search1(root, 0);
        }

        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];

        if (child == null) {
            return 0;
        }

        return search(child, word.substring(1));

    }

    public int search(String word) {
        return search(root, word);
    }

}
class Solution extends FileInput {

    //Main Method
    public static void main(String[] args) {
        fileInput();
        String input[] = new String[0];
        Trie trie = new Trie();
        while(true) {
            try {
                input = br.readLine().trim().split("[ ]");
            }
            catch (Exception e){}

            if(input.length == 2) {
                trie.add(input[0], Integer.parseInt(input[1]));
            }
            else {
                if(input[0].equals("exit")) return;
                int sum = trie.search(input[0]);
                System.out.println(sum);
            }
        }
    }
}


//-------------------------------------------------------FileInput---------------------------------------------------------------------------
class FileInput {
    private static File input = new File("/Users/narenderkumarchoudhary/Public/Education/java/java IntelliJ/fileInput/input.txt");
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
