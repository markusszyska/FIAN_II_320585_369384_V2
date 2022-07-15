package components;

import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo03_JLabel {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo03_JLabel");
		frame.setBounds(600, 300, 640, 480);
		JPanel contentPane = (JPanel) frame.getContentPane();
//		contentPane.setBackground(Color.blue);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));

		/*
		 * A display area for a short text string or an image,or both.A label does not
		 * react to input events.As a result, it cannot get the keyboard focus.A label
		 * can, however, display a keyboard alternative as a convenience for a nearby
		 * component that has a keyboard alternative but can't display it.
		 */
		JLabel label = new JLabel("Der Text des Labels");
//		label.setBackground(Color.red);
		/*
		 * If true the component paints every pixel within its bounds.Otherwise, the
		 * component may not paint some or all of its pixels, allowing the underlying
		 * pixels to show through.
		 */
		label.setOpaque(true);
		
		JLabel label2 = new JLabel();
		
		ImageIcon icon = new ImageIcon(Demo03_JLabel.class.getResource("/rkt.png"));
		System.out.println("icon Breite: " + icon.getIconWidth());
		System.out.println("icon Hoehe: " + icon.getIconHeight());
		label2.setIcon(icon);
		
		JLabel label3 = new JLabel();
		//Ein ImageIcon in der Groesse skalieren
		ImageIcon iconscaled = new ImageIcon(icon.getImage().getScaledInstance(80, 100, 0));
		label3.setIcon(iconscaled);
		
		contentPane.add(label);
//		contentPane.add(label2);
		contentPane.add(label3);
		frame.setVisible(true);
	}
}
