package durgasoft;

import java.util.*;
class CursorDemo {
	public static void main(String [] arg) {
		Vector v = new Vector();
		
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator litr = v.listIterator();
		
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(litr.getClass().getName());
	}
}
/*
java.util.Vector$1
java.util.Vector$Itr
java.util.Vector$ListItr
*/
