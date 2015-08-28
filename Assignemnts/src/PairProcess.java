/**
 * @author Neha
 *
 */
import java.util.Scanner;
public class PairProcess {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int num1, num2;
		int sum , product, average;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print( "First Number? :" );
		num1 = keyboard.nextInt();
		
		System.out.print( "Last Number?  :" );
		num2 = keyboard.nextInt();
		
		sum = num1+num2;
		product= num1*num2;
		average = sum/2;
		// condition to check sum over 200
		if ( sum > 200)
		{
			System.out.println(" Sum of num1 and num2 is: " + sum + "*");
		} else
		{
			System.out.println(" Sum of num1 and num2 is: " + sum);
		}
		System.out.println(" Product of num1 and num2 is: " + product);
		System.out.println(" Average of num1 and num2 is: " + average);
		keyboard.close();
	}
}