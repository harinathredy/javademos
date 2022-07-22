package fileHandlingProject;

import java.io.File;

public class Deletingfile {

		public static void main(String[] args) {
			String path = "C:\\Users\\HARINATHREDDY\\Dropbox\\My PC (LAPTOP-I1PU30SC)\\Desktop\\myfiles\\XYZ";
			File myfile = new File(path);

			System.out.println(myfile.delete());
		}
	}
