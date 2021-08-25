import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	JButton button;
	JLabel label;
	JFrame frame;
	JTextField textField; 
	JTextArea textArea;
	ImageIcon image1;
	public GUI() {
		
		//Create Button
		button = new JButton("Submit");
		button.setBounds(150, 150, 60, 100);
		button.addActionListener(this);
		
		//Creating Text Field
		textField = new JTextField(10);
		textField.getText();
		//Setting up ImageIcon
		image1 = new ImageIcon(this.getClass().getResource("/league.jpeg"));
		
		//Setting up Frame
		frame = new JFrame("Custon Frame");
		frame.setSize(new Dimension(420,420));
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//adding image to frame
		frame.setContentPane(new JLabel(image1));
		//Setting up Label
		label = new JLabel();
		frame.setLayout(new FlowLayout());
		frame.add(button);
		frame.add(label);
		frame.add(textField);
		frame.setSize(1200,630);
		frame.setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			System.out.println(textField.getText());
		}
	}
}
