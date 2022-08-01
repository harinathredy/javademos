package virtualKeysForRepository;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Operations {
	public static void methods() {
		File folder = new File(
				"C:\\Users\\HARINATHREDDY\\Dropbox\\My PC (LAPTOP-I1PU30SC)\\Desktop\\project\\main");
		boolean temp = true;
		while (temp) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			switch (n) {

			case 1:
				System.out.println("Enter a file to enter");
				String fileName = sc.next();
				if (new File(folder, fileName).exists()) {
					System.out.println("file already exists");

				} else {
					File folder1 = new File(folder, fileName);
					folder1.mkdir();
					System.out.println("file successufully added");
				}

				break;

			case 2:
				System.out.println("Enter the file name to delete");
				String filename = sc.next();
				boolean fl = new File(folder, filename).exists();
				System.out.println(fl);
				if (fl == true) {
					File fl1 = new File(folder, filename);
					fl1.delete();
					System.out.println("file deleted successfully");
				} else {
					System.out.println("file does not exists");
				}
				break;

			case 3:
				 System.out.println("Enter a file name to search");
                 String sch = sc.next();

                 File arr1[] = folder.listFiles();
                 for(int i=0;i<arr1.length;i++){
                	// Arrays.sort(arr1);
                     if(arr1[i].getName().startsWith(sch)){
                    	
                         System.out.println(arr1[i]);
                         break;
                     }else{
                         System.out.println("No file found");
                     }
                 }
				break;

			case 4:
				temp = false;
				System.out.println("Back to main menu.");
				// Main mn=new Main();
				Main.work();
				break;
			case 5:
				System.out.println("closing the program!");
				System.exit(0);

			default:
				System.out.println("Invalid input && please enter valid input");
			}
		}
	}
}
