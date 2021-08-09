package activities;

public class Activity12 {

	public static void main(String[] args) {
		//without body
		Addable ad1=(a,b) ->(a+b);
		System.out.println("Addition is :"+ad1.add(5, 6));
		
		//With body
		Addable ad2=(x,y)-> { return(x+y);		
		};
		System.out.println("Addition is :"+ad2.add(2, 3));
	}

}
