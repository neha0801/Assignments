
/**
 * 
 */

/**
 * @author Neha
 *
 */
import java.util.Scanner;

public class InfinteLoop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String userInput = "";
		;
		while(true)
		{
			Scanner keyboard = new Scanner(System.in);
			System.out.print("Enter a string: ");
			userInput = keyboard.next();
			if (userInput.equals("6666")){
				break;
			}
		}
		System.out.print("Loop Terminated");

	}

}
