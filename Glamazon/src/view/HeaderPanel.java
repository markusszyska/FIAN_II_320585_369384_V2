package view;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HeaderPanel extends JPanel {
	private JLabel logo;
	private JTextField suche;
	private JButton btnSuchen;

	public JLabel getLogo() {
		return logo;
	}

	public void setLogo(JLabel logo) {
		this.logo = logo;
	}

	public JTextField getSuche() {
		return suche;
	}

	public void setSuche(JTextField suche) {
		this.suche = suche;
	}

	public JButton getBtnSuchen() {
		return btnSuchen;
	}

	public void setBtnSuchen(JButton btnSuchen) {
		this.btnSuchen = btnSuchen;
	}

	public HeaderPanel() {
		this.setBounds(0, 0, 1024, 250);
		this.setLayout(null);
		this.setLogo(new JLabel("Logo"));
		
		this.getLogo().setBounds(20, 20, 80, 72);
		this.getLogo().setOpaque(true);
		this.getLogo().setBackground(Color.ORANGE);
		this.add(this.getLogo());
		
		
		this.setSuche(new JTextField());
		this.getSuche().setBounds(120, 100 , 400,20);
		this.add(this.getSuche());
		
		this.setBtnSuchen(new JButton("Suchen"));
		this.getBtnSuchen().setBounds(550, 20, 189, 149);
		this.add(this.getBtnSuchen());
		
	}
}
