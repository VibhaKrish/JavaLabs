package lab3.ex4;

import java.util.Scanner;

public class Lab4Ex4 {
	
	public static String AbsDifference(String input) {
		String s="";
		for(int i=0;i<input.length();i++) {
			Integer no1;
			Integer no2;
			Integer diff=0;
			if(i==input.length()-1) {
				no1=Integer.valueOf(input.charAt(input.length()-1));
				no2=Integer.valueOf(input.charAt(0));
				diff=Math.abs(no1-no2);
				
			}
			else {
				no1=Integer.valueOf(input.charAt(i));
				no2=Integer.valueOf(input.charAt(i+1));
				diff=Math.abs(no1-no2);
			}
			s+=diff.toString();
		}
		System.out.println(s);
		return s;
		
	}
	
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s = new Scanner(System.in);
		String input=s.nextLine();
		AbsDifference(input);
		
	}

}
