package lab3.ex5;

public class Lab3Ex5 {
	
	public static void printVariables(String text) {
		String lines[] = text.split("\r\n");
		System.out.println("No of line is: "+lines.length);
		
	
		int wordCount=0;
		int charCount=0;
		for(String str:lines) {
			String words[] =str.split(" ");
			wordCount+=words.length;
			for(String s:words) {
				charCount+=s.length();
			}
			
		}
		System.out.println("No of words is: "+wordCount);
		System.out.println("No of character is: "+charCount);
		
	}
	public static void main(String[] args) {
		
		String text="Mercedes is a German automobile company\r\n"
				+ "It manufactures luxury cars\r\n"
				+ "Maanu Saale is CE0 of MBRDI";
		
		printVariables(text);
		 
		
	}

}
