package practiceprogram2accessmodifiers;

public class Default {
	int id=10;
	String name="ABC";
	String village ="XYZ";

   Default(){
	   System.out.println("This is default modifier");
	 }
   public static void main(String[] args) {
	  Default d= new Default();
	  System.out.println(d.name);
	  System.out.println(d.id);
	  System.out.println(d.village);
			  
   }

}