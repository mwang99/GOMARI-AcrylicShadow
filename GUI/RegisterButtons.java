import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RegisterButtons extends JPanel {
	
	public RegisterButtons(){
		
		welcomeLabel = new JLabel("Register Buttons");
		
		firstNameArea = new JTextArea("");
		lastNameArea = new JTextArea("");
		idArea = new JTextArea("");
		
		confirmButton = new JButton("Confirm Registration");	
		
		add(welcomeLabel);
		add(firstNameArea);
		add(lastNameArea);
		add(idArea);
		add(confirmButton);
		
	}

private JLabel welcomeLabel;
private JButton confirmButton;
private JTextArea firstNameArea;
private JTextArea lastNameArea;
private JTextArea idArea;
	
}
