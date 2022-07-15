package components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo07_JOptionPane {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo07_JOptionPane");
		frame.setBounds(600, 300, 640, 480);
		JPanel contentPane = (JPanel) frame.getContentPane();
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		
		JButton btn = new JButton("Texteingabe");
		btn.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				String text = JOptionPane.showInputDialog(contentPane, "Bitte Text eingeben", "Eine Frage", JOptionPane.INFORMATION_MESSAGE);
				System.out.println(text);
				JOptionPane.showMessageDialog(contentPane, "Danke fuers Klicken", "Ein Titel", JOptionPane.WARNING_MESSAGE);
				
			}
		});
		
		JButton btn2 = new JButton("To Confirm");
		btn2.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				Integer input = JOptionPane.showConfirmDialog(contentPane, "Wirklich beenden?" , "Ein Titel", JOptionPane.YES_NO_CANCEL_OPTION);
				System.out.println(input);								
			}
		});
		
		
		contentPane.add(btn);
		contentPane.add(btn2);
		
		frame.setVisible(true);
	}
}
