package helloworld;

public class ternary {

	public static void main(String[] args) {
		int age = 19;
		boolean hasLicence = true;

		boolean canDrive =(age>18)? true : false;
		boolean canRentAcar = canDrive ? ( hasLicence? true : false) : false;
		
		System.out.println("age = "+ age);
		System.out.println("Has Licience =" + hasLicence);
		System.out.println("Can Drive ?" + canDrive);
		System.out.println("Can Rent a car " + canRentAcar);
		
		//
		
		System.out.println("");
		
		//string result = canDrive ? (hasLicence ? "Has Licence Can drive" : "No licence can't drive") :"Cannot drive";
		
		//System.out.println(result);
		

	}

}
