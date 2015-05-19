import javax.swing.*;

class Register extends JFrame {
	
	public Register(){
	
		JFrame frame = new JFrame("Register");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(new RegisterButtons());
		frame.setSize(600,500);	
		frame.setVisible(true);	
			
	}
}
