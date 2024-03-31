package labBook1;

public class ClassDemo22 {
	public static void main(String[] args) {
		TrainingRoom nehru = new TrainingRoom();
		TrainingRoom gandhi = new TrainingRoom();
		System.out.println(TrainingRoom.age);
		TrainingRoom.age = 200;
		System.out.println(nehru.year);
		TrainingRoom gandhi2 = new TrainingRoom();
		System.out.println(gandhi2.age);
	}
}

class TrainingRoom {
	Tv myTv = new Tv();
	static Toilet1 toilet = new Toilet1();
	static int age = 23;
	int year = 2024;
}

class Tv {
	Tv(){
		System.out.println("Tv Object has been created");
	}
}

class Toilet1{
	Toilet1() {
		System.out.println("Toilet Object has been created");
	}
}
