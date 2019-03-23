
public class Wrestler {

//Class Data Members --------------------------------------------------
	private School school;
	private String firstName;
	private String lastName;
	private String middleInitial;
	private String fullName;
	
	private int weightClass;
	
	private String record;
	private int wins;
	private int losses;
	private int previousSeasonRank;
	private double seedPoints;
	private int seedPosition;

	
	
// Class Constructors -------------------------------------------------

	public Wrestler(School school, String firstName, String lastName, String middleInitial, int weightClass, int wins, int losses) {
	
		this.school = school;
		fullName = lastName + ", " + firstName + " " + middleInitial +".";
		this.weightClass = weightClass;
		determineRecord(wins, losses);
	
	
	}
	
	public Wrestler (String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		getFullName(firstName, lastName);
	}



// Class Methods ------------------------------------------------------
	
	
	public String getFullName(String firstName, String lastName) {
		fullName = firstName + " " + lastName;
		return fullName;
	}
	
	
	public String toString() {
		return fullName;
		
	}
	

	

	public void determineRecord (int wins, int losses){

		record = wins + "-" + losses;
	}

	

	public void determineSeedPoints (int wins, int losses, int previousSeasonRank) {
		double result = 0;
		int totalMatches = wins + losses;
		
		if(totalMatches < 12) {
			result = wins / 12;
		}
		else {
			result = wins / losses;
		}
			
		
		
		
		switch (previousSeasonRank) {
		case 1:
			result += 100;
		case 2:
			result += 95;
		case 3: 
			result += 90;
		case 4:
			result += 85;
		case 5:
			result += 80;
		case 6:
			result += 75;
		case 7:            // this case is for any state placer
			result += 50;
		}
		
		seedPoints = result;
		
	}
	
	public void showSeedPoints() {
		System.out.println("Seed score = " + seedPoints);
	}
	
	
	
	public void showSeedPosition() {
		String suffix= "";
		
		if(seedPosition == 1) {
			suffix = "st";
		}
		else {
			if (seedPosition == 2) {
				suffix = "nd";
			}
			else {
				if (seedPosition == 3) {
					suffix = "rd";
				}
				else {
					suffix = "th";
				}
			}
		}
		
		System.out.println(seedPosition + suffix + " seed");
	}

}