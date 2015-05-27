import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class RegisterButtons extends JPanel {
    
    public RegisterButtons(){
        
        welcomeLabel = new JLabel("Register");
        
        LoginListener l = new LoginListener();
        //RegisterPersonListener rp = new RegisterPersonListener();
        
        firstNameArea = new JTextField(12);
        lastNameArea = new JTextField(12);
        idArea = new JTextField(12);
        
        firstNameLabel = new JLabel("First Name:");
        lastNameLabel = new JLabel("Last Name: ");
        idLabel = new JLabel("ID: ");
        
        confirmButton = new JButton("Confirm Registration");    
        firstName = firstNameLabel.getText().toString();
        lastName = lastNameLabel.getText().toString();
        idNum = Integer.parseInt(firstNameLabel.getText().toString());  
        //confirmButton.addActionListener(rp);
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
private JLabel welcomeLabel;
private JLabel firstNameLabel;
private JLabel lastNameLabel;
private JLabel idLabel;
private JButton confirmButton;
private JTextField firstNameArea;
private JTextField lastNameArea;
private JTextField idArea;
protected String firstName;
protected String lastName;
protected int idNum;
}
