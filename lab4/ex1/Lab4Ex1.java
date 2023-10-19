package src.lab4.ex1;

import java.util.Random;

class Account {
    private long accNum;
    private double balance;
    private Person accHolder;
	
    public long getAccNum() {
		return accNum;
	}
	
    public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	
    public double getBalance() {
		return balance;
	}
	
    public void setBalance(double balance) {
		this.balance = balance;
	}
	
    public Person getAccHolder() {
		return accHolder;
	}
	
    public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}

    public Account(Person accHolder, double initialBalance) {
    	Random random = new Random();
    	this.accNum = random.nextLong();
        this.balance = initialBalance;
        this.accHolder = accHolder;
    }
    
    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }
}

class CurrentAccount extends Account {
    
	private double overdraftLimit;

    public CurrentAccount(Person accHolder, double initialBalance, double overdraftLimit) {
        super(accHolder, initialBalance);
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= -overdraftLimit) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal not allowed. Exceeds overdraft limit.");
        }
    }
}

class SavingsAccount extends Account {

	private final double minimumBalance = 500;

    public SavingsAccount(Person accHolder, double initialBalance) {
        super(accHolder, initialBalance);
    }
    
    @Override
    public void withdraw(double amount) {
        if (getBalance() - amount >= minimumBalance) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal not allowed. Below minimum balance.");
        }
    }
}


class Person {
    private String name;
    private float age;
	
    public String getName() {
		return name;
	}
	
    public void setName(String name) {
		this.name = name;
	}
	
	public float getAge() {
		return age;
	}
	
	public void setAge(float age) {
		this.age = age;
	}
}

public class Lab4Ex1 {
	public static void main(String[] args) {
		Person smith = new Person();
		smith.setName("Smith");
		smith.setAge(35);

		Person kathy = new Person();
		kathy.setName("Kathy");
		kathy.setAge(28);

		Account smithAccount = new Account(smith, 2000);
		Account kathyAccount = new Account(kathy, 3000);

		smithAccount.deposit(2000);
		kathyAccount.withdraw(2000);

		System.out.println("Smith's Balance: " + smithAccount.getBalance());
		System.out.println("Kathy's Balance: " + kathyAccount.getBalance());
		
		
		
		SavingsAccount savingsAccount = new SavingsAccount(smith, 2000);
        savingsAccount.withdraw(1500);

        CurrentAccount currentAccount = new CurrentAccount(kathy, 3000, 2000);
        currentAccount.withdraw(4000);
        
        System.out.println("Smith's Balance: " + savingsAccount.getBalance());
		System.out.println("Kathy's Balance: " + currentAccount.getBalance());
	}
}