package view.shopping;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class HeaderPanel extends JPanel {
	private JLabel logo;
	private JTextField suche;
	private JButton btnSuchen;
	private JButton btnWarenkorb;

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

	public JButton getBtnWarenkorb() {
		return btnWarenkorb;
	}

	public void setBtnWarenkorb(JButton btnWarenkorb) {
		this.btnWarenkorb = btnWarenkorb;
	}

	public HeaderPanel() {
		this.setBounds(0, 0, 1024, 120);
		this.setLayout(new FlowLayout(FlowLayout.LEFT, 20,20));
		this.setLogo(new JLabel("Logo"));

		this.getLogo().setPreferredSize(new Dimension(80, 80));
		this.getLogo().setOpaque(true);
		this.getLogo().setBackground(Color.ORANGE);
		this.add(this.getLogo());

		this.setSuche(new JTextField(50));
		this.getSuche().setFont(new Font("Arial", Font.PLAIN, 16));
		this.add(this.getSuche());

		this.setBtnSuchen(new JButton("Suchen"));
		this.getBtnSuchen().setPreferredSize(new Dimension(90, 90));
		this.add(this.getBtnSuchen());
		
		this.setBtnWarenkorb(new JButton("WK"));
		this.getBtnWarenkorb().setPreferredSize(new Dimension(90,90));
		this.add(this.getBtnWarenkorb());
		

	}
}
