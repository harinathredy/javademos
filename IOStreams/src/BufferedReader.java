import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOExeception;

public class BufferedReader {
	public static void main(String[] args) {
		FileReader fr = new FileReader("C:\\Users\\HARINATHREDDY\\Dropbox\\My PC (LAPTOP-I1PU30SC)\\Desktop\\myfiles\\java.txt");
		BufferedReader br = new BufferedReader(fr);
		String line;
		while((line = br.readLine()) !=null) {
			
		}
		System.out.println("count of words in the file = ");
	}

}
