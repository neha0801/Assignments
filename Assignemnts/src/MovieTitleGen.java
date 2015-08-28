import java.net.URL;
import java.util.Scanner;

public class MovieTitleGen
{
	public static void main(String[] args) throws Exception
	{

		String[] adjectives = arrayFromUrl("https://cs.leanderisd.org/txt/adjectives.txt");
		String[] nouns      = arrayFromUrl("https://cs.leanderisd.org/txt/nouns.txt");

		System.out.println("Myxyllplyk's Random Movie Title Generator\n");

		System.out.print("Choosing randomly from " + adjectives.length + " adjectives ");
		System.out.println("and " + nouns.length + " nouns (" + (adjectives.length*nouns.length) + " combinations).");

		// added code to get the random adjectives and noun for the movie name
		int adji = 0 + (int)(Math.random()* adjectives.length    ); // adjective
		int ni = 0 + (int)(Math.random()* nouns.length    ); // noun
		String adjective = adjectives[adji];
		String noun = nouns[ni];

		// output is formatted to capitalize first letter of all the words
		System.out.println( "Your movie title is: " + 
				Character.toUpperCase(adjective.charAt(0)) + adjective.substring(1) 
				+ " " + Character.toUpperCase(noun.charAt(0)) + noun.substring(1) );
	}

	/**
	*	@param url - the URL to read words from
	*	@return An array of words, initialized from the given URL
	*/	
	public static String[] arrayFromUrl( String url ) throws Exception
	{
		Scanner fin = new Scanner((new URL(url)).openStream());
		int count = fin.nextInt();

		String[] words = new String[count];

		for ( int i=0; i<words.length; i++ )
		{
			words[i] = fin.next();
		}
		fin.close();

		return words;
	}

}