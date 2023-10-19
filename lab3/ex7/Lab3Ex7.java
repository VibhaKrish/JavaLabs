package lab3.ex7;

import java.time.*;   
import java.util.*;   
class Lab3Ex7 {    
    static void find(LocalDate  first_date, LocalDate second_date)   
    {   
       
        Period difference = Period.between(first_date, second_date);    
        System.out.print("Difference between two dates is:\n");   
        System.out.printf( "%d days, %d months and %d years",   
            difference.getDays(),  
            difference.getMonths(),   
            difference.getYears());   
    }   
    
    public static void main(String[] args)   
    {   
    	System.out.println("Enter the date");
		Scanner s = new Scanner(System.in);
		String input=s.nextLine();
        LocalDate first_date = LocalDate.parse(input);   
        LocalDate second_date = LocalDate.now();     
        find(first_date, second_date);   
    }   
}  


