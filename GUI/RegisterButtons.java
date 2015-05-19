import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RegisterButtons extends JPanel {
	
	public RegisterButtons(){
		
		welcomeLabel = new JLabel("Register");
		
		firstNameArea = new JTextField(12);
		lastNameArea = new JTextField(12);
		idArea = new JTextField(12);
		
		confirmButton = new JButton("Confirm Registration");	
		
		add(welcomeLabel);
		add(firstNameArea);
		add(lastNameArea);
		add(idArea);
		add(confirmButton);
		
	}

private JLabel welcomeLabel;
private JButton confirmButton;
private JTextField firstNameArea;
private JTextField lastNameArea;
private JTextField idArea;
	
}
