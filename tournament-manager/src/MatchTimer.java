
public class MatchTimer {
	static Thread thread = new Thread();
	
	int periodLength = 0;
	int periodCounter = 0;
	int totalPeriods;
	
	
	
	public MatchTimer(int matchSeconds, int totalPeriods){
		periodLength = matchSeconds;
		this.totalPeriods = totalPeriods;
		
	}
	
	
	public void runTimer() throws InterruptedException {
		
		
		for(int i = this.periodLength; i > 0 ; i--) {
			thread.sleep(1000);
			//System.out.println(i);
	}
		
	
	
	
	}
}
