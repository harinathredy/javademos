package map;
import java.util.*;
public class hashtable {
	public static void main(String[] args) {
		
		System.out.println("hashTable:");
		Hashtable<Integer,String> b = new Hashtable<Integer,String>();
		
	b.put(4, "raki");
	b.put(5, "navya");
	
    for(Map.Entry y:b.entrySet()){    
	       System.out.println(y.getKey()+" "+y.getValue());    

	}
	
}

}
