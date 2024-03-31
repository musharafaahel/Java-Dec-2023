package Chapter6to10;

public class ClassDemo2 {
	
	
	public static void main(String[] args) {
		Laddu myladdu = new Laddu();
		ClassDemo2 obj = new ClassDemo2();
		System.out.println("Laddu Size before PBV : "+myladdu.size);
		obj.passByValue(myladdu.size);
		System.out.println("Laddu Size afet PBV : "+myladdu.size);
		
		System.out.println("Laddu Size before PBR : "+myladdu.size);
		obj.passByReference(myladdu);
		System.out.println("Laddu Size afet PBR : "+myladdu.size);
	}
	
	public void passByReference(Laddu laddu) {
		laddu.size = 11;
	}
	
	public void passByValue(int size) {
		size = 9;
		
	}
}


class Laddu {
	int size = 10;
}