package syncronise;

public class Worker implements Runnable{
	DisplayMessage dm;
	String name;
	Worker(DisplayMessage dm, String name){
		this.dm=dm;
		this.name=name;
	}
	public void run() {
		dm.sayHello(name);
	}

}
