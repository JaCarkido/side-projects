
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import javax.swing.*;

//import TryClickMe.ButtonCounterActionListener;

public class BoutApp2 extends JFrame implements ActionListener {

	private int scoreGreen;
	private int scoreRed;
	JLabel labelScoreGreen = new JLabel(String.valueOf(scoreGreen));
	JLabel labelScoreRed = new JLabel(String.valueOf(scoreRed));
	
	String greenName = "";
	String redName = "";
	
	private long count;
	private SimpleDateFormat df;
	//CTOR
	
	public BoutApp2() {
		createView();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400)
;		setLocationRelativeTo(null);
		setResizable(true);
		
	}

	private void createView() {
		
		
		//timer stuff ??
		MatchTimer timer = new MatchTimer(120, 3);
		
		
	//buttons
		
		
		JButton periodChangeButton = new JButton ("Period Change");
		//periodChangeButton.addActionListener(new PeriodChangeButtonActionListener());
		
		JButton periodResetButton = new JButton ("Period Reset");
		//periodResetButton.addActionListener(new PeriodResetButtonActionListener());
		
		//Green Buttons
		JButton resetGreenScoreButton = new JButton ("Reset Green");
		//resetGreenScoreButton.addActionListener(new ResetScoreButtonActionListener());

		JButton takedownGreenButton = new JButton ("Takedown");
		takedownGreenButton.addActionListener(new GreenScoringActionListener());
		
		JButton reversalGreenButton = new JButton ("Reversal");
		JButton nearFall2GreenButton = new JButton ("NearFall2");
		JButton nearFall3GreenButton = new JButton ("NearFall3");
		JButton escapeGreenButton = new JButton ("Escape");
		
		//Red Buttons
		JButton resetRedScoreButton = new JButton ("Reset Red");
		JButton takedownRedButton = new JButton ("Takedown");
		JButton reversalRedButton = new JButton ("Reversal");
		JButton nearFall2RedButton = new JButton ("NearFall2");
		JButton nearFall3RedButton = new JButton ("NearFall3");
		JButton escapeRedButton = new JButton ("Escape");		
		
		
		
		
		//JLabel placeholders
		JLabel timerPlacehold = new JLabel("It's The Final Countdown: " + timer);
		timerPlacehold.setHorizontalAlignment(JLabel.CENTER);
		JLabel boutNumPlacehold = new JLabel("Bout #69");
		boutNumPlacehold.setHorizontalAlignment(JLabel.CENTER);
		
		
		JLabel labelGreenName = new JLabel(greenName);
		labelGreenName.setForeground(Color.green);
		labelGreenName.setHorizontalAlignment(JLabel.CENTER);
		JLabel labelRedName = new JLabel(redName);
		labelRedName.setForeground(Color.red);
		labelRedName.setHorizontalAlignment(JLabel.CENTER);
				
		
		
		
//base panel setup
		JPanel panelMain = new JPanel(new BorderLayout());
		getContentPane().add(panelMain);
		
		JPanel panelBout = new JPanel(new BorderLayout());
		panelMain.add(panelBout);
		
		JPanel panelGreenScore = new JPanel ();
		panelGreenScore.setBackground(Color.GREEN);
		panelGreenScore.setSize(20, 20);
		JPanel panelRedScore = new JPanel();
		panelRedScore.setBackground(Color.RED);
		panelRedScore.setSize(30, 30);
		
		
		//West Panel 
			JPanel panelWest = new JPanel(new GridBagLayout());
			panelMain.add(panelWest, BorderLayout.WEST);
		
//panels are labled in comments 1 is at the top 6 is at the bottom	
			
		//New Center
			JPanel panelCenter = new JPanel(new BorderLayout());
			panelMain.add(panelCenter, BorderLayout.CENTER);
		
			//Center North
			JPanel panelCenterNorth = new JPanel(new BorderLayout());            	//--------------------------------- 2
			panelCenter.add(panelCenterNorth, BorderLayout.NORTH);
			panelCenterNorth.add(labelGreenName);					//=======Green name
				//Center North North
				JPanel panelCenterNorthNorth = new JPanel();                     	//--------------------------------- 1
				panelCenterNorth.add(panelCenterNorthNorth, BorderLayout.NORTH);
				panelCenterNorthNorth.add(boutNumPlacehold);				//========bout #
				//Center North South
				JPanel panelCenterNorthSouth = new JPanel();
				panelCenterNorth.add(panelCenterNorthSouth, BorderLayout.SOUTH);	 //--------------------------------- 3 
				panelCenterNorthSouth.add(takedownGreenButton);		
				panelCenterNorthSouth.add(reversalGreenButton);							//Green's Buttons
				panelCenterNorthSouth.add(nearFall2GreenButton);
				panelCenterNorthSouth.add(nearFall3GreenButton);
				panelCenterNorthSouth.add(escapeGreenButton);
		
			//Center South
			JPanel panelCenterSouth = new JPanel(new BorderLayout());				// -------------------------------- 8
			panelCenter.add(panelCenterSouth, BorderLayout.SOUTH);
			panelCenterSouth.add(labelRedName); 					//========redName
				//Center South North
				JPanel panelCenterSouthNorth = new JPanel();						// -------------------------------- 7
				panelCenterSouth.add(panelCenterSouthNorth, BorderLayout.NORTH);
				panelCenterSouthNorth.add(takedownRedButton);								//Red's Buttons
				panelCenterSouthNorth.add(reversalRedButton);
				panelCenterSouthNorth.add(nearFall2RedButton);
				panelCenterSouthNorth.add(nearFall3RedButton);
				panelCenterSouthNorth.add(escapeRedButton);
				//Center North South
				JPanel panelCenterSouthSouth = new JPanel();
				panelCenterSouth.add(panelCenterSouthSouth, BorderLayout.SOUTH);
		
					//New Center 2
					JPanel panelCenterCenter = new JPanel(new BorderLayout());		// -------------------------------- 5
					panelCenter.add(panelCenterCenter, BorderLayout.CENTER);
					panelCenterCenter.add(timerPlacehold);					//=========timer
			
					//Center Center North
					JPanel panelCenterCenterNorth = new JPanel ();					// -------------------------------- 4
					panelCenterCenter.add(panelCenterCenterNorth, BorderLayout.NORTH);
					panelCenterCenterNorth.setBackground(Color.green);
					
					
					panelCenterCenterNorth.add(labelScoreGreen);           //=====green score   
					//updateScoreGreen();
					
					//Center Center South
					JPanel panelCenterCenterSouth = new JPanel();					// -------------------------------- 6
					panelCenterCenter.add(panelCenterCenterSouth, BorderLayout.SOUTH);
					panelCenterCenterSouth.setBackground(Color.red);                			
					
					panelCenterCenterSouth.add(labelScoreRed);				//====== Red's Score
					//updateScoreRed();
				
		/*
		GridBagConstraints c = new GridBagConstraints();
		c.gridy = 0;
		c.gridx = 0;
		*/
	
		
	}
	
	
	

//	private void updateScoreRed() {
//		labelScoreRed.setText(scoreRedString);
//		
//	}

		

	
	
	public void updateGreenScoreTwo(int scoreGreen) {
		scoreGreen += 2;
		labelScoreGreen.setText(String.valueOf(scoreGreen));
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
	

	public static void main (String[] args) {
		SwingUtilities.invokeLater(() -> { new BoutApp2().setVisible(true);});
		

	}
	
	
	public class GreenScoringActionListener implements ActionListener{   // creating an inner class

		@Override
		public void actionPerformed(ActionEvent e) { //every time the listener detects a click it will execute the below code
			
			updateGreenScoreTwo(scoreGreen);  //adds 2 to the score
			
		}

		
		
	}

	
	
}

