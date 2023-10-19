package src.lab4.ex3;

public class Lab4Ex3 {
	public static void main(String[] args) {

        Book book1 = new Book(1, "Sample Book 1", 5, "Abc Dcv");
        JournalPaper journal1 = new JournalPaper(2, "Sample Journal 1", 3, "Bcd ASd", 2023);

        System.out.println("Book 1: " + book1.toString());
        System.out.println("Journal 1: " + journal1.toString());

        book1.checkOut();
        journal1.addItem(2);

        System.out.println("After operations:");
        System.out.println("Book 1: " + book1.toString());
        System.out.println("Journal 1: " + journal1.toString());
    }
}
