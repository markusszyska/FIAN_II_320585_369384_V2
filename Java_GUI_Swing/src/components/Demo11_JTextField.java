package components;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Demo11_JTextField {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo10_JFileChooser");
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		
		Font f = new Font("Arial", Font.PLAIN, 20);
		
		JTextField txtField = new JTextField("Ein einfaches nicht editierbares Textfeld");
		txtField.setEditable(false);
		txtField.setFont(f);
		
		JTextField txtField2 = new JTextField("Ein einfaches editierbares Textfeld");
		txtField2.setFont(f);
		
		JTextField txtField3 = new JTextField("Mit int Columns" , 30);
		txtField3.setFont(f);
		
		JPasswordField pass = new JPasswordField("Passwort", 15);
		pass.setFont(f);
		pass.setEchoChar('*');
		char echoChar = pass.getEchoChar();
		System.out.println((int) echoChar);
		
		JButton btn = new JButton("Anzeigen");
		btn.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(pass.getEchoChar() == echoChar) {
					pass.setEchoChar((char)0);
				}else {
					pass.setEchoChar(echoChar);
				}
				char[] password = pass.getPassword();
				for(char c : password) {
					System.out.print(c);
				}
			}
		});
				
		panel.add(txtField);
		panel.add(txtField2);
		panel.add(txtField3);
		panel.add(pass);
		panel.add(btn);
		frame.setVisible(true);
	}
}
