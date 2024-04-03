package labBook1;

public class MethodExample {
	public static void main(String[] args) {
		MethodExample obj = new MethodExample();
		obj.printMessage();
		System.out.println("Area of Square : "+obj.calculateArea(4));
		System.out.println("Area of rectangle :"+obj.calculateArea(4, 8));
		System.out.println(obj.concatenateStrings("Musharaf", "Aahel"));
		System.out.println(obj.concatenateStrings("Musharaf", "Aahel", "A"));
	}
	
	public void printMessage() {
		System.out.println("printMessage Method Called");
	}
	
	public int calculateArea(int length, int width) {
		return length * width;
	} 
	
	public int calculateArea(int side) {
		return side * side;
	} 
	
	String concatenateStrings(String str1, String str2) {
		return str1+" "+str2;
	}
	
	String concatenateStrings(String str1, String str2, String str3) {
		return str1+" "+str2+" "+str3;
	}
}
