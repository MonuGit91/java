import java.util.*;

class HashSetDemo {
	public static void main(String []arg) {
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));//false
		System.out.println(h);//[null, D, B, C, 10, Z]
	}
}
