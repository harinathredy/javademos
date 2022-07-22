package synchronization;

public class SynchronizationTest implements Runnable {

	int n;
	Synchro syr;

	SynchronizationTest(int n, Synchro syr) {
		this.n = n;
		this.syr = syr;
	}

	public void run() {
		
		syr.sync(n);

	}

}