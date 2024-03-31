package exceptionHandling;

public class ExceptionDemo1 {
	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			int i = 1/Integer.parseInt(args[0]); //Will throw arithmetic exception - Abnormal Condition
		}catch(ArithmeticException e) { //Accepting the exception or Catching the exception.
			System.out.println(e);
			e.printStackTrace();
		}catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}catch (NumberFormatException e) {
			e.printStackTrace();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			System.out.println("Finally Called");
		}
		System.out.println("After Exception");

		// Testing the PR
	}
}
