package threads;

public class CreationOfThreads extends Thread {

	public void run() {
		System.out.println("Thread is created......!");
	}

	public static void main(String[] args) {
		CreationOfThreads ct = new CreationOfThreads();
		ct.start();

	}

}
