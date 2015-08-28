/**
 * @author Neha
 *
 */
// import scanner package as scanner class is used in the program
import java.util.Scanner;

public class StudentRecordReader1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// string variable to save the name
		String fname, lname, status;
		// variables to save gpa and credit hours
		double gpa;
		int hours;
		
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
		//save value entered by user in a double variable
		gpa = keyboard.nextDouble();

		//ask the user to enter Student credit hours
		System.out.print( "Student's Current Course Load? " );
		//save value entered by user in a int variable
		hours = keyboard.nextInt();

		// enter a new line
		System.out.println();
		// print student's name
		System.out.println("Student Name :" + fname + " " + lname);
		// print the student status
		
		// check if the student is enrolled as full time or part time. If the student is part-time then GPA details cannot be shown
		if (hours >= 12)
		{
			status = "Full Time";
			System.out.println("Student is enrolled as " +status);
			// print students's GPA
			System.out.println("Student GPA :" + gpa);
			
			// check the student status based on their GPA
			if (gpa >= 3)
			{
				// when student's GPA is more than or equal to 3 then student is in good standing
				System.out.println("This student is in good standing.");
			} else if (gpa >= 2)
			{
				//when student's GPA is more than or equal to 2 then student need to study more
				System.out.println("This student needs to study more.");
			} else if (gpa >= 1)
			{
				//when student's GPA is more than or equal to 1 then student is on academic probation
				System.out.println("This student is on academic probation.");
			} else
			{
				//when student's GPA is less than to 1 then student has been expelled
				System.out.println("This student has been expelled.");
			}
		}else
		{
			// when the student has less than 12 credit hours print below message
			status = "Part Time";
			System.out.println("Credentials are hidden as the student is enrolled as: " + status);
		}
		keyboard.close();
	}

}
