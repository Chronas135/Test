import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
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
	JComboBox comboBox;
	Roles role = new Roles();
	//Checkss
	public GUI() {
		
		//Create Button
		button = new JButton("Submit");
		button.setBounds(150, 150, 60, 100);
		button.addActionListener(this);
		
		//Creating Text Field
		textField = new JTextField(17);
		textField.setText("Select the role you are playing?");
		textField.setFont(new Font("Times New Roman", Font.BOLD, 35));
		textField.setForeground(new Color(0xFFFFFF));
		textField.setOpaque(false);
		//Setting up ImageIcon
		image1 = new ImageIcon(this.getClass().getResource("/league.jpeg"));
		
		//Setting up Frame
		frame = new JFrame("Custon Frame");
		frame.setSize(new Dimension(420,420));
		frame.setLocationRelativeTo(null);
		frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		
		//ComboBox
		String[] roles = {"Top", "Jungle", "Mid", "ADC", "Support"};
		comboBox = new JComboBox(roles);
		
		//adding image to frame
		frame.setContentPane(new JLabel(image1));
		//Setting up Label
		label = new JLabel();
		frame.setLayout(new FlowLayout());
		frame.add(button);
		frame.add(label);
		frame.add(textField);
		frame.add(comboBox);
		frame.setSize(1200,630);
		frame.setVisible(true);
		comboBox.addActionListener(this);

	}
	
	public void frameSize(JFrame frame2, JTextField text, String role) {
		frame2 = new JFrame("Your Champion");
		frame2.setSize(new Dimension(500,500));
		frame2.setLocationRelativeTo(null);
		frame2.setLayout(new BorderLayout());
		frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame2.setVisible(true);
		text = new JTextField(13);
		text.setText(role);
		text.setFont(new Font("Default", Font.BOLD, 35));
		text.setForeground(new Color(0xFFFFFF));
		text.setOpaque(false);
		frame2.add(text);
		frame2.setLayout(new FlowLayout());

	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button) {
			if (comboBox.getSelectedItem() == "Top") {
				try {
					JFrame frame2 = new JFrame();
					JTextField textRoll = new JTextField();
					this.frameSize(frame2, textRoll,role.getTopRole());
					frame2.pack();
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
	}
}
