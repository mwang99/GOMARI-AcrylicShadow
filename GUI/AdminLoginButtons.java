import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AdminLoginButtons extends JPanel {
	
	public AdminLoginButtons(){
		
		adminMenu = new JMenuBar("Administrator Menu");
		adminMenu.add("File");
		
		welcomeLabel = new JLabel("Administrative Login");
		
		idArea = new JTextField(12);
		
		confirmButton = new JButton("Login");	
		
		add(adminMenu);
		add(welcomeLabel);
		add(idArea);
		add(confirmButton);
		
	}

private JLabel welcomeLabel;
private JButton confirmButton;
private JTextField idArea;
private JMenuBar adminMenu;
}
