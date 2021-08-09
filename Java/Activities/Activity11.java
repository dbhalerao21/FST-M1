package activities;

import java.util.HashMap;
import java.util.Map;

public class Activity11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> colours = new HashMap<>();
		colours.put(1, "Red");
		colours.put(2, "Yellow");
		colours.put(3, "Pink");
		colours.put(4, "White");
		colours.put(5, "Black");
		
		System.out.println("Colors are: "+colours.values());
		//Remove one colour using the remove() method.
		System.out.println("Remove color: "+colours.remove(2));
		//Check if the colour green exists in the Map using the containsValue() method
		if(colours.containsValue("Green")) {
            System.out.println("Green color exists in the Map");
        } else {
            System.out.println("Green color does not exist in the Map");
        }
		
		//Print the size of the Map using the size() method.
		System.out.println("Size of map is : "+colours.size());
	}

}
