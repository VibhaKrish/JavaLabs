package thread;

public class thrd  implements Runnable //runnable is an interface 
{
	 private String a;

	    public thrd(String a) {
	        this.a = a;
	    }

	    @Override
	    public void run() //run method, required by the Runnable interface
	    {
	        for (int count = 1; count <= 5; count++) {
	            System.out.println(a + " - Count: " + count);
	            try {
	                Thread.sleep((long) (Math.random() * 1000));
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	    }
	}


