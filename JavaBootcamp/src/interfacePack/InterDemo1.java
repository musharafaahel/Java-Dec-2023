package interfacePack;

public class InterDemo1 {
	public static void main(String[] args) {
//		Mahatma Gandhi way
		myInter mi1 = new MyInterImpl();
		mi1.met();
		
//		RajivGandhi way - Anonymous class implementation
		new myInter() {
			
			@Override
			public void met() {
				System.out.println("rahiv gandhi way");
				
			}
		}.met();
		
//		Rahul Gandhi - Lamda Implementation - this works only for functional interfaces
		myInter my2=()->System.out.println("rahul gandhi implemenation");
		my2.met();
		
//		Priyanka Gandhi way - Method Referencing - works only for Functional interface - 1
		myInter my3 = InterDemo1::myMetLogic;
		my3.met();
	}
	
	public static void myMetLogic() {
		System.out.println("vadodras logic");
	}
}

interface myInter{
	public void met();
}

class MyInterImpl implements myInter {
	public void met() {
		System.out.println("mahatma gandhi way");
	}
}