import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RegisterButtons extends JPanel {
	
	public RegisterButtons(){
		
		welcomeLabel = new JLabel("Register Buttons");
		
		confirmButton = new JButton("Confirm Registration");	
		
		add(welcomeLabel);
		add(confirmButton);
		
	}

private JLabel welcomeLabel;
private JButton confirmButton;

	
}
