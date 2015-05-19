import javax.swing.*;

class ClockInOut extends JFrame {
	
	public ClockInOut(){
	
		JFrame frame = new JFrame("Clocking - In/Out");
		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(new ClockButtons());
		frame.setSize(300,75);	
		frame.setVisible(true);	
			
	}
}
