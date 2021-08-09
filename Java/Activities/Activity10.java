package activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {

	public static void main(String[] args) {
		Set<Integer> hs=new HashSet<>();
		hs.add(2);
		hs.add(5);
		hs.add(7);
		hs.add(12);
		hs.add(2);
		hs.add(7);
		
		System.out.println(hs);
		//size
		System.out.println("Size is: "+hs.size());
		
		//Remove
		System.out.println("Remove 2 : "+hs.remove(2));
		
		//Remove element 
		System.out.println("Remove 40: "+hs.remove(40));
		
		//
		if(hs.contains(12)) {
            System.out.println("No 12 is exist");
        } else {
            System.out.println("No 12 does not exist");
        }
	
		
		//
		System.out.println("My Hashset: "+hs);
	}

}
