/**
 * 
 */

/**
 * @author Neha
 *
 */
// import scanner package as scanner class is used in the program
import java.util.Scanner;

public class StudentRecordReader {

	/**
	 * @param args
	 * Program to calculate student record
	 */
	public static void main(String[] args) {
		// variables for saving name
		String fname, lname;
		// declare variable to save gpa as int
		int gpa;
		
		// create a instance of scanner class 
		Scanner keyboard = new Scanner(System.in);
		
		// ask the user to enter Student first name
		System.out.print( "Student's First Name? " );
		// save value entered by user in a variable
		fname = keyboard.next();
		
		//ask the user to enter Student second name
		System.out.print( "Student's Last Name? " );
		//save value entered by user in a variable
		lname = keyboard.next();

		//ask the user to enter Student gpa
		System.out.print( "Student's GPA? " );
		//save value entered by user in a variable
		// one error is corrected here. nextDouble changed to nectIntn as gpa variable is of int data type
		gpa = keyboard.nextInt();
		
		// enter a new line
		System.out.println();
		// print student's name
		System.out.println("Student Name :" + fname + " " + lname);
		// print students's GPA
		System.out.println("Student GPA :" + gpa);
		
		// condition to find the student status according the GPA
		if (gpa >= 3)
		{
			// when students GPA is less than or equal to 3. print below message
			System.out.println("This student is in good standing.");
		} else if (gpa >= 1 || gpa <3) 	// one error is corrected here. added a new condition please clarify the condition required
		{
			//when students GPA is equal to 1. print below message
			System.out.println("This student is on academic probation.");
		} else
		{
			// when student GPA is less than 1. Print message below 
			System.out.println("This student has been expelled.");
		}
		keyboard.close();
	}
	
}

