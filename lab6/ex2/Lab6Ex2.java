package lab6.ex2;

import java.util.HashMap;
import java.util.Map;

public class Lab6Ex2 {
	 public static void main(String[] args) {
	        char[] charArray = {'a', 'b', 'c', 'a', 'b', 'd', 'e', 'a'};
	        Map<Character, Integer> charCountMap = countChars(charArray);

	        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	            System.out.println("Character: " + entry.getKey() + " - Count: " + entry.getValue());
	        }
	    }

	    public static Map<Character, Integer> countChars(char[] charArray) {
	        Map<Character, Integer> charCountMap = new HashMap<>();
	        
	        for (char c : charArray) {
	            if (charCountMap.containsKey(c)) {
	                charCountMap.put(c, charCountMap.get(c) + 1);
	            } else {
	                charCountMap.put(c, 1);
	            }
	        }
	        
	        return charCountMap;
	    }

}
