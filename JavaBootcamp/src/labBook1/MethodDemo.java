package labBook1;
//ConceptofMethods
public class MethodDemo {
	public static void main(String[] args) {
		MethodDemo obj = new MethodDemo();
		obj.metWithoutPara();
		System.out.println(obj.metWithReturn());
		System.out.println(obj.metWithStringReturn());
		System.out.println(obj.metWithArrayReturn()[1]);
		System.out.println(obj.metWithObjectReturn());
	}
	
	
	void metWithoutPara() {
		System.out.println("method without paramenter");
	}
	
	int metWithReturn() {
		System.out.println("method with int return type");
		return 100;
	}
	
	String metWithStringReturn() {
		System.out.println("method with String return type");
		return "welcome";
	}
	
	String[] metWithArrayReturn() {
		System.out.println("method with Array of String return type");
		return new String[] {"aaa", "bbb", "ccc"};
	}
	
	MyClass metWithObjectReturn() {
		System.out.println("met with object return");
		return new MyClass();
	}
	
}

class MyClass {}
