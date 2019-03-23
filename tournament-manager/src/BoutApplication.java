import java.awt.*;

import javax.swing.*;

public class BoutApplication extends JFrame {

	//CTOR
	
	public BoutApplication() {
		createView();
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 400)
;		setLocationRelativeTo(null);
		setResizable(true);
		
	}

	private void createView() {
		
		JPanel panelMain = new JPanel();
		getContentPane().add(panelMain);
		
		JPanel panelBout = new JPanel(new GridBagLayout());
		panelMain.add(panelBout);
		
		JPanel panelGreenScore = new JPanel ();
		panelGreenScore.setBackground(Color.GREEN);
		panelGreenScore.setSize(20, 20);
		JPanel panelRedScore = new JPanel();
		panelRedScore.setBackground(Color.RED);
		panelRedScore.setSize(30, 30);
		
		GridBagConstraints c = new GridBagConstraints();
		c.gridy = 0;
		c.gridx = 0;
		
		//column [0]
		panelBout.add(new JLabel ("Green: "), c);
		c.gridy = 3;
		panelBout.add(new JLabel ("Red: "), c);
		
		//column [1]
		c.gridy = 0;
		c.gridx = 1;
		panelBout.add(new JLabel ("name goes here"), c);
		c.gridy += 3;
		panelBout.add(new JLabel("name goes here"), c);
		
		//column [2]
		c.gridy = 0;
		c.gridx += 2;
		panelBout.add(panelGreenScore, c);
		panelGreenScore.add(new JLabel("Green Score"));
		c.gridy =3;
		panelBout.add(panelRedScore, c);
		panelRedScore.add(new JLabel("Red Score"));
		
		// column [3]
		c.gridy = 0;
		c.gridx += 2;
		panelBout.add(new JButton("Takedown"), c);
		c.gridy += 3;
		panelBout.add(new JButton("Takedown"), c);
		
		// column [4]
		c.gridy = 0;
		c.gridx += 2;
		panelBout.add(new JButton("Reversal"), c);
		c.gridy += 3;
		panelBout.add(new JButton("Reversal"), c);
		
		// column [5]
		c.gridy = 0;
		c.gridx += 2;
		panelBout.add(new JButton("Near Fall 2"), c);
		c.gridy += 3;
		panelBout.add(new JButton("Near Fall 2"), c);
		
		// column [6]
		c.gridy = 0;
		c.gridx += 2;
		panelBout.add(new JButton("Near Fall 3"), c);
		c.gridy += 3;
		panelBout.add(new JButton("Near Fall 3"), c);


		// column [7]
		c.gridy = 0;
		c.gridx += 2;
		panelBout.add(new JButton("Escape"), c);
		c.gridy += 3;
		panelBout.add(new JButton("Escape"), c);		
		
		
		
	}
	
	public static void main (String[] args) {
		SwingUtilities.invokeLater(() -> { new BoutApplication().setVisible(true);});
		
		
	}
	
	
	
}
