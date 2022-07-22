package threads;
import java.util.*;

public class RunnableThread implements Runnable {

	@Override
	public void run() {
		System.out.println("Main Thread is running......!");
		for(int i=1;i<=15;i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
		
	}
	public static void main(String[] args) {
		RunnableThread rt = new RunnableThread();
		Thread t = new Thread(rt);
		t.start();
	}
	
	

}
