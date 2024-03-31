package marathon2;

public class ClassDemo1 {
	public static void main(String[] args) {
		ShoeShop myshop =  new ShoeShop();
		String result = myshop.sellShoe1();//calling a method using object.
		System.out.println(result);
	}
}

class ShoeShop{
	public ShoeShop() {
		System.out.println("Shoe shop constructor called");
	}
	
	public void sellShoe() {
		System.out.println("Shoe void method called");
	}
	
	public String sellShoe1() {
		return "fsdds";
	}
}
