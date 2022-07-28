package view.kasse;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EtchedBorder;

public class KassePanel extends JPanel{

	private JPanel headerPanel;
	private JPanel dataPanel;
	private JTextField txtVorname;
	private JTextField txtNachname;
	private JTextField txtStrasse;
	private JTextField txtPlz;
	private JTextField txtOrt;
	private JTextField txtNr;
	private JButton btnBackToCart;
	private JButton btnSendOrder;
	
	public JPanel getHeaderPanel() {
		return headerPanel;
	}
	public void setHeaderPanel(JPanel headerPanel) {
		this.headerPanel = headerPanel;
	}
	public JPanel getDataPanel() {
		return dataPanel;
	}
	public void setDataPanel(JPanel dataPanel) {
		this.dataPanel = dataPanel;
	}
	public JTextField getTxtVorname() {
		return txtVorname;
	}
	public void setTxtVorname(JTextField txtVorname) {
		this.txtVorname = txtVorname;
	}
	public JTextField getTxtNachname() {
		return txtNachname;
	}
	public void setTxtNachname(JTextField txtNachname) {
		this.txtNachname = txtNachname;
	}
	public JTextField getTxtStrasse() {
		return txtStrasse;
	}
	public void setTxtStrasse(JTextField txtStrasse) {
		this.txtStrasse = txtStrasse;
	}
	public JTextField getTxtPlz() {
		return txtPlz;
	}
	public void setTxtPlz(JTextField txtPlz) {
		this.txtPlz = txtPlz;
	}
	public JTextField getTxtOrt() {
		return txtOrt;
	}
	public void setTxtOrt(JTextField txtOrt) {
		this.txtOrt = txtOrt;
	}
	public JTextField getTxtNr() {
		return txtNr;
	}
	public void setTxtNr(JTextField txtNr) {
		this.txtNr = txtNr;
	}
	public JButton getBtnBackToCart() {
		return btnBackToCart;
	}
	public void setBtnBackToCart(JButton btnBackToCart) {
		this.btnBackToCart = btnBackToCart;
	}
	public JButton getBtnSendOrder() {
		return btnSendOrder;
	}
	public void setBtnSendOrder(JButton btnSendOrder) {
		this.btnSendOrder = btnSendOrder;
	}
	
	public KassePanel() {
		this.setBackground(Color.LIGHT_GRAY);
		this.setBounds(0, 150, 1008, 580);
		this.setOpaque(true);
		this.setLayout(null);
		
		this.setHeaderPanel(new JPanel());
		this.getHeaderPanel().setBounds(0, 0, 1008, 40);
		this.getHeaderPanel().setLayout(null);
		this.add(this.getHeaderPanel());
		
		JLabel lblKasse = new JLabel("  Kasse");
		lblKasse.setBounds(0, 0, 135, 40);
		this.getHeaderPanel().add(lblKasse);
		
		this.setDataPanel(new JPanel());
		this.getDataPanel().setBounds(24, 71, 959, 382);
		this.getDataPanel().setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		this.getDataPanel().setLayout(null);
		this.add(this.getDataPanel());
		
		
		
	}
	
}
