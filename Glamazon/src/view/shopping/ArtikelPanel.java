package view.shopping;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.border.EtchedBorder;

public class ArtikelPanel extends JPanel {

	private JLabel lblProductPicture;
	private JLabel lblProductText;
	private JButton btnWarenkorb;
	private JLabel lblProductName;
	private JLabel lblPreis;
	private JSpinner spinner;

	public JLabel getLblProductPicture() {
		return lblProductPicture;
	}

	public void setLblProductPicture(JLabel lblProductPicture) {
		this.lblProductPicture = lblProductPicture;
	}

	public JLabel getLblProductText() {
		return lblProductText;
	}

	public void setLblProductText(JLabel lblProductText) {
		this.lblProductText = lblProductText;
	}

	public JButton getBtnWarenkorb() {
		return btnWarenkorb;
	}

	public void setBtnWarenkorb(JButton btnWarenkorb) {
		this.btnWarenkorb = btnWarenkorb;
	}

	public JLabel getLblProductName() {
		return lblProductName;
	}

	public void setLblProductName(JLabel lblProductName) {
		this.lblProductName = lblProductName;
	}

	public JLabel getLblPreis() {
		return lblPreis;
	}

	public void setLblPreis(JLabel lblPreis) {
		this.lblPreis = lblPreis;
	}

	public JSpinner getSpinner() {
		return spinner;
	}

	public void setSpinner(JSpinner spinner) {
		this.spinner = spinner;
	}

	public ArtikelPanel() {
		this.setBorder(new EtchedBorder(EtchedBorder.RAISED, new Color(112,128,144), null));
		this.setPreferredSize(new Dimension(980, 110));
		this.setLayout(null);
		
		this.setLblProductPicture(new JLabel("Bild"));
		this.getLblProductPicture().setBackground(Color.orange);
		this.getLblProductPicture().setBounds(2, 2, 115, 106);
		this.getLblProductPicture().setOpaque(true);
		this.add(this.getLblProductPicture());
		
		
	}

}
