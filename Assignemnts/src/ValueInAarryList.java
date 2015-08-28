/**
 * @author neha
 *
 */
import java.util.*;

public class ValueInAarryList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> integerArray = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		String choice = "y";
		boolean present = false;

		int x = 0;
		for (int i = 1; i <= 10; i++) {
			x = 1 + r.nextInt(50);
			integerArray.add(x);
		}

		while (choice.equalsIgnoreCase("y")) {
			System.out.println(integerArray);
			System.out.print("Value to find: ");
			int value = sc.nextInt();
			sc.nextLine();
			int slot = 0;
			for (Integer i : integerArray) {
				if (i == value) {
					System.out.println(value + " is in slot " + slot);
					present = true;
				}
				slot++;
			}
			if (!present)
				System.out.println(value + " was not found");

			System.out.println("Do you want to continue:(y/n) ");
			choice = sc.next();
			sc.nextLine();

		}
		sc.close();
	}

}
