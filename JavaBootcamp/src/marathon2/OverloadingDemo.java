package marathon2;

public class OverloadingDemo {
	public static void main(String[] args) {
		new Animal("Ahel", 1);
		
		Animal ani = new Animal();
		ani.run("run");
	}
}

class Animal {
	public Animal() {
		System.out.println("Empty Constructor");
	}
	
	public Animal(String s) {
		System.out.println("Constructor with string");
	}
	
	protected Animal(String str, int i) {
		System.out.println("Constror with string and int");
	}
	
	
	public void run() {
		System.out.println("Empty parameter method");
	}
	
	public void run(String str) {
		System.out.println("With paramter");
	}
}
