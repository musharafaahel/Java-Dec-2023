package labBook1;

public class MethodInvocationDemo {
	public static void main(String[] args) {
		MethodInvocationDemo m = new MethodInvocationDemo();
		m.printMessage();
		System.out.println(m.getRandomNumber());
		System.out.println(m.concatenateStrings("Musharaf ", "Aahel"));
		System.out.println(m.getUpperCaseString("musharafaahel"));
	}

	/** There are two types of method number one non returnable method and returnable method
	* Non returnable method for those which have void returnable methods for those which have int string double float some data types in front
	* Use of non-returnable method is to just print a message onto the formal logic in behind
 	* Use of a returnable method is to give a written value that is to give something back to the calling function
	*/
	// Non - Returnable Method
	void printMessage() {
		System.out.println("printMessage - void method");
	}


	// Returnable Method
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
