package activities;

public class Activity1 {

	public static void main(String[] args) {
		Car carName = new Car();
		carName.color="Black";
		carName.make=2014;
		carName.transmission="Manual";
		
		carName.displayCharacteristics();
		carName.accelarate();
		carName.brake();
	}

}
