import java.awt.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI {
	
	public GUI() {
		JButton button;
		JLabel label;
		JFrame frame;
		JTextField textField; 
		JTextArea textArea;
		ImageIcon image1;
		
		//Create Button
		button = new JButton("Submit");
		button.setBounds(150, 150, 60, 100);
		
		//Setting up Frame
		frame = new JFrame("Custon Frame");
		frame.setSize(new Dimension(420,420));
		frame.setLayout(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(button);
		frame.setVisible(true);
		
	}
}
