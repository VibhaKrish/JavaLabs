package lab3.ex3;

import java.util.Scanner;

public class Lab3Ex3 {
	
	public static String replaceLetter(char[] c) {
		
		for(int i=0;i<c.length;i++) {
			if(c[i]!='a' && c[i]!='e' && c[i]!='i' && c[i]!='o' && c[i]!='u') {
				if(c[i]=='z') {
					c[i]='a';
				}
				else {
					c[i]=(char)(c[i]+1);
				}
				
			}
			
			
		}
		String str=new String(c);
		return str;
	}
	
	
public static void main(String[] args) {
	
	System.out.println("Enter a word");
	Scanner s = new Scanner(System.in);
	String input=s.nextLine();
	char[] c=input.toCharArray();
	String output=replaceLetter(c);
	System.out.println(output);
	
}

}
