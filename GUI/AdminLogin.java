import javax.swing.*;

class AdminLogin extends JFrame {
	
	public AdminLogin(){
	
		JFrame frame = new JFrame("Login");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(new AdminLoginButtons());
		frame.setSize(300,75);	
		frame.pack();
		frame.setVisible(true);	
			
	}
}
