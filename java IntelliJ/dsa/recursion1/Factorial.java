package dsa.recursion1;
public class Factorial {
	public static int fact(int n) {
		if(n == 0) {
			return 1;
		}
		int smallAns = fact(n-1);
		return n*smallAns;
	}
	
	public static Node help(int n, Node tail) {
		if(n == 1) {
			tail = new Node(1);
			return tail;
		}
		tail = help(n-1, tail);
		
		Node temp = tail;
		Node pre = null;
		int rem = 0;
		while(temp != null) {
			int val = temp.data*n + rem;
			
			temp.data = val % 10;
			rem = val/10;
			
			pre = temp;
			temp = temp.next;
		}
		
		if(rem != 0) {
			while(rem != 0) {
				pre.next = new Node(rem%10);
				rem = rem/10;
				pre = pre.next;
			}
		}
		
		return tail;
	}
	
	public static void print(Node tail) {
		if(tail == null) return;
		print(tail.next);
		
		System.out.print(tail.data);
	}
	private static void largeNoFact(int n) {
		// TODO Auto-generated method stub
		Node tail = help(n, null);
		print(tail);
	}
	
	public static void main(String[] arg) {
		System.out.println(fact(5));
		largeNoFact(100);
	}

	
}