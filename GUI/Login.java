import javax.swing.*;

class Login extends JFrame {
	
	public Login(){
	
		JFrame frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(new LoginButtons());
		frame.setSize(300,75);
		frame.pack();	
		frame.setVisible(true);	
			
	}
}
