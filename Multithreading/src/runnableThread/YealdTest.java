package runnableThread;

public class YealdTest {
	public static void main(String[] args) {
		
		Simpleloop sl1 = new Simpleloop();
		Thread t1 = new Thread(sl1);
		t1.setName("t1");
		t1.start();
		
		Simpleloop sl2 = new Simpleloop();
		Thread t2 = new Thread(sl2);
		t2.setName("t2");
		t2.start();
		String tname = Thread.currentThread().getName();
	}

}
