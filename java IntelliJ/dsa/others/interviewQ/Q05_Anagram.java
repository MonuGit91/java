package dsa.others.interviewQ;

import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class Q05_Anagram {
	
	public static boolean isAnagram(String a,String b)
    {
        if(a.length() != b.length()) {
            return false;
        }
        
        int arr[] = new int[26];
        for(int i = 0; i < 26; i++) {
            arr[i] = 0;
        }
        
        int i = 0;
        for(i = 0; i < a.length(); i++) {
            arr[(a.charAt(i)-'a')]++;
            arr[(b.charAt(i)-'a')]--;
        }
        
        
        for(i = 0; i < 26; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        
        return true;
    }
	
	//using map
	public static boolean isAnagram1(String a, String b) {
		if(a.length() != b.length()) {
			return false;
		}
		
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		
		for(int i = 0; i < a.length(); i++) {
			if(map.containsKey(a.charAt(i))) {
				map.put(a.charAt(i), map.get(a.charAt(i))+1);
			}
			else {
				map.put(a.charAt(i), 1);
			}
			
			if(map.containsKey(b.charAt(i))) {
				map.put(b.charAt(i), map.get(b.charAt(i))-1);
			}
			else {
				map.put(b.charAt(i), -1);
			}
		}
		
		Set<Character> keys = map.keySet();
		
		for(Character val : keys) {
			if(map.get(val) != 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isAnagram2(String a,String b)
    {
        if(a.length() != b.length()) {
            return false;
        }
        
        
        char arr1[] = a.toCharArray();
        Arrays.sort(arr1);
        
        char arr2[] = b.toCharArray();
        Arrays.sort(arr2);
        
        int i = 0;
        for(i = 0; i < a.length(); i++) {
        	if(arr1[i] != arr2[i]) {
                return false;
            }
        }
        
        return true;
    }
	
	//Main
	public static void main(String []arg) {
		String a = "monuchoudhary";
		String b = "choudharymonu";
		
		System.out.println(isAnagram(a, b));
		System.out.println(isAnagram1(a, b));
		System.out.println(isAnagram2(a, b));

	}
}
