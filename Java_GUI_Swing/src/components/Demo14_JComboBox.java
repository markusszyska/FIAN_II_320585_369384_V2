package components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo14_JComboBox {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo14_JComboBox");
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));

		String[] strings = { "Erster String", "Zweiter String", "Dritter String", "Vierter String" };
		/*
		 * A component that combines a button or editable field and a drop-down list.The
		 * user can select a value from the drop-down list, which appears at the user's
		 * request. If you make the combo box editable, then the combo box includes an
		 * editable field into which the user can type a value.
		 */
		JComboBox<String> cb = new JComboBox<>(strings);
		cb.addItem("Hinzugefuegt");
		cb.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String selectedItem = (String) cb.getSelectedItem();
				System.out.println(selectedItem);
			}
		});
//		cb.setEditable(true);
		panel.add(cb);

		frame.setVisible(true);

	}

}
