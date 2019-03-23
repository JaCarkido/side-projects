import java.util.Scanner;

public class BoutSheet{
	
	public static void main (String[] args) {



//Data Members ---------------------------------------------------------------------------------------------------------------------------
	String response = "";
	boolean endLoop = false;
	String firstName = "";
	String lastName = "";
	Scanner keyboard = new Scanner(System.in);
	
	int wins = 0;
	int losses = 0;
	int answer = 0;
		
//CTOR ----------------------------------------------------------------------------------------------------------------------------------		
			
	// Providing Green Wrestler with a name--------------------------------------------------------------------------------------------------
	
	
			while(!endLoop) {
				System.out.println("Please enter the first name of the Green Athlete: ");
				response = keyboard.nextLine();		
				firstName = response;
				System.out.println("Please enter the last name of the Green Athlete: ");
				response = keyboard.nextLine();
				lastName = response;
			
			
				System.out.println("The Green Contestant is: " + firstName + " " + lastName + "\nIs this Correct:   [Y]es / [N]o ");
				response = keyboard.nextLine();
					if(response.equalsIgnoreCase("n")) {
						endLoop = false;
				}
					else {
						endLoop = true;
				}
			}
			Wrestler greenWrestler = new Wrestler(firstName, lastName);
			String greenName = (firstName + " " + lastName);
			
			endLoop = false;
			
	// Green Record
			while(!endLoop) {
				System.out.println("Please enter number of wins for: " +greenName);
				response = keyboard.nextLine();	
				answer = Integer.parseInt(response);
				wins = answer;
				System.out.println("Please enter number of losses for: " +greenName);
				response = keyboard.nextLine();
				answer = Integer.parseInt(response);
				losses = answer;
			
			
				System.out.println(greenName + "\'s record is: " + wins + "-" + losses + "\nIs this Correct:   [Y]es / [N]o ");
				response = keyboard.nextLine();
					if(response.equalsIgnoreCase("n")) {
						endLoop = false;
				}
					else {
						endLoop = true;
				}
			}
			
			String recordGreen = wins + "-" + losses;
			endLoop = false;
			
	// Providing Red Wrestler with a name-----------------------------------------------------------------------------------------------------
			while(!endLoop) {
				System.out.println("Please enter the first name of the  Red Athlete: ");
				response = keyboard.nextLine();
				firstName = response;
				System.out.println("Please enter the last name of the  Red Athlete: ");
				response = keyboard.nextLine();
				lastName = response;
			
				System.out.println("The Red Contestant is: " + firstName + " " + lastName + "\nIs this Correct:   [Y]es / [N]o ");
				response = keyboard.nextLine();
					if(response.equalsIgnoreCase("n")) {
						endLoop = false;
					}
					else {
						endLoop = true;
					}
				}
			Wrestler redWrestler = new Wrestler(firstName, lastName);
			String redName = (firstName + " " + lastName);
			endLoop = false;
	// Red Record
				while(!endLoop) {
					System.out.println("Please enter number of wins for: " +redName);
					response = keyboard.nextLine();	
					answer = Integer.parseInt(response);
					wins = answer;
					System.out.println("Please enter number of losses for: " +redName);
					response = keyboard.nextLine();
					answer = Integer.parseInt(response);
					losses = answer;
						
						
					System.out.println(redName + "\'s record is: " + wins + "-" + losses + "\nIs this Correct:   [Y]es / [N]o ");
					response = keyboard.nextLine();
						if(response.equalsIgnoreCase("n")) {
							endLoop = false;
						}
						else {
							endLoop = true;
						}
				}
						
						String recordRed = wins + "-" + losses;
						endLoop = false;			
			
			
			System.out.println("The green contestant is: " + greenWrestler +" " +recordGreen);
			System.out.println("The red contestant is: " + redWrestler + " " +recordRed);
}
}
