package exceptionHandling;

import java.util.Scanner;

public class TryandCatch {
	
	public static void main(String[] args) {
		System.out.println("Enter two numbers:");
		
		
		
		
		try {
			Scanner sc = new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int c =a/b;
			System.out.println("Reminder: "+c);
			
		}catch(ArithmeticException e) {
			System.out.println("Divide by zero is invilid!");
			
		}
		
		
		
		
		
	}
	

}
