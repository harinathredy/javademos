package practiceprogram2accessmodifiers;

public class Private {
	private int id=30;
	private String name="ABC";
	private String village="XYZ";
	
	
	Private(){
		System.out.println("This is private modifier.");
	}
		
		public static void main(String[] args) {
			Private p1=new Private();
			System.out.println(p1.id);
			System.out.println(p1.name);
			System.out.println(p1.village);
		
	}

}
