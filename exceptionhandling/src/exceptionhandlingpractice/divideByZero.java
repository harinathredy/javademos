package exceptionhandlingpractice;
import java.util.Scanner;
public class divideByZero {
	public static void main(String[] args) {
		int p,q,r,s;
		
		System.out.println("Enter two numbers:");
		try {
		Scanner sc = new Scanner(System.in);
		p=sc.nextInt();
		q=sc.nextInt();	
		
		r = p/q;
		s = p%q;
		System.out.println("division"+r+"remainder:"+s);
		}catch(ArithmeticException e) {
			System.out.println("divide by zero is Invalid");
		}
		
		System.out.println("The answer is printed! ");
	}

}
