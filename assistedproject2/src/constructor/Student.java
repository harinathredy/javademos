package constructor;

public class Student {
	int rollNum;
	String name;
	Student(){
		System.out.println("This is default constructer");
	}
	void show() {
		System.out.println(rollNum+" "+name);
	}
	public static void main(String[] args) {
		Student s= new Student();
		s.show();
	}
	

}
