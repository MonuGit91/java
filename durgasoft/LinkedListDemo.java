import java.util.*;
class LinkedListDemo {
	public static void main(String arg[]) {
		LinkedList l = new LinkedList();
		
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		System.out.println(l);
		
		l.set(0, "software");
		System.out.println(l);
	
		l.set(0, "venky");
		System.out.println(l);

		l.remove();
		System.out.println(l);

		l.addFirst("CCC");
		System.out.println(l);
	}

}
