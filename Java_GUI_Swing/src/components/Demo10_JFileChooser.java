package components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo10_JFileChooser {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo10_JFileChooser");
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		
		System.out.println("UserDir : " + System.getenv("HOMEPATH"));
		
//		System.getenv().forEach((key, value)->{
//			System.out.println("Key: " + key + " : " + "Value: " + value);
//		});
		
		
		JButton laden = new JButton("Laden");
		laden.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser();
				//Pfad anpassen
				//fc.setCurrentDirectory(new File(System.getenv("HOMEPATH")));
				fc.setCurrentDirectory(new File("./"));
				int ret = fc.showOpenDialog(panel);
				System.out.println("ret: " + ret);
				if(ret == JFileChooser.APPROVE_OPTION) {
					File f = fc.getSelectedFile();
					System.out.println(f);
					try {
						FileReader fr = new FileReader(f);
						BufferedReader br = new BufferedReader(fr);
						while(br.ready()) {
							System.out.println(br.readLine());
						}
					} catch (Exception e1) {
						e1.printStackTrace();
					}
					
				}
			}
		});
		
		JButton btnSave = new JButton("Speichern");
		btnSave.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser(new File("./Zeug"));
				int ret = fc.showSaveDialog(panel);
				if(ret == JFileChooser.APPROVE_OPTION) {
					System.out.println("Datei gespeichert");
				}
				
			}
		});
		
		JButton btnCustom = new JButton("Custom Dialog");
		btnCustom.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser fc = new JFileChooser(new File("./Zeug"));
				int ret = fc.showDialog(panel, "Starten oder sowas");
				if(ret == JFileChooser.APPROVE_OPTION) {
					System.out.println("Gestartet oder sowas");
				}
			}
		});
		
		
		panel.add(laden);
		panel.add(btnSave);
		panel.add(btnCustom);
		frame.setVisible(true);
	}
}
