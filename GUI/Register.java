import javax.swing.*;

class Register extends JFrame {
	
	public Register(){
	
		JFrame frame = new JFrame("Register");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(new RegisterButtons());
		frame.setSize(300,300);	
		frame.pack();
		frame.setVisible(true);	
			
	}
}
