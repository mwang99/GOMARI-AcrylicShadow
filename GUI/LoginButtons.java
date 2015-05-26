import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginButtons extends JPanel {
	
	public LoginButtons(){
		
		welcomeLabel = new JLabel("Login");
		
		ClockListener c = new ClockListener();
			
		idArea = new JTextField(12);
		
		confirmButton = new JButton("Login");	
		confirmButton.addActionListener(c);
		
		add(welcomeLabel);
		add(idArea);
		add(confirmButton);
		
	}

private JLabel welcomeLabel;
private JButton confirmButton;
private JTextField idArea;
	
}
