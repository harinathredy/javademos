package helloworld;
 import java.util.Scanner;
 
public class quizprogram {
	public static void main(String[] args) {
		int answer;
		System.out.println("who is the founder of blue origin?");
		System.out.println("1.hari\n2.mahesh\n3.ravi\n4.jeff bezzos");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Answer:");
		answer=sc.nextInt();
		if(answer==1) {
			System.out.println("wrong Answer! Please try again");
		}else if(answer==2){
			System.out.println("wrong Answer! Please try again");
		}else if(answer==3) {
			System.out.println("wrong Answer! Please try again");
		}else {
			System.out.println("Correct! Great job");
		}
	}

}
