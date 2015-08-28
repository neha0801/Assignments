/**
 * @author neha
 *
 */
import java.util.*;
public class CopyArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		List<Integer> integerArray1 = new ArrayList<Integer>();
		List<Integer> integerArray2 = new ArrayList<Integer>();
		Random r = new Random();
		
		int x = 0;
		for(int i =1; i<=10; i++){
			x = 1 + r.nextInt(100);
			integerArray1.add(x);
		}
		integerArray2.addAll(integerArray1);
		integerArray1.set(9, -7);
		System.out.println("Array List 1: " + integerArray1);
		System.out.println("Array List 2: " + integerArray2);		
	}

}
