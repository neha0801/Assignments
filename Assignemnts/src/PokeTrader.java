import java.util.Scanner;

public class PokeTrader
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS", "BUTTERFREE", "MANKEY" };

		int x;
		String temp;

		do
		{
			System.out.println("EXCHANGE POKEMON\n");
			System.out.println("\t0. " + pokeParty[0]);
			for ( int i=1; i<pokeParty.length; i++ )
				System.out.println("\t" + i + ". " + pokeParty[i]);

			System.out.println("\nChoose a Pokemon to exchange with " + pokeParty[0] + ". (Or enter 0 to quit.)");
			System.out.print("> ");
			x = keyboard.nextInt();
			
			// validation: if user enters anything more than 
			if (x>5){
				System.out.println("Invalid Option");
				continue ;
			}
			if (x>0){
				// code added here to swap depending on the user choice
				temp = pokeParty[0];
				pokeParty[0] = pokeParty[x];
				pokeParty[x] = temp;
				
				System.out.println(pokeParty[x] + " is exchanged with " + pokeParty[0] + "\n");
			}
			
		} while ( x > 0 );
		keyboard.close();
		System.out.println("Good Bye!!");
	}
}