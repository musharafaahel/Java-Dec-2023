package marathon2;

public class DecisionMakingDemo {
	public static void main(String[] args) {
		int x = 10;
		if(x!=10) {
			System.out.println("Not equal to 10");
		}else if(x >10) {
			System.out.println("Greater than 10");
		}else if(x<10) {
			System.out.println("Less than 10");
		}else {
			System.out.println("Equal to 10");
		}
		
		
		String day = "Wednesday";
		if(day.equals("monday")) {
			System.out.println("Monday Matched");
		}
		
		
		switch(day) {
			case "monday":{
				System.out.println("Monday matched");
				break;
			}
			case "tuesday":{
				System.out.println("tuesday matched");
				break;
			}
			default: {
				System.out.println("Other days");
			}
		}
		
		
		String result = (70>25)?"Pass":"Fail";
	}
}
