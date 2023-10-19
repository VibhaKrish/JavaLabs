package lab3.ex6;

import java.util.Arrays;
import java.util.Scanner;

public class Lab3Ex6 {
	
	public static boolean isAlphabaticOrder(String s) 
    { 
        int n = s.length();  
        char c[] = s.toCharArray(); 
        Arrays.sort(c); 
        for (int i = 0; i < n; i++) 
            if (c[i] != s.charAt(i))  
                return false; 
               
        return true;     
    } 
	
	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner s = new Scanner(System.in);
		String input=s.nextLine();
		System.out.println(isAlphabaticOrder(input));
	}

}
