package map;
import java.util.*;
public class hashmap {
	public static void main(String[] args) {
		System.out.println("Hashmap:");
		
		HashMap<Integer,String> a = new HashMap<Integer,String>();
		a.put(1,"ramu");
		a.put(2, "ravi");
		a.put(3,"raji");
		for(Map.Entry x:a.entrySet()) {
				System.out.println(x.getKey()+" "+x.getValue());
		}
	}
}
