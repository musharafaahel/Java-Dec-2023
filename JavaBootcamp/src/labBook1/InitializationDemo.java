package labBook1;

public class InitializationDemo {
	public static void main(String[] args) {
		House house = new House();
	}
}

/**
 * Static methods blocks variables class will be the first executed
 * it is executed in which order we have declared 
 * Static methods cannot access nonstatic methods or nonstatic variables and it cannot contain this or super keyword
 * We can access the static method and static variable without creating the object by directly calling the class name dot method name or class name dot variable name
 * Static variables or methods we need a shared memory so if we change anything the data present inside any particular point of time it will be reflected in every instance because it does not have instance it will be changed irrespectively of the classes 
 */

class House {
	Room rooms = new Room();
	static Garden garden = new Garden();
}

class Room {
	Room() {
		System.out.println("Creation of Room Object");
	}
}
class Garden{
	Garden() {
		System.out.println("Creation of Garden Object");
	}
}