package ui;

import javax.swing.JFrame;

public class Frame extends JFrame  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();		
		frame.setLayout(null);
		frame.setSize(1100, 700);
		frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

		
		EnterPanel ep = new EnterPanel();
		ep.setOpaque(false);
		frame.add(ep);
		ep.setBounds(0, 0, 1100, 700);
		
		ep.setLayout(null);
		EnterButton eb = new EnterButton();
		ep.add(eb);
		eb.setBounds(300, 500, 415, 95);		
		
		
		frame.setVisible(true);
	}

}
