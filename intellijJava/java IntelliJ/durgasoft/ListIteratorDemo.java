package durgasoft;

import java.util.*;
class ListIteratorDemo {
	public static void main(String [] arg) {
		LinkedList l = new LinkedList();
		l.add("balakrishna");
		l.add("venki");
		l.add("chiru");
		l.add("nag");
		System.out.println(l); // [balakrishna, venki, chiru, nag]

		ListIterator itr = l.listIterator();
		while(itr.hasNext()) {
			String s = (String)itr.next();
			if(s.equals("venki")) itr.remove();
			else if(s.equals("nag")) itr.add("chaitu");
			else if(s.equals("chiru")) itr.set("charan");
		}
		System.out.println(l); // [balakrishna, charan, nag, chaitu]
	}
}
/*
[balakrishna, venki, chiru, nag]
[balakrishna, charan, nag, chaitu]
*/
