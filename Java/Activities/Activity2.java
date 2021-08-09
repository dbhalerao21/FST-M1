package activities;

public class Activity2 {

	public boolean addition() {
		int num[] = { 10,10, 77, 10, 54, -11, 10 };
		int sum = 0;
		for (int a = 0; a < num.length; a++) {
			if (num[a] == 10) {
				sum = sum + num[a];				
			}
		}
		System.out.println("Sum is :"+sum);
		return sum==30;
		
	}

	public static void main(String[] args) {
		Activity2 test=new Activity2();
		boolean result=test.addition();
		System.out.println(result);
	}

}
