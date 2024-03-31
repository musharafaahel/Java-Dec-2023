package Chapter6to10;

public class ClassDemo3 {
	public static void main(String[] args) {
		Book book = new Book();
		Book book1 = new Book();
	}
}


class Book{
	Cover cover = new Cover();
}

class Cover {
	public Cover() {
		System.out.println("Cover Object created");
	}
}