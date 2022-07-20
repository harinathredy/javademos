package innerclass;

class Outerclass{
	String a ="Hello";
	
	class Innerclass{
		public void show() {
			System.out.println(a +", Welcome to inner class tutorials.");
		}
	}
}

public class innerClass {
	public static void main(String[] args) {
		Outerclass out=new Outerclass();
		Outerclass.Innerclass in = out.new Innerclass();
		in.show();
		
	}
	

}
