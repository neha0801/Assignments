import java.util.Scanner;

class Division {
	public static void main(String[] args) {

		int a, b, result = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Input two integers");

		a = input.nextInt();
		b = input.nextInt();
		try {
			// division operation
			result = a / b;
		} catch (ArithmeticException e) {
			// if user entered b as 0 exception occurs
			System.out.println("Division by zero error");
		}
		finally {
		      System.out.println("finally block will execute.");
		}
		System.out.println("Result = " + result);
		input.close();
	}
}