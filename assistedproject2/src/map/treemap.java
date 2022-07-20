package map;

import java.util.*;

public class treemap {
	public static void main(String[] args) {
		
		System.out.println("treeMap:");
		TreeMap<Integer,String> c = new TreeMap<Integer,String>();
		
	c.put(6, "raki");
	c.put(7, "navya");
	
    for(Map.Entry z:c.entrySet()){    
	       System.out.println(z.getKey()+" "+z.getValue());    

	}
	
}

}
