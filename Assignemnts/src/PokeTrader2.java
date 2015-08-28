import java.util.Scanner;

public class PokeTrader2 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String[] pokeParty = { "PIKACHU", "CHARMELEON", "GEODUDE", "GYARADOS",
				"BUTTERFREE", "MANKEY" };

		int a;
		int b;
		String temp;

		do {
			System.out.println("EXCHANGE POKEMON\n");
			for (int i = 0; i < pokeParty.length; i++)
				System.out.println("    " + i + ". " + pokeParty[i]);

			System.out.print("\nChoose a Pokemon (or -1 to quit). => ");
			a = keyboard.nextInt();
			if (a > 5) {
				System.out.println("Invalid Option");
				continue;
			}

			if (a >= 0) {
				System.out.print("Choose a Pokemon to exchange with "
						+ pokeParty[a] + ". => ");
				b = keyboard.nextInt();
				if (b > 5) {
					System.out.println("Invalid Option");
					continue;
				}
				System.out.println("\nExchanging " + pokeParty[a] + " with "
						+ pokeParty[b] + ".\n");

				temp = pokeParty[a];
				pokeParty[a] = pokeParty[b];
				pokeParty[b] = temp;

				// add code here to swap the Pokemon in slot a with the Pokemon
				// in slot b
			}

		} while (a >= 0);
		keyboard.close();
		System.out.println("Good Bye!!");

	}

}