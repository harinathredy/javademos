package superkeyword;

public class Child extends Parent{
	
	int c,d;
	
	Child(){
		
	}
	Child(int c , int d){
		this.c=c;
		this.d=d;
	}
	Child(int a, int b, int c,int d){
		super(a,b);
		this.c=c;
		this.d=d;
	}
	void displayDetails() {
		System.out.println("Parent");
	}

}
