package InterviewQ;

import java.util.*;

public class Q12_NonReapetingCharacter {
	public static void NonRepeatingCharacter(String str) {
		int arr[] = new int[256];
		
		for (int i = 0; i < str.length(); i++) {
			arr[str.charAt(i)]++;
		}
		
		for(int i = 0; i < 256; i++) {
			if(arr[i] == 1) {
				System.out.println((char)i);
			}
		}
	}
	
	
	public static void NonRepeatingCharacterMap(String str) {
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
		
		for(Map.Entry<Character, Integer> entity : map.entrySet()) {
			char key = entity.getKey();
			int val = entity.getValue();
			
			if(val == 1) {
				System.out.println(key);
			}
		}
		
	}
	public static void main(String[] args) {
		NonRepeatingCharacter("asdhhhjjjuukkiioollkkuuhhyybbnnmmpppoo");
		NonRepeatingCharacterMap("asdhhhjjjuukkiioollkkuuhhyybbnnmmpppoo");
	}
}
