package constructor;

public class parameteralconst {
	int rate;
	String name;
	parameteralconst(int r,String n){
		rate = r;
		name = n;
		
	}
	void showdetails() {
		System.out.println(rate+" "+name);
	}
	public static void main(String[] args) {
		parameteralconst obj = new parameteralconst(100,"apple");
		obj.showdetails();
		
	}

}
