/**
 * Student: Tobie Collins
 * Assignment: 1
 * Date: 2/8/21
 * Class: CMSC 203
 * 
 * This class is a diagnosis for possible Wifi issues 
 * 
 * 
 */


import java.util.Scanner;
public class WiFiDiagnosis {
	public static void main (String [] args)
	{
		// Prompt user with the first step of the diagnosis.
		
				System.out.println("If you have a problem with internet connectivity, "
						+ "this WiFi Diagnosis may work for you.");
				System.out.println("First Step: reboot your computer.");
				
				System.out.println("Are you able to connect to the internet? (yes or no)");
				
		// Create scanner object to take the user's input.
				
				Scanner input = new Scanner(System.in);
				String answer = input.nextLine();
				
		// Series of nested if else if statements to determine the root of the problem.
				
				if (answer.equals("yes"))
				{
					System.out.println("Rebooting your computer seemed to work.");
				}
		// This else if begins the algorithm of code and continues only if no keeps being entered.
				
				else if (answer.equals("no"))
				{
					System.out.println("Second Step: Reboot your router");
					System.out.println("Now are you able to connect to the internet? (yes or no)");
					
				// Prompt user again.
					
					answer = input.nextLine();
					if (answer.equals("yes"))
					{
						System.out.println("Rebooting your router seemed to work");
						
					}
					else if (answer.equals("no"))
					{
						System.out.println("Third Step: Make sure the cables to your router are"
								+ " plugged in firmly and your router is getting power");
						System.out.println("Now are you able to connect to the internet? (yes or no)");
						
				// Prompt user again.
						
						answer = input.nextLine();
						if (answer.equals("yes"))
						{
							System.out.println("Making sure your router was properly plugged"
									+ " in seemed to work");
					
						}
						else if (answer.equals("no"))
						{
							System.out.println("Fourth Step: Move your computer closer to your router");
							System.out.println("Now are you able to connect to the internet? (yes or no)");
							
				// Prompt user again.
							
							answer = input.nextLine();
							if (answer.equals("yes"))
							{
								System.out.println("Moving your computer closer seemed to work");
								
							}
							else if (answer.equals("no"))
							{
								System.out.println("Fifth Step: Contact your ISP");
								System.out.println("Make sure your ISP is hooked up to your router.");
								
							}
							
						}
						
						
					}
					
						
				}
				else
					System.out.println("Program exited");
				
	}
	
}
