import javax.swing.*;
public class AdminResources extends JFrame {
	public AdminResources()
	{
		JFrame frame = new JFrame("Administrator Resources");
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.getContentPane().add(new AdminResourcesButtons());
		frame.setSize(400,200);	
		frame.setVisible(true);	
	}	
}
