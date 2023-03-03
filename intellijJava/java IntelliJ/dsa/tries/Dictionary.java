package dsa.tries;
class TrieNode {
	private int data;
	boolean isTerminal;
	TrieNode children[];
	
	TrieNode(char data) {
		this.data = data;
		this.isTerminal = false;
		children = new TrieNode[26];
	}
}
public class Dictionary {
	private TrieNode root;
	
	Dictionary() {
		root = new TrieNode('\0');
	}
	
	private void add(TrieNode root, String word) {
		if(word.length() == 0) {
			root.isTerminal = true;
			return;
		}
		
		char ch = word.charAt(0);
		if(root.children[ch-'a'] != null) {
			add(root.children[ch-'a'], word.substring(1));
		}
		else {
			root.children[ch-'a'] = new TrieNode(ch);
			add(root.children[ch-'a'], word.substring(1));
		}
	}
	public void add(String word) {
		add(root, word);
	}
	
//	public boolean search(String worg) {
//		
//	}
	
	public void remove(String word) {
		
	}
	
}
