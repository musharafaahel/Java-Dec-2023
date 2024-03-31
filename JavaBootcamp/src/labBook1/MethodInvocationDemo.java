package labBook1;

public class MethodInvocationDemo {
	public static void main(String[] args) {
		MethodInvocationDemo m = new MethodInvocationDemo();
		m.printMessage();
		System.out.println(m.getRandomNumber());
		System.out.println(m.concatenateStrings("Musharaf ", "Aahel"));
		System.out.println(m.getUpperCaseString("musharafaahel"));
	}
	
	void printMessage() {
		System.out.println("printMessage - void method");
	}
	
	int getRandomNumber() {
		System.out.println("getRandomNumber - return int method");
		double i  = Math.random() * 100;
		int n = (int) i;
		return n;
	}
	
	String concatenateStrings(String s1, String s2) {
		System.out.println("concatenate - return string method");
		return s1+s2;
	}
	
	String getUpperCaseString(String s1) {
		System.out.println("getUpperCaseString - return string method");
		return s1.toUpperCase();
	}
}
