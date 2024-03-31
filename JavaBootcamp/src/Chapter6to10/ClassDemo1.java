package Chapter6to10;

public class ClassDemo1 {
	public static void main(String[] args) {
		new Human(); //Anonymous object
		Human aahel = new Human("aaa"); // named object aahel is the name or reference
		Human musharaf; //declaring a variable by name musharaf of type human
		aahel.met();
		Human ak = new Human("bbb");
		ak.met();
		
		
	}
}
class Human{
	String s; //Instance variable
	public Human() { //empty constructor
		System.out.println("Empty Constructor");
	}
	
	public Human(String s ) { // Overloaded constructor
		this.s =s;
		System.out.println("Overloaded String constructor called");
	}
	
	public void met() {
		System.out.println(s);
//		new Hotel().customer(this);
		Hotel bhavan = new  Hotel();
		bhavan.customer(this);
	}
}



class Hotel{
	public void customer(Human human) {
		System.out.println(human);
	}
}