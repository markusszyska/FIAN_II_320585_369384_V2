package components;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo06_JCheckBox {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo06_JCheckBox");
		frame.setBounds(600, 300, 640, 480);
		JPanel contentPane = (JPanel) frame.getContentPane();
//		contentPane.setBackground(Color.blue);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));

		/*
		 * An implementation of a check box -- an item that can be selected
		 * or deselected, and which displays its state to the user.By convention, any
		 * number of check boxes in a group can be selected
		 */
		JCheckBox chk = new JCheckBox("Box 1");
		JCheckBox chk2 = new JCheckBox("Box 2");

		JCheckBox chk3 = new JCheckBox("Group 1");
		JCheckBox chk4 = new JCheckBox("Group 2");

		ButtonGroup bg = new ButtonGroup();
		bg.add(chk3);
		bg.add(chk4);

		contentPane.add(chk);
		contentPane.add(chk2);
		contentPane.add(chk3);
		contentPane.add(chk4);
		frame.setVisible(true);
	}
}
