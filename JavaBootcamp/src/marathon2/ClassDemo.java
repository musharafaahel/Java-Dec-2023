package marathon2;

public class ClassDemo {
	public static void main(String[] args) {
		new Human(); //Anonymous Onject
//		Human musharaf = new Human(); // A human object is created with name musharaf
//		Human aahel; //variable of complex type Human
	}
}

class Human {
	//I can have constructor
	public Human(){
		System.out.println("Baby starts crying");
	}
}