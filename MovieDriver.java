/**
 * Tobie Collins
 * 2/14/21
 * Lab 1 - Movie
 * 
 */


import java.util.Scanner;
public class MovieDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner input;
		input = new Scanner(System.in);
		Movie movie1 = new Movie(); // Create Movie object
		
		
		char yesNoInput;  // Variable for continuing the loop
		
		do
		{
			// Prompt user and set their values through the movie object
			
			System.out.println("Enter the name of a movie. ");
			String title = input.nextLine();
			
			movie1.setTitle(title);
			
			System.out.println("Enter the rating of the movie. ");
			String rating = input.nextLine();
			
			movie1.setRating(rating);
			
			System.out.println("Enter the number of tickets sold for this movie. ");
			int soldTickets = input.nextInt();
			
			movie1.setSoldTickets(soldTickets);
			
			System.out.println(movie1.toString());
			
			System.out.println("Do you want to continue? (y or n)");
			
			// Second nextLine() statement is to consume the \n.
			
			//yesNoInput = input.nextLine();
			//yesNoInput = input.nextLine();
			yesNoInput = input.next().charAt(0);
			input.nextLine();
		
		}
		while (yesNoInput == 'y');
			
		System.out.println("Goodbye. ");
	}	

}
