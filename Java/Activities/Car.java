package activities;

public class Car {

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;

	public Car() {
		tyres = 4;
		doors = 4;

	}

	public void displayCharacteristics() {
		System.out.println("Car Color: " + color);
		System.out.println("Car Transmission: " + transmission);
		System.out.println("Car Make: " + make);
		System.out.println("Car Tyres: " + tyres);
		System.out.println("Car Doors: " + doors);

	}

	public void accelarate() {
		System.out.println("Car is moving forward.");

	}

	public void brake() {
		System.out.println("Car has stopped");

	}
}
