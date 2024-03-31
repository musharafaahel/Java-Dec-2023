package labBook1;

public class ConsDemo {
	public static void main(String[] args) {
		Human h1 = new Human();
		Human h2 = new Human("Aahel");
		Human h3 = new Human(new String[]{"crying","smiling","seeing"});
	}
}

class Human {
	public Human() {
		System.out.println("Human Object Created");
	}
	
	public Human(String human) {
		System.out.println("Human Object has been created with specified attribute "+human);
	}
	
	public Human(String human[]) {
		System.out.println(human.length);
		for(String i: human) {
			System.out.println(i);
		}
	}
}
