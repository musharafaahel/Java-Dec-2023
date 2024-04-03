package labBook1;

public class MethodDemo3 {
	public static void main(String[] args) {
		MethodDemo3 obj = new MethodDemo3();
		obj.metWithParam("Musharaf Aahel");
		System.out.println(obj.metWithParamAndReturn("Musharaf Aahel", 23));
		System.out.println(obj.metWithParamAndReturn("Musharaf Aahel", 23, 10000));
		obj.findAbsolute();
	}
	
	public void metWithParam(String s) {
		System.out.println("Met with Param Called "+s);
	}
	
	public String metWithParamAndReturn(String name, int age) {
		return name+" "+age;
	}
	
	public String metWithParamAndReturn(String name, int age, int money) {
		return name+" "+age+" "+money;
	}
	
	public void findAbsolute() {
		System.out.println(Math.abs(100));
		System.out.println(Math.abs(100f));
		System.out.println(Math.abs(100L));
		System.out.println(Math.abs(100D));
	}
}
