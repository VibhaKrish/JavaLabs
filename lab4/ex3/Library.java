package src.lab4.ex3;

//import lab4.ex3.Lab4Ex3.Item;
//import lab4.ex3.Lab4Ex3.WrittenItem;

	// Abstract superclass Item
		abstract class Item {
		    private int identificationNumber;
		    private String title;
		    private int numberOfCopies;

		    public Item(int id, String title, int copies) {
		        this.identificationNumber = id;
		        this.title = title;
		        this.numberOfCopies = copies;
		    }

		    public int getIdentificationNumber() {
		        return identificationNumber;
		    }

		    public String getTitle() {
		        return title;
		    }

		    public int getNumberOfCopies() {
		        return numberOfCopies;
		    }

		    public void checkIn() {
		        numberOfCopies++;
		    }

		    public void checkOut() {
		        if (numberOfCopies > 0) {
		            numberOfCopies--;
		        }
		    }

		    public void addItem(int additionalCopies) {
		        numberOfCopies += additionalCopies;
		    }

		    @Override
		    public String toString() {
		        return "ID: " + identificationNumber + ", Title: " + title + ", Copies: " + numberOfCopies;
		    }
		}

		// Abstract subclass WrittenItem
		abstract class WrittenItem extends Item {
		    private String author;

		    public WrittenItem(int id, String title, int copies, String author) {
		        super(id, title, copies);
		        this.author = author;
		    }

		    public String getAuthor() {
		        return author;
		    }

		    @Override
		    public String toString() {
		        return super.toString() + ", Author: " + author;
		    }
		}

		// Subclass Book
		class Book extends WrittenItem {
		    public Book(int id, String title, int copies, String author) {
		        super(id, title, copies, author);
		    }
		    // You can add additional methods or override superclass methods if needed
		}

		// Subclass JournalPaper
		class JournalPaper extends WrittenItem {
		    private int yearPublished;

		    public JournalPaper(int id, String title, int copies, String author, int year) {
		        super(id, title, copies, author);
		        this.yearPublished = year;
		    }

		    public int getYearPublished() {
		        return yearPublished;
		    }

		    @Override
		    public String toString() {
		        return super.toString() + ", Year Published: " + yearPublished;
		    }
		}
