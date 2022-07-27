package list;

import java.util.ArrayList;

public class List {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		
		ArrayList<Integer> al= new ArrayList<>();
		al.add(33);
		al.add(77);
		al.add(88);
		System.out.println(al);
		ArrayList<String> str =new ArrayList<>();
		str.add("apple");
	    str.add("banana");
	    str.add("grape");
	    System.out.println(str);
	}

}
