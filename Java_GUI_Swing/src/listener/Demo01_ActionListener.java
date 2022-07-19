package listener;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo01_ActionListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo01_ActionListener");
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		
		JButton btn = new JButton("Anonymes ActionListener Objekt");
		ActionListener al = new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Anonymes Listener Objekt");				
			}
		};
		btn.addActionListener(al);
		
		JButton btn2 = new JButton("Klasse die ActionListener implementiert");
		ActionListener al2 = new MyController();
		btn2.addActionListener(al2);
		btn2.setActionCommand("Action");
		
		JButton btn3 = new JButton("Statische Methodenreferenz");
		btn3.addActionListener(MyController::staticMethod);
		
		JButton btn4 = new JButton("Methodenreferenz Instanzmethode");
		MyController mc = new MyController();
		btn4.addActionListener(mc::instanceMethod);
		
		JButton btn5 = new JButton("Lambda Listener");
		btn5.addActionListener(e -> System.out.println("Lambda Listener"));
		
		panel.add(btn);
		panel.add(btn2);
		panel.add(btn3);
		panel.add(btn4);
		panel.add(btn5);
		frame.setVisible(true);
	}
}

class MyController implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Klasse die ActionListener implementiert");
		System.out.println(e.getActionCommand());
		switch(e.getActionCommand()) {
		case "Action":
			System.out.println("Action Button gedrueckt");
			break;
		}
	}
	
	public static void staticMethod(ActionEvent e) {
		System.out.println("Statische Methode wird als ActionListener ausgefuehrt");
	}
	
	public void instanceMethod(ActionEvent e) {
		System.out.println("Instanz Methode wird als ActionListener ausgefuehrt");
	}
	
}

