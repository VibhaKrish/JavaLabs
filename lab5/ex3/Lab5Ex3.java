package lab5.ex3;



class EmployeeException extends Exception {
    public EmployeeException(String message) {
        super(message);
    }
}

class Emp {
    private String name;
    private double salary;

    public Emp(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void validateSalary() throws EmployeeException {
        if (salary < 3000) {
            throw new EmployeeException("Salary is below 3000 for employee: " + name);
        } else {
            System.out.println("Salary is valid for employee: " + name);
        }
    }
}

public class Lab5Ex3 {
	public static void main(String[] args) {
        Emp employee1 = new Emp("Kumar", 1500);
        Emp employee2 = new Emp("Amith", 3300);

        try {
            employee1.validateSalary();
        } catch (EmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        try {
            employee2.validateSalary();
        } catch (EmployeeException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}