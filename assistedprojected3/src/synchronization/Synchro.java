package synchronization;

public class Synchro{
	public synchronized void sync(int n) {
		String tname = Thread.currentThread().getName();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(tname + ": "+ n +": " + i);
		}
	}

	public Synchro(int n) {
		
		
	}

}
