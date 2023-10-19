package thread;

public class multithread {
	public static void main (String[] args) {
		 Thread threadA = new Thread(new thrd("Thread A"));
	        Thread threadB = new Thread(new thrd("Thread B"));

	        threadA.start();
	        threadB.start();
	}
}
