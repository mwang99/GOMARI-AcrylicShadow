import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RegisterButtons extends JPanel implements ActionListener{
	
	public RegisterButtons(){
		
		welcomeLabel = new JLabel("Register");
		
		LoginListener l = new LoginListener();
		
		firstNameArea = new JTextField(12);
		lastNameArea = new JTextField(12);
		idArea = new JTextField(12);
		
		firstNameLabel = new JLabel("First Name:");
		lastNameLabel = new JLabel("Last Name: ");
		idLabel = new JLabel("ID: ");
		
		confirmButton = new JButton("Confirm Registration");	
		String firstName = firstNameLabel.getText().toString();
		String lastName = lastNameLabel.getText().toString();
		int idNum = Integer.parseInt(firstNameLabel.getText().toString());
		//confirmButton.addActionListener();
		confirmButton.addActionListener(l);
		
		add(welcomeLabel);
		add(firstNameLabel);
		add(firstNameArea);
		add(lastNameLabel);
		add(lastNameArea);
		add(idLabel);
		add(idArea);
		add(confirmButton);
		
	}

	public void actionPerformed(ActionEvent e) { 
       System.out.println("Cat");
    }
private JLabel welcomeLabel;
private JLabel firstNameLabel;
private JLabel lastNameLabel;
private JLabel idLabel;
private JButton confirmButton;
private JTextField firstNameArea;
private JTextField lastNameArea;
private JTextField idArea;
	
}
