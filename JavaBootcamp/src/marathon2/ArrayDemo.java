package marathon2;

public class ArrayDemo {
	public static void main(String[] args) {
		//Array 3 types
		
		//Single Dimensional
		int arr[] = {10, 20, 30, 40};
		//this is array of size of 1 row 4 columns
		//direct initialization
		
		int arr1[] = new int[6];
		//this is array of size of 1 row 6 columns
		// initialized with 0
		
		
		//To access array
		System.out.println(arr[0]); //will take frst value
		System.out.println(arr1[1]); // will give as default value since we havn't assigned
		
		
		arr1[1] = 100;
		System.out.println(arr1[1]);
		
		System.out.println(arr1.length);
		
		System.out.println("-----------------------");
		for(int i=0; i<arr1.length;i++) {
			System.out.print(arr1[i]+"\t");
		}
		
		
		for(int x:arr) {
			System.out.print(x+"\t");
		}
		
		
		
		//Two Dimensional Array
		
		int twoD[][] = {
			{1, 2, 3},
			{4, 5, 6},
			{7, 8, 9}
		};
		
		System.out.println("\n"+twoD.length);
		
		System.out.println(twoD[2][1]);
		
		
		
		//int twoD2[][] = new int[4][3];
		
		System.out.println("TWO ARRAY using for loop");
		for(int row=0; row < twoD.length; row++) {
			for(int col=0; col < twoD[row].length; col++) {
				System.out.print(twoD[row][col] + "\t");
			}
			System.out.print("\n");
		}
		
		System.out.println("TWO ARRAY using enhanced for loop");
		for(int row1[]:twoD) {
			for(int col:row1) {
				System.out.print(col+"\t");
			}
			System.out.println();
		}
		
		
		System.out.println("TWO ARRAY using while loop");
		int rows =0;
		while(rows < twoD.length) {
			int cols=0;
			while(cols < twoD[rows].length) {
				System.out.print(twoD[rows][cols]+"\t");
				cols++;
			}
			System.out.print("\n");
			rows++;
		}
		
		System.out.println("TWO ARRAY using do while loop");
		
		rows =0;
		 //redeclaring due to scope
		
		do {
			int cols = 0;
			do {
				System.out.print(twoD[rows][cols]+"\t");
				cols++;
			}while(cols < twoD[rows].length);
			System.out.println("\n");
			rows++;
		}while(rows < twoD.length);
		
	}
}

