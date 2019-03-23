
public class Seed {

	private int previousSeasonRank;
	private double seedPoints;
	private int seedPosition;
	private int wins;                  
	private int losses;
	
	
	public Seed (Wrestler name) {
		name.determineSeedPoints(wins, losses, previousSeasonRank);    // how do i determineSeed with just wrestler name.
		System.out.println(name + "'s seed points totals: " + seedPoints);
		
	}
}
