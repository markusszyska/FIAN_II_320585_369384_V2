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
	private JLabel lblSumme;
	
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
	public JLabel getLblSumme() {
		return lblSumme;
	}
	public void setLblSumme(JLabel lblSumme) {
		this.lblSumme = lblSumme;
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
		
		JLabel lblVersaddaten = new JLabel("Versanddaten");
		lblVersaddaten.setBounds(10, 11, 130, 31);
		this.getDataPanel().add(lblVersaddaten);
		
		this.setTxtVorname(new JTextField(10));
		this.getTxtVorname().setBounds(10, 97, 200, 30);
		this.getDataPanel().add(this.getTxtVorname());
		
		this.setTxtNachname(new JTextField(10));
		this.getTxtNachname().setBounds(10, 161, 200, 30);
		this.getDataPanel().add(this.getTxtNachname());
		
		this.setTxtStrasse(new JTextField(10));
		this.getTxtStrasse().setBounds(10, 225, 200, 30);
		this.getDataPanel().add(this.getTxtStrasse());
		
		this.setTxtNr(new JTextField(10));
		this.getTxtNr().setBounds(220, 225,75,30);
		this.getDataPanel().add(this.getTxtNr());
		
		this.setTxtPlz(new JTextField(10));
		this.getTxtPlz().setBounds(10, 285, 75, 30);
		this.getDataPanel().add(this.getTxtPlz());
		
		this.setTxtOrt(new JTextField(10));
		this.getTxtOrt().setBounds(95, 285, 200, 30);
		this.getDataPanel().add(this.getTxtOrt());
		
		JLabel lblVorname = new JLabel("Vorname");
		lblVorname.setBounds(10, 73, 89, 23);
		this.getDataPanel().add(lblVorname);
		
		JLabel lblNachname = new JLabel("Nachname");
		lblNachname.setBounds(10, 138, 89, 23);
		this.getDataPanel().add(lblNachname);
		
		JLabel lblStrasse = new JLabel("Strasse");
		lblStrasse.setBounds(10, 202, 89, 23);
		this.getDataPanel().add(lblStrasse);
		
		JLabel lblNr = new JLabel("Nr.");
		lblNr.setBounds(220, 202, 75, 23);
		this.getDataPanel().add(lblNr);
		
		JLabel lblPlz = new JLabel("Plz");
		lblPlz.setBounds(10, 266, 75, 23);
		this.getDataPanel().add(lblPlz);
		
		JLabel lblOrt = new JLabel("Ort");
		lblOrt.setBounds(95, 266, 75, 23);
		this.getDataPanel().add(lblOrt);
		
		JLabel lblBetrag = new JLabel("Zu zahlender Betrag");
		lblBetrag.setBounds(477, 285, 149, 31);
		this.getDataPanel().add(lblBetrag);
		
		this.setLblSumme(new JLabel("0.00"));
		this.getLblSumme().setBounds(684, 285, 82, 31);
		this.getDataPanel().add(this.getLblSumme());
		
		this.setBtnBackToCart(new JButton("Zurueck zum Warenkorb"));
		this.getBtnBackToCart().setBounds(24, 482, 198, 23);
		this.add(this.getBtnBackToCart());
		
		this.setBtnSendOrder(new JButton("Verbindlich bestellen"));
		this.getBtnSendOrder().setBounds(785, 482, 198, 23);
		this.add(this.getBtnSendOrder());
		
	}
	
}
