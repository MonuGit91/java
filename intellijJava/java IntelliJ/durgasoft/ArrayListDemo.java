package durgasoft;

import java.util.*;
public class ArrayListDemo
{
	public static void main(String[] str)
	{
		System.out.println("This is my demo project");	
		ArrayList l = new ArrayList();
		l.add("A");
		l.add(10);
		l.add("A");
		l.add(null);
		System.out.println(l);
		
		l.remove(2);
		System.out.println(l);

		l.add(2, "M");
		l.add("N");
		System.out.println(l);
	}		
}
