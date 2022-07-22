package fileHandlingProject;

import java.io.File;

public class FileHandlingMethods {
	public static void main(String[] args) {
		String path = "C:\\Users\\HARINATHREDDY\\Dropbox\\My PC (LAPTOP-I1PU30SC)\\Desktop\\myfiles\\java.txt";
		File file = new File(path);
		//exist method
		System.out.println(file.exists());
		
		//canRead method
		System.out.println(file.canRead());
		
		//canWrite method
		System.out.println(file.canWrite());
		
		//isFile method
		System.out.println(file.isFile());
		
		//isDirectory method
		System.out.println(file.isDirectory());
		
		//isAbsolute method
		System.out.println(file.isAbsolute());
		
	  
	}

}
