package labBook1;

import java.util.Scanner;

public class HelloWorld {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		System.out.println("Enter your name : ");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine(); // Sc.next() Will take only the first word if we use the space it won't take those words which are after the space sc.nextLine() Will take the whole bunch of words whatever we enter 
		
		System.out.println("Your name is : "+ name);
	}
}
