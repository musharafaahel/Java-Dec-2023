package labBook1;

public class ConstructorDemo {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Toyota" , "Camry");
		Car c3 = new Car("Honda", 2022, 25000);
	}
}

/**
 * Constructor Overloading
 * Name should be same
 * Parameter name can be same but it is mandate to have different datatype
 * Access specifier  - private default protected public
 */

class Car {
	public Car() {
		System.out.println("Car Object has been created");
	}
	
	Car(String make, String model) {
		System.out.println("Car Object has been created with the specified "+make+" and "+model);
	}
	
	public Car(String make, int model) {
		System.out.println("Car Object has been created with the specified "+make+" and "+model);
	}
	
	public Car(String make, int year, double price) {
		System.out.println("Car Object has been created with the specified "+make+" "+year+" and "+price);
	}
}
