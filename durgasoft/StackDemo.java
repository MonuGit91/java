import java.util.*;
class StackDemo {
	public static void main(String []arg) {
		Stack s = new Stack();

		s.push("A");
		s.push("B");
		s.push("C");
		System.out.println(s);
		System.out.println(s.search("A"));
		System.out.println(s.search("Z"));
	}
}

/*
[A, B, C]
3
-1
*/
