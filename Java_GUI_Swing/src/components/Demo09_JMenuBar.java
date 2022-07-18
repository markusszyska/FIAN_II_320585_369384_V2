package components;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JCheckBoxMenuItem;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JSeparator;
import javax.swing.WindowConstants;

public class Demo09_JMenuBar {

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setTitle("Demo09_JMenuBar");
		frame.setBounds(600, 300, 640, 480);
		JPanel panel = (JPanel) frame.getContentPane();
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 100));
		
		JMenuBar bar = new JMenuBar();
		frame.setJMenuBar(bar);
		
		JMenu datei = new JMenu("Datei");
		bar.add(datei);
		
		
		JMenuItem laden = new JMenuItem("Laden");
		datei.add(laden);
		laden.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Lade Datei");				
			}
		});
		JMenuItem speichern = new JMenuItem("Speichern");
		datei.add(speichern);
		speichern.addActionListener(new ActionListener() {		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Speichere Datei");				
			}
		});
		JSeparator separator = new JSeparator();
		datei.add(separator);
		
		JMenuItem beenden = new JMenuItem("Beenden");
		datei.add(beenden);
		
		JMenu edit = new JMenu("Editieren");
		bar.add(edit);
		
		JMenuItem font = new JMenuItem("Schriftart");
		edit.add(font);
		
		JMenu fontsize = new JMenu("Schriftgroesse");
		edit.add(fontsize);
		
		JMenuItem groesser = new JMenuItem("Groesser");
		fontsize.add(groesser);
		
		JMenuItem kleiner = new JMenuItem("Kleiner");
		fontsize.add(kleiner);
		
		JMenu chk = new JMenu("Checkboxen");
		bar.add(chk);
		
		JCheckBoxMenuItem checkBox = new JCheckBoxMenuItem("Eine Checkbox");
		chk.add(checkBox);
		
		JRadioButtonMenuItem radioBtn = new JRadioButtonMenuItem("Ein Radiobutton");
		chk.add(radioBtn);
		
		
		frame.setVisible(true);
	}

}
