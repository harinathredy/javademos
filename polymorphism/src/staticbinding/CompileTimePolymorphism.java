package staticbinding;

public class CompileTimePolymorphism {
	public static void main(String[] args) {
		CompileTimePolymorphism obj=new CompileTimePolymorphism();
		obj.add(2,3);
		obj.add(2,3,4);
		obj.add(2.3f,4.5f);
	}
	void add(int a,int b) {
		int result=a+b;
		System.out.println("Result ="+result);
		
	}
	void add(float a,float b) {
		float result=a+b;
		System.out.println("Result ="+result);
		
	}
	void add(int a,int b,int c) {
		int result=a+b+c;
		System.out.println("Result ="+result);
		
	}

}
