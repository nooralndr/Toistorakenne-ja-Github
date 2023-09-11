
import java.util.Scanner;

public class arvauspeli {

	public static void main(String[] args) {
	
		Scanner in = new Scanner(System.in);
		
		String answer1;

		
		System.out.println("What is my name?");
		answer1 = in.nextLine();

		if (answer1.equals("Noora"))
		{
			System.out.println("Congratulations! You guessed right.");
		}
		
		else 
		{
			System.out.println("Wrong! Guess again.");
		}
		
	}

}
