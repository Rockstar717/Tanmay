// compare two number //

package exercise.java;

//import java.util.Scanner;

public class Compare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner sc =new Scanner(System.in); 
		 * System.out.println("enter the value a");
		 * int num1=sc.nextInt(); 
		 * System.out.println("enter the value b"); int int
		 * num2=sc.nextInt();
		 */

		int num1 = 250;
		int num2 = 120;
		if (num1 > num2) {
			System.out.println(num1 + "is greater than" + num2);
		} else if (num1 < num2) {
			System.out.println(num1 + "is less than" + num2);
		} else {
			System.out.println(num1 + "is equal to" + num2);

		}
	}

}
