package synchronization;

public class Test {
	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		Synchro sy = new Synchro(0);
		
		SynchronizationTest st = new SynchronizationTest(10,sy);
		Thread t1 = new Thread(st);
		
		SynchronizationTest st1 = new SynchronizationTest(50, sy);
		
		Thread t2 = new Thread(st1);
		t1.start();
		t2.start();
		
		
		
		
	}

}
