import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ClockButtons extends JPanel {
	
	public ClockButtons(){
		
		welcomeLabel = new JLabel("Clock In/Out");

		inButton = new JButton("Clock In");
		outButton = new JButton("Clock Out");	
		
		add(welcomeLabel);
		add(inButton);
		add(outButton);
		
	}

private JLabel welcomeLabel;
private JButton inButton;
private JButton outButton;
	
}
