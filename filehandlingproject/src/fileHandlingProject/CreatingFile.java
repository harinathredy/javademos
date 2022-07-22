package fileHandlingProject;

import java.io.File;
import java.io.IOException;

public class CreatingFile {
	public static void main(String[] args) {
		String path = "C:\\Users\\HARINATHREDDY\\Dropbox\\My PC (LAPTOP-I1PU30SC)\\Desktop\\myfiles\\XYZ";
		File myfile =new File(path);
		
		try {
			System.out.println(myfile.createNewFile());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
