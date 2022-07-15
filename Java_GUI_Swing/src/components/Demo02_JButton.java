package components;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo02_JButton {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo02_JButton");
		frame.setBounds(600, 300, 640, 480);
		JPanel contentPane = (JPanel) frame.getContentPane();
		contentPane.setBackground(Color.BLUE);
		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		
		//An implementation of a "push" button. 
		JButton btn = new JButton("Hier Beschriftung einfuegen");
		btn.setText("Oder so");
		//Dem Panel den Button hinzufuegen
		contentPane.add(btn);
		//ActionListener fuer den Button erstellen
		ActionListener al = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Der Actionlistener reagiert auf den Klick des Buttons");				
			}
		};
		//Den ActionListener am Button registrieren
		btn.addActionListener(al);
		
		
		frame.setVisible(true);
	}
}
