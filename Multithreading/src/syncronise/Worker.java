package syncronise;

public class Worker implements Runnable {
	DisplayMessage dm;
	String name;

	Worker(DisplayMessage dm, String name) {
		this.dm = dm;
		this.name = name;
	}

	public void run() {
		dm.sayHello(name);
	}

	public synchronized void sayHello(String name) {
		String tname = Thread.currentThread().getName();
		for (int i = 1; i <= 10; i++) {
			System.out.println(tname + ":" + i + " How are you " + name + "?");

			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {

				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		String tname = Thread.currentThread().getName();
		System.out.println(tname + ": Main method begin..");
		DisplayMessage dm = new DisplayMessage();
		Worker w = new Worker(dm, "ravi");
		Thread t1 = new Thread(w);
		t1.setName("t1");

		Thread t2 = new Thread(new Worker(dm, "ramu"));
		t2.setName("t2");

		Thread t3 = new Thread(new Worker(dm, "raju"));
		t3.setName("t3");

		t1.start();
		t2.start();
		t3.start();
		System.out.println(tname + ": main method end... ");
	}

}
