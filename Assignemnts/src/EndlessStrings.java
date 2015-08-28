import java.util.Scanner;

public class EndlessStrings {
    public static void main (String[] args)
    {
    	String userInput = "";
    	Scanner keyboard = new Scanner(System.in);        
        while ( userInput != " " )
        {
        	userInput = keyboard.next();
        	System.out.println(userInput);
            
        }
    }
}