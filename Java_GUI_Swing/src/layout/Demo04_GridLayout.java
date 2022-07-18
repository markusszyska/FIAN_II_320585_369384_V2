package layout;

import java.awt.Component;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo04_GridLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo04_GridLayout");
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = (JPanel) frame.getContentPane();
		
		panel.setLayout(new GridLayout(4, 4, 5 ,5));
		
		JButton btn = new JButton("Gesuchter Button");		
		for (int i = 0; i < 12; i++) {
			if(i == 3) {
				panel.add(btn);
			}else {
				panel.add(new JButton("Hallo"));				
			}
		}
		Component[] comp = panel.getComponents();
		for (Component c : comp) {		
			if(c == btn) {
				System.out.println("c ist unser gesuchter Button");
				System.out.println(c.getParent() == panel);
			}
		}
		
		frame.setVisible(true);
		
	}
}
