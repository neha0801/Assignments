/**
 * 
 */

/**
 * @author Neha
 *
 */
// import scanner package as scanner class is used in the program
import java.util.Scanner;
public class TaxOwed {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// variables to get the input
		int customerNumber;
		String customerName, taxCode;
		double salesAmount;
		double taxOwed;
		
		// create a instance of scanner class 
		Scanner keyboard = new Scanner(System.in);
		
		// ask the user to enter customer number
		System.out.print( "Customer Number? " );
		// save value entered by user in a variable
		customerNumber = keyboard.nextInt();

		// ask the user to enter customer name
		System.out.print( "Customer Name? " );
		customerName = keyboard.next();
		
		// ask the user to enter sales amount
		System.out.print( "Sales amount? " );
		salesAmount = keyboard.nextDouble();
		
		// ask the user to enter tax code
		System.out.print( "Tax code? " );
		taxCode = keyboard.next();

		// calculate the tax amount
		if (taxCode.equals("NRM")) 
		{
			taxOwed = salesAmount * 0.06;
		}else if (taxCode.equals("NPF")) 
		{
			taxOwed = 0.0* salesAmount;
		}else if (taxCode.equals("BIZ"))
		{
			taxOwed = salesAmount * 0.045;
		}else
		{
			System.out.println("Incorrect tax code");
			return;
		}
			
		//print out the customer details
		System.out.print( "Customer Details: ");
		System.out.print( "Customer Number: " + customerNumber  );
		System.out.print( "Customer Name: " + customerName  );
		System.out.print( "Tax Owed: " + taxOwed);
		
		keyboard.close();
		
	}

}
