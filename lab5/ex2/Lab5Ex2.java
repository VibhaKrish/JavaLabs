package lab5.ex2;


class BlankNameException extends Exception {
    public BlankNameException(String message) {
        super(message);
    }
}

class Employee {
	 private String firstName;
	    private String lastName;

	    public Employee(String firstName, String lastName) throws BlankNameException {
	        if (firstName.isEmpty() || lastName.isEmpty()) {
	            throw new BlankNameException("First name and last name cannot be blank.");
	        }

	        this.firstName = firstName;
	        this.lastName = lastName;
	    }

	    public String getFullName() {
	        return firstName + " " + lastName;
	    }
	}

	public class Lab5Ex2 {
	    public static void main(String[] args) {
	        try {
	            Employee employee1 = new Employee("Raghav", "Ben");
	            System.out.println("Full Name: " + employee1.getFullName());
	            Employee employee2 = new Employee("", "");
	            System.out.println("Full Name: " + employee2.getFullName());
	        } catch (BlankNameException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }

}

