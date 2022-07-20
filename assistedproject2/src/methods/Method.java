package methods;

public class Method {
	int Add() {
	int a=10;
	int b=40;
	int c=a+b;
	return c;
		
	}
	public static void main(String[] args) {
		Method ad = new Method();
	    int result=ad.Add();
	    System.out.println("Result:"+result);
	}
		
	

}
