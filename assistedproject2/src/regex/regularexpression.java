package regex;
import java.util.regex.*;
public class regularexpression {
	public static void main(String[] args) {
		Pattern p=Pattern.compile("welcome to college",Pattern.CASE_INSENSITIVE);
		Matcher m =p.matcher("WELCOME TO COLLEGE");
		boolean matchfound =m.find();
		
		if(matchfound) {
			System.out.println("Match Found");
		}else {
			System.out.println("Match not Found");
		}
		
	}

}
