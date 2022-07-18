package components;

import java.awt.FlowLayout;
import java.util.Hashtable;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Demo08_JSlider {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo08_JSlider");
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));

		/*
		 * A component that lets the user graphically select a value by sliding a knob
		 * within a bounded interval. The knob is always positioned at the points that
		 * match integer values within the specified interval.
		 */
		JSlider slider = new JSlider(SwingConstants.VERTICAL);
		slider.setMajorTickSpacing(10);
		slider.setPaintTicks(true);
//		slider.setMaximum(1000);
		slider.setSnapToTicks(true);
		slider.addChangeListener(new ChangeListener() {
			@Override
			public void stateChanged(ChangeEvent e) {
				int value = slider.getValue();
				System.out.println(value);
			}
		});
		
		Hashtable<Integer, JLabel> lblTable = new Hashtable<>();
		lblTable.put(0, new JLabel("Stop"));
		lblTable.put(50, new JLabel("Mittel"));
		lblTable.put(100, new JLabel("Schnell"));
		
		slider.setLabelTable(lblTable);
		slider.setPaintLabels(true);
		
		panel.add(slider);

		frame.setVisible(true);
	}
}
