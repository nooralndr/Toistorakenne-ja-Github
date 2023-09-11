
import java.util.Scanner;

public class arvauspeli {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		String answer1;
		int guesses = 0;
		
		do
		{
		System.out.println("What is my name?");
		answer1 = in.nextLine();

		if (answer1.equals("Noora"))
		{
			System.out.println("Congratulations! You guessed right.");
			guesses = guesses + 1;
			break;
		}
		
		else if (answer1.equals("end"))
		{
			System.out.println("Thank you for playing.");
			guesses = guesses + 1;
			break;
		}
		
		else
		{
			System.out.println("Wrong! Guess again.");
			guesses = guesses + 1;
		}
		}
		while (true);
		{
			System.out.println("You guessed " + guesses + " times");
		}
		
	}

}
