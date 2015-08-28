/**
 * @author Neha
 * Class assignment
 */

// import scanner package as scanner class is used in the program
import java.util.Scanner;
public class MowingTime {

	/**
	 * @param args
	 * Program to calculate the mowing time if 1 sq. yardage is mowed in 2 minutes
	 */
	public static void main(String[] args) {
		// variables to calculate area
		double length,width,area;
		// variables for time taken to mow the yard
		double mowTime;
		// variables to separate the time in minutes and seconds
		int mowTimeMinutes, mowTimeSeconds;
		
		// initialization for all variables
		length = 0.0;
		width=0.0;
		area =0.0;
		mowTime = 0.0;
		mowTimeMinutes = 0;
		mowTimeSeconds= 0;
				
		// scanner instance to get the input from user
		Scanner keyboard = new Scanner(System.in);
		
		// prompt the user for the length of the yard
		System.out.println("Enter the length for the yard: ");
		// save the length of the yard in a variable
		length = keyboard.nextDouble();
		
		//prompt the user for the width of the yard
		System.out.println("Enter the width for the yard: ");
		//save the width of the yard in a variable
		width = keyboard.nextDouble();
		
		// Calculate the area and save it in a variable
		area = length * width;
		// Print out the area of the yard
		System.out.println ("The yard is: " + area + " sq.");
		
		// calculate the time to mow the yard
		mowTime = area * 2;
		// divide the mow time into minutes and seconds and save in respective variables
		mowTimeMinutes = (int)mowTime;
		mowTimeSeconds = (int)((mowTime - (int)mowTime)*60);
		
		// print out the mowing time for area calculated earlier
		System.out.println("The mowing time for " + area + " sq yadarge is " +
				mowTimeMinutes + " minutes " + mowTimeSeconds + " seconds");
		
		//close the scanner
		keyboard.close();
	}
}
