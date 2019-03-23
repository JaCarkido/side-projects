import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TryClickMe extends JFrame {

	private JButton buttonCounter, buttonReset;	
	private JLabel labelCount;
	private int clicks = 0;

	
	public TryClickMe() {
			createView();
			
			setTitle("click me");
			setDefaultCloseOperation(EXIT_ON_CLOSE);
			pack(); //automatically pack everything tightly
			setLocationRelativeTo(null);
			setResizable(false);
			
			
		}
	
		private void createView() {
			JPanel panel = new JPanel();
			getContentPane().add(panel);
			
			labelCount = new JLabel();
			labelCount.setPreferredSize(new Dimension(200, 30));
			panel.add(labelCount);
			
			updateCounter();
			
			buttonCounter = new JButton ("click me");
			panel.add(buttonCounter);
			buttonCounter.addActionListener(new ButtonCounterActionListener()); //we are adding a listener to button counter 
																				//and making a new class of listener
			buttonReset = new JButton ("reset");
			buttonReset.addActionListener(
					new ActionListener() { // here we will just create a new action listener and add a single unimplemented method for the code
											// within the line. could have done this with the button counter action listener.
						@Override
						public void actionPerformed(ActionEvent e) {
							clicks = 0;
							updateCounter();
							
						}
						
					}		
			);
			
			panel.add(buttonReset);
			
		}

		private void updateCounter() {
			labelCount.setText("clicked " + clicks + " times");
			
		}

		public static void main (String[] args) {
			SwingUtilities.invokeLater(new Runnable() {
					
					@Override
					public void run() {
						new TryClickMe().setVisible(true);
					}
			});
		}
		
		//we create a special instance of a class that is only used within our class
		
		public class ButtonCounterActionListener implements ActionListener{   // creating an inner class

			@Override
			public void actionPerformed(ActionEvent e) { //every time the listener detects a click it will execute the below code
				clicks++;
				updateCounter();  //we made a counter method to count update our gui counter label
				
			}
			
			
		}
	
}
