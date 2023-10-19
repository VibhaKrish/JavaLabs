package threadstudent;

public class Student {
	 public static void main(String[] args) {
	        Thread employee1 = new Thread(() -> {
	            for (int task = 1; task <= 5; task++) {
	                System.out.println("Student 1 is working on Task " + task);
	                try {
	                    Thread.sleep((long) (Math.random() * 1000));
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        Thread employee2 = new Thread(() -> {
	            for (int task = 1; task <= 5; task++) {
	                System.out.println("Student 2 is working on Task " + task);
	                try {
	                    Thread.sleep((long) (Math.random() * 1000));
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        Thread employee3 = new Thread(() -> {
	            for (int task = 1; task <= 5; task++) {
	                System.out.println("Student 3 is working on Task " + task);
	                try {
	                    Thread.sleep((long) (Math.random() * 1000));
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        });

	        employee1.start();
	        employee2.start();
	        employee3.start();
	    }

}
