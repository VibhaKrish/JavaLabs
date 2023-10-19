package lab3.ex2;

import java.util.Scanner;

public class Lab3Ex2 {
	public static String reverseword(String args) {
		StringBuffer sb=new StringBuffer(args);
		sb=sb.reverse();
		System.out.println("Reversed word: "+sb);
		return sb.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a word");
		Scanner s = new Scanner(System.in);
		String input=s.nextLine();
		String reverse=reverseword(input);
		String output=input+"|"+reverse;
		System.out.println(output);
		
	}

}
