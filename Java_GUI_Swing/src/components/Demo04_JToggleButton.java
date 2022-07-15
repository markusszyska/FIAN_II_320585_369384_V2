package components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.WindowConstants;

public class Demo04_JToggleButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo04_JToggleButton");
		frame.setBounds(600, 300, 640, 480);
		JPanel contentPane = (JPanel) frame.getContentPane();
//		contentPane.setBackground(Color.blue);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));

		/*
		 * An implementation of a two-state button.The JRadioButton and JCheckBox
		 * classes are subclasses of this class.
		 */
		JToggleButton tglbtn = new JToggleButton("Toggle Me");

		JLabel label = new JLabel("Hier soll der Text rein, ob der Button gedrueckt ist");

		JButton btn = new JButton("Check Toggle");
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (tglbtn.isSelected()) {
					System.out.println("Ist eingeschaltet");
					label.setText("              AN               ");
				} else {
					System.out.println("Ist ausgeschaltet");
					label.setText("              AUS               ");
				}
			}
		});

		contentPane.add(tglbtn);
		contentPane.add(label);
		contentPane.add(btn);

		frame.setVisible(true);
	}
}
