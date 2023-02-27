package dsa.others.SortMethod;

import java.util.*;

class Pair {
	public Integer first;// ** because Integer contains compareTo()
	public int second;

	Pair(int f, int s) {
		first = f;
		second = s;
	}
}

class Ascending implements Comparator<Pair> {
	@Override
	public int compare(Pair o1, Pair o2) {
		// TODO Auto-generated method stub
		return o1.first.compareTo(o2.first);
	}

}

class Descending implements Comparator<Pair> {

	@Override
	public int compare(Pair o1, Pair o2) {
		// TODO Auto-generated method stub
		return -o1.first.compareTo(o2.first);
	}
}

public class SortPair {
	static Ascending asc = new Ascending();
	static Descending des = new Descending();
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		List<Pair> list = new ArrayList<Pair>();

		for (int i = 0; i < 10; i++) {
			Pair temp = new Pair(scan.nextInt(), scan.nextInt());
			list.add(temp);
		}

		Collections.sort(list, asc);

		print(list);
	}

	private static void print(List<Pair> list) {
		// TODO Auto-generated method stub
		for (Pair pair : list) {
			System.out.println(pair.first + " " + pair.second);
		}
	}

}
