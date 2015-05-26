import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class AdminResourcesButtons extends JPanel {
	public AdminResourcesButtons()
	{
	welcomeLabel = new JLabel("Administrator Resources");
	
	AdminResourcesButtonsListener ar = new AdminResourcesButtonsListener();
	
	dataButton = new JButton("Access/Change Data");
	dataButton.addActionListener(ar);
	
	add(dataButton);
	
	}
	
	
	private JLabel welcomeLabel;
	private JButton dataButton;
}
