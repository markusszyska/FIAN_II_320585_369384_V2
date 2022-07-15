package components;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class Demo01_JFrame {
	public static void main(String[] args) {
		//Der JFrame ist der Rahmen der GUI
		//Im Frame werden alle Elemente plaziert
		JFrame frame = new JFrame();

		//Programm beenden beim Schliessen des Fensters
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//Titel setzen
		frame.setTitle("Demo01_JFrame");
		//Groesse und Position festlegen.
		frame.setBounds(600, 300, 640, 480);
		//Die Referenz auf das ContentPane herausholen
		JPanel contentPane = (JPanel)frame.getContentPane();
		//Hintergrundfarbe des Panel veraendern
		contentPane.setBackground(Color.BLUE);
		//Das Frame sichtbar machen.
		//Sollte immer als letztes passieren,
		//damit alles sauber gezeichnet wird.
		frame.setVisible(true);
	}
}
