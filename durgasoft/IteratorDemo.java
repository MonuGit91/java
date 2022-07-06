import java.util.*;
class IteratorDemo {
	public static void main(String []str) { 
		ArrayList l = new ArrayList();

		for(int i = 0; i < 10; i++) l.add(i);
		System.out.println(l);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]

		Iterator itr = l.iterator();

		while(itr.hasNext()) {
			Integer i = (Integer)itr.next();
			if(i%2 == 0) System.out.println(i);// 0 2 4 6 8
			else itr.remove();
		}
		System.out.println(l);//[0, 2, 4, 6, 8]
	}
}
/*
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
0
2
4
6
8
[0, 2, 4, 6, 8]
*/
