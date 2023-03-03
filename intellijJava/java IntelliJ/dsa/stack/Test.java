package dsa.stack;

public class Test {
	public static void main(String[] arg) throws EmptyStackException, StackFullException{
		StackUsingArr sA = new StackUsingArr();

		sA.push(1); 
		sA.push(2);
		sA.push(3);
		System.out.println(sA.size());
		System.out.println(sA.pop());
		sA.push(8);
		System.out.println(sA.pop());
		System.out.println(sA.pop());
		System.out.println(sA.pop());
		
	}
}
