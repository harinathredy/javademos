package threads;

public class SleepAndWait implements Runnable {
	private static Object obj = new Object();

	public void run() {

		String tname = Thread.currentThread().getName();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(tname + ": Thread wakeups after 2 seconds");
		
		synchronized(obj) {
			//String tname = Thread.currentThread().getName();
			try {
				obj.wait(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(tname+": Thread waits for 2 seconds");
			
		}

	}

	public static void main(String[] args) {
		
		SleepAndWait sw = new SleepAndWait();
		Thread t1 = new Thread(sw);
		t1.start();

		System.out.println( "checking sleep and wait methods");

	}

}
