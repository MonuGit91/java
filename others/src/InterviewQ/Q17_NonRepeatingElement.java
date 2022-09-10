package InterviewQ;
import java.util.*;

public class Q17_NonRepeatingElement {
	public static void nonRepeating(int arr[]) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i])+1);
			}
			else {
				map.put(arr[i], 1);
			}
		}
		
		for(Map.Entry<Integer, Integer> entity : map.entrySet()) {
			if(entity.getValue() == 1) {
				System.out.println(entity.getKey());
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1, 1, 2, 2, 3, 4, 5, 5, 6, 10};
		
		nonRepeating(arr);
		
	}

}
