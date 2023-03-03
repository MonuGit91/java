package interviewQ;

import java.util.HashMap;
import java.util.Map;

public class Q07_CharactersFrequency {
	
	//Only  capital and small letter
	public static void frequency(String str) { 
		int arr[] = new int[200];
		for(int i = 0; i < 200; i++ ) {
			arr[i] = 0;
		}
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				arr[ch]++;
			}
			
		}
		
		for(int i = 0; i < 200; i++) {
			
			if(arr[i] != 0) {
				System.out.println((char)i + " " + arr[i]);
			}
		}
	}
	
	public static void frequencyAll(String str) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		
		for (Map.Entry<Character, Integer> entry : map.entrySet()) {
			Character key = entry.getKey();
			Integer val = entry.getValue();
			
			System.out.println(key + " " + val);
			
		}
	}
	public static void main(String[] args) {
		frequency("dnnnaaaAAABBBc");
		
		System.out.println();
		
		frequencyAll("dnnnaaaAAABBBc");
	}
}
