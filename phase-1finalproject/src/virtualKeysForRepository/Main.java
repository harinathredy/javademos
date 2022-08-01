package virtualKeysForRepository;
import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//Main mn = new Main();
		Main.work();

	}

	public static void work() {
		File folder = new File("C:\\Users\\HARINATHREDDY\\Dropbox\\My PC (LAPTOP-I1PU30SC)\\Desktop\\project\\main");
		folder.mkdir();
		while (true) {
			System.out.println("*****************Welcome to Virtual key repository Application********************\n");
			System.out.println("                             This application was developed by Harinath Reddy.");
			System.out.println("\n");

			System.out.println("-----------------------------------------------------------------------------------");
			System.out.println( "\n");
			System.out.println("1.Retrieving the file names in an ascending order\n ");
			System.out.println("2.some more operations:Add,Delete and Searching\n ");
			System.out.println("3.Option to close the application\n");
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				// String fn=sc.next();
				File arr[] = folder.listFiles();
				Arrays.sort(arr);
				for (int i = 0; i < arr.length; i++)

					System.out.println(arr[i]);
				System.out.println("\n");

				break;
			case 2:
				System.out.println("*****************************************************************\n");
				System.out.println("more features:-\n");
				System.out.println("  1.Add a file to the existing directory list\n");
				System.out.println("  2.Delete a user specified file from the existing directory list\n");

				System.out.println("  3.Search a user specified file from the main directory\n");
				System.out.println("  4.Back to Main Menu\n");
				System.out.println("  5.closing the program!\n");
				//System.out.println("\n");
				System.out.println("Enter your choice: ");
				
				// sc.nextInt();
				Operations op = new Operations();

				Operations.methods();
			case 3:
				System.out.println("closing the program!");
				System.exit(0);
			default:
				System.out.println("Invalid input && please enter valid input");

			}

		}

	}
}
