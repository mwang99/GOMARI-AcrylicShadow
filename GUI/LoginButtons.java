import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class LoginButtons extends JPanel {
	
	public LoginButtons(){
		
		welcomeLabel = new JLabel("Login");
		
		idArea = new JTextField(12);
		
		confirmButton = new JButton("Login");	
		
		add(welcomeLabel);
		add(idArea);
		add(confirmButton);
		
	}

private JLabel welcomeLabel;
private JButton confirmButton;
private JTextField idArea;
	
}
