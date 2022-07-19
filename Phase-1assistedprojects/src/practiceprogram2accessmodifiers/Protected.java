package practiceprogram2accessmodifiers;

public class Protected {
	protected int num=7;
	protected String name ="apple";
	
	Protected(){
		System.out.println("This is protected modifier.");
		
	}
	public static void main(String[] args) {
		Protected p2=new Protected();
		System.out.println(p2.num);
		System.out.println(p2.name);
	}

}
