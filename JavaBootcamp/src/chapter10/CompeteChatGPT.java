package chapter10;

public class CompeteChatGPT {
	public static void main(String[] args) {
		int i = 0;
		if(i == 0) {
			try {
				throw new A();
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}

class A extends Exception { //created custom exception
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "This is a custom message of exception A";
	}
} 
