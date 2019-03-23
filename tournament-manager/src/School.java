import java.util.ArrayList;
import java.util.List;

public class School {

	//use array list to create a line up with weight class / wrestler name
	
	private String schoolName;
	private int schoolPoints;
	private List<String> wrestlers = new ArrayList<String>();
	
	
	public School (String schoolName, String[] wrestlers) {
		this.schoolName = schoolName;
		schoolPoints = 0;
	}
	
	
	
	//getters and setters
	
	
	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}



	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}



	/**
	 * @return the schoolPoints
	 */
	public int getSchoolPoints() {
		return schoolPoints;
	}



	/**
	 * @param schoolPoints the schoolPoints to set
	 */
	public void setSchoolPoints(int schoolPoints) {
		this.schoolPoints = schoolPoints;
	}



	/**
	 * @return the wrestlers
	 */
	public List<String> getWrestlers() {
		return wrestlers;
	}



	/**
	 * @param wrestlers the wrestlers to set
	 */
	public void setWrestlers(List<String> wrestlers) {
		this.wrestlers = wrestlers;
	}


//methods
	
	public void addToSchoolPoints() {
		
	}
	
	
	public void calculateSchoolPoints() {
		int minor = 3;
		int major = 4;
		int techFall = 5;
		int pin = 6;
		int forfeit = 6;
		
		//schoolPoints += result  ---- will probably just use conditionals for team points rather than variables?    
	    // if( wins){
		
		
	}
}
