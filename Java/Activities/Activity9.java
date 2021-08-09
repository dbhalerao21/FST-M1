package activities;

import java.util.ArrayList;
import java.util.List;

public class Activity9 {

	public static void main(String[] args) {
		List<String> myList =new ArrayList <>();
		myList.add("Anu");
		myList.add("Jay");
		myList.add("Om");
		myList.add("Pooja");
		myList.add("Shree");
		
		// print all the names 
	for(int i=0;i<myList.size();i++) {
		System.out.print(myList.get(i)+",");	
	}
	System.out.println("");
	// use get() method to retrieve the 3rd name 
	System.out.println("3rd name in the list: "+myList.get(2));
	
	//contains() method to check if a name exists
	System.out.println("OM is Exist or not: "+myList.contains("Om"));
	
	//size() method to print the number of names 
	System.out.println("Size of list: "+myList.size());
	
	//remove() method to remove a name from the list and print the size()
	System.out.println("Remove :"+myList.remove(1));
	System.out.println("Size of list after deleting : "+myList.size());

	}

}
