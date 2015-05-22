import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Buttons extends JPanel {
	
	public Buttons(){
		
		welcomeLabel = new JLabel("Welcome to AcrylicShadow by GOMARI");
		ButtonsListener registerListener = new ButtonsListener();
		
		registerButton = new JButton("Register");
		registerButton.addActionListener(registerListener);
		loginButton = new JButton("Login");	
		adminButton = new JButton("Admin Access");
		
		add(welcomeLabel);	
		add(registerButton);
		add(loginButton);
		add(adminButton);

	}

private JLabel welcomeLabel;
private JButton loginButton;
private JButton registerButton;
private JButton adminButton;
	
}
