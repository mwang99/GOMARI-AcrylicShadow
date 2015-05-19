import javax.swing.*;

class GUI extends JFrame {
	
	public GUI(){
		
		JFrame frame = new JFrame("Acrylic Shadow // GOMARI");
		frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
		frame.getContentPane().add(new Buttons());
		frame.setSize(600,400);	
		frame.setVisible(true);	
			
	}
	
}
