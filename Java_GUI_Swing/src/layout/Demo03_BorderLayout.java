package layout;

import java.awt.BorderLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo03_BorderLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo03_BorderLayout");
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = (JPanel) frame.getContentPane();
		
		panel.setLayout(new BorderLayout(10, 10));
		
		JButton north = new JButton("North");
		north.setPreferredSize(new Dimension(100, 50));
		JButton west = new JButton("West");
		west.setPreferredSize(new Dimension(100, 50));
		JButton east = new JButton("East");
		JButton south = new JButton("South");
		JButton center = new JButton("Center");
		
		panel.add(north, BorderLayout.NORTH);
		panel.add(west, BorderLayout.WEST);
		panel.add(center, BorderLayout.CENTER);
		panel.add(east, BorderLayout.EAST);
		panel.add(south, BorderLayout.SOUTH);
		
		frame.setVisible(true);
	}
}
