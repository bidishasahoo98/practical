package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {
	public static void main(String[] args) {
	LinkedList<String> ll = new LinkedList<String>(); // creating new linkedlist named 'll'
	
	// adding elements by add() method
	ll.add("India");
	ll.add("Japan");
	ll.add("Russia");
	ll.add("USA");
	ll.add("France");
	
	Iterator<String> itr = ll.iterator(); // iterator object 
	while(itr.hasNext())
		System.out.println(itr.next()); // printing elements
}
}
