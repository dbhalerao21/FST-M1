package activities;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Activity13 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);		
		System.out.print("Please Enter numbers :");
		
		List<Integer> list=new ArrayList<>();
		while(scan.hasNextInt()) {
		    list.add(scan.nextInt());
		}
		
		Integer nums[] = list.toArray(new Integer[0]);
		Random indexGen=new Random();
		int index = indexGen.nextInt(nums.length);
		System.out.println("Index value: " + index);
        System.out.println("Value in arary at1 index: " + nums[index]);
 
	}

}
