import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ClockButtons extends JPanel {
	
	public ClockButtons(){
		
		welcomeLabel = new JLabel("Clock In/Out");

		ClockInListener() ci = new ClockInListener();
		ClockOutListener() co = new ClockOutListener();

		inButton = new JButton("Clock In");
		inButton.addActionListener(ci);
		outButton = new JButton("Clock Out");	
		outButton.addActionListener(co);
		
		add(welcomeLabel);
		add(inButton);
		add(outButton);
		
	}

private JLabel welcomeLabel;
private JButton inButton;
private JButton outButton;
	
}
