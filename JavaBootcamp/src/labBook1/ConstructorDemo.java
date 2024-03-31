package labBook1;

public class ConstructorDemo {
	public static void main(String[] args) {
		Car c1 = new Car();
		Car c2 = new Car("Toyota" , "Camry");
		Car c3 = new Car("Honda", 2022, 25000);
	}
}

/**
 * In Java we have two types of constructors number one default constructor and number two parameterized constructor the main difference between these two constructors is default constructor will not have any parameters to accept whereas parameterized constructor will have one or more parameters to accept we can use these two constructor at the same time within a class but only one constructor will be called when object is created depending upon the call
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
