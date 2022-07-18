package layout;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo02_FlowLayout {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo02_FlowLayout");
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = (JPanel) frame.getContentPane();
		
		panel.setLayout(new FlowLayout(FlowLayout.LEFT, 50, 50));

		JButton btn = new JButton("Button 1");
//		btn.setBounds(100, 100, 100, 50);
//		btn.setMinimumSize(new Dimension(100, 50));
		btn.setPreferredSize(new Dimension(100, 50));
		JButton btn2 = new JButton("Button 2");
		
		JButton btn3 = new JButton("Button 3");
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		
		frame.setVisible(true);
	}

}
