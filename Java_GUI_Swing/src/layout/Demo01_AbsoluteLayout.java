package layout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo01_AbsoluteLayout {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo01_AbsoluteLayout");
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = (JPanel) frame.getContentPane();
		//null fuer absolutes Layout
		panel.setLayout(null);
		
		JButton btn = new JButton("Button 1");
		btn.setBounds(50, 50, 100, 50);
		
		JButton btn2 = new JButton("Button 2");
		btn2.setBounds(150, 100, 100, 50);
		
		JButton btn3 = new JButton("Button 3");
		btn3.setBounds(300, 300, 100, 50);
		
		frame.setResizable(false);
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		frame.setVisible(true);
	}
}
