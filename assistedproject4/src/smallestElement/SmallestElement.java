package smallestElement;

import java.util.Arrays;

public class SmallestElement {
	

	    static int arr[] = {45, 79, 2, 5, 74, 4, 19, 56, 2, 88};

	    public static void main(String[] args) {
	        Arrays.sort(arr);
	        System.out.println("The fourth smallest number = " + arr[3]);
	        
	    
	}
}
