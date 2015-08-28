/**
 * @author Neha
 * Class assignment
 */
// imported to round double to two decimal places

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
//imported to use scanner class
import java.util.Scanner;

public class InvoiceApp {
	/**
	 * @param args
	 *            Program to print out invoice
	 */
	public static void main(String[] args) {
		// scanner instance is created
		Scanner keyboard = new Scanner(System.in);

		// Variables to save data
		double taxRate = 0.0;
		double tax, grandTotal;
		// array to save the prices. assuming no more than 100 prices are
		// entered
		// List<Double>[] price = new ArrayList[]<Double>;
		double[] price = new double[100];
		double subtotal = 0.0;
		int index = 0;

		// instance of DecimalFormat to round up double values to two decimal
		// places
		DecimalFormat df = new DecimalFormat("#.##");

		// ask user for tax rate
		System.out.print("Tax Rate? : ");
		taxRate = keyboard.nextDouble();

		// loop to get the value of various prices from user
		while (true) {
			System.out.print("Price # " + (index + 1) + " : ");
			price[index] = keyboard.nextDouble();
			// if user enters 0.0 then exit the loop
			if (price[index] == 0.0) {
				break;
			}
			// increment the array index
			index += 1;
		}

		// lines printed to show formated report
		System.out.println();
		System.out.println("-------------------------------------------------");
		System.out.println("Receipt");

		// print out the prices entered by the user
		for (int i = 0; i < index; i++) {
			System.out.println(price[i]);
			// calculate the subtotal by adding all the prices together
			subtotal += price[i];
		}

		// print the subtotal
		System.out.println(subtotal + " subtotal");

		// calculate the tax amount using tax rate
		tax = taxRate * subtotal;

		// print tax to two decimal places
		System.out.println(df.format(tax) + " tax");

		// compute the grand total
		grandTotal = subtotal + tax;
		// print out the grand total with two decimal places
		System.out.println(df.format(grandTotal) + " grand total");
		keyboard.close();
	}
}