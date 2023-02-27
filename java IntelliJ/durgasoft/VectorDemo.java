package durgasoft;

import java.util.*;
class VectorDemo {
	public static void main(String []arg) {
		Vector v = new Vector();

		System.out.println(v.capacity());

		for(int i = 0; i < 10; i++) v.add(i);

		System.out.println(v.capacity());
		v.addElement("A");
		System.out.println(v.capacity());
		System.out.println(v);
	}
};
