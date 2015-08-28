/**
 * @author neha
 *
 */
import java.util.*;

public class MaxValueArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> integerArray = new ArrayList<Integer>();
		
		Random r = new Random();
		int x = 0;
		for (int i = 1; i <= 10; i++) {
			x = 1 + r.nextInt(100);
			integerArray.add(x);
		}
		
		System.out.println(integerArray);
		System.out.println("The largest value is: " + Collections.max(integerArray));
		System.out.println("Slot of largest number is "
		                     + integerArray.indexOf(Collections.max(integerArray)));
	}

}
