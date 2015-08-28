/**
 * @author Neha
 * Class assignment
 *
 */
public class WhatIf {

	/**
	 * @param args
	 * Program to test If conditions
	 */
	public static void main(String[] args) {
		// declare  and Initialize all the variables
		int people = 20;
		// cats variable value is changed to 20 from 30 to complete part 3 of assignment 
		int cats = 20;	 
		int dogs = 15;
		
		// below are the conditions to compare the number of people to number of dogs and cat 
		
		if ( people < cats )
		{
			// when the number of people is less than the number of cats below message will be printed
			//for given values this message will be printed
			System.out.println( "Too many cats!  The world is doomed!" );
		}
		
		if ( people > cats )
		{
			// when the number of people is more than the number of cats below message will be printed
			//for given values this condition is not true. below message will not be printed
			System.out.println( "Not many cats!  The world is saved!" );
		}
		
		if ( people < dogs )
		{
			// when the number of people is less than the number of dogs below message will be printed
			//for given values this condition is not true. below message will not be printed
			System.out.println( "The world is drooled on!" );
		}
		
		if ( people > dogs )
		{
			// when the number of people is more than the number of dogs below message will be printed
			//for given values this message will be printed
			System.out.println( "The world is dry!" );
		}
		
		// increase the number of dogs by 5
		dogs += 5;

		// again compare the number of people to number of dogs
		if ( people >= dogs )
		{
			// when the number of people is more than or equal to the number of dogs below message will be printed
			// for given values this message will be printed
			System.out.println( "People are greater than or equal to dogs." );
		}

		if ( people <= dogs )
		{
			// when the number of people is less than or equal to the number of dogs below message will be printed
			//for given values this message will be printed
			System.out.println( "People are less than or equal to dogs." );
		}

		if ( people == dogs )
		{
			// when the number of people is equal to the number of dogs below message will be printed
			//for given values this message will be printed
			System.out.println( "People are dogs." );
		}
	}
}