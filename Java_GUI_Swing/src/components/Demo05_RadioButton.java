package components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.WindowConstants;

public class Demo05_RadioButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo05_RadioButton");
		frame.setBounds(600, 300, 640, 480);
		JPanel contentPane = (JPanel) frame.getContentPane();
//		contentPane.setBackground(Color.blue);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));

		/*
		 * An implementation of a radio button -- an item that can be selected
		 * or deselected, and which displays its state to the user.Used with a
		 * ButtonGroup object to create a group of buttons in which only one button at a
		 * time can be selected. (Create a ButtonGroup object and use its add method to
		 * include the JRadioButton objects in the group.)
		 */
		JRadioButton rdbtn = new JRadioButton("Radio 1");
		JRadioButton rdbtn2 = new JRadioButton("Radio 2");

		JRadioButton rdbtn3 = new JRadioButton("Group 1");
		JRadioButton rdbtn4 = new JRadioButton("Group 2");

		ButtonGroup bg = new ButtonGroup();
		bg.add(rdbtn3);
		bg.add(rdbtn4);
		
		JButton btn = new JButton("Check die Boxen");
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(rdbtn.isSelected()) {
					System.out.println(rdbtn.getText());
				}
				if(rdbtn2.isSelected()) {
					System.out.println(rdbtn2.getText());
				}	
				if(rdbtn3.isSelected()) {
					System.out.println(rdbtn3.getText());
				}	
				if(rdbtn4.isSelected()) {
					System.out.println(rdbtn4.getText());
				}	
			}
		});
		
		
		contentPane.add(rdbtn);
		contentPane.add(rdbtn2);
		contentPane.add(rdbtn3);
		contentPane.add(rdbtn4);
		contentPane.add(btn);
		frame.setVisible(true);
	}
}
