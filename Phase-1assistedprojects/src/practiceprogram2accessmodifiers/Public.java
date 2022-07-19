package practiceprogram2accessmodifiers;

public class Public {
	
	public int id=55;
	public String name="ABC";
	public String village="XYZ";
	
	Public(){
		System.out.println("This is public modifier.");
	}
	public static void main(String[] args) {
		Public p=new Public();
		System.out.println(p.id);
		System.out.println(p.name);
		System.out.println(p.village);
	}

}
