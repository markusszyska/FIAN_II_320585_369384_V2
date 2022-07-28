package view.warenkorb;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class WarenkorbHeader extends JPanel {
	private JButton btnZurKasse;
	private JLabel lblPreisTotal;

	public JButton getBtnZurKasse() {
		return btnZurKasse;
	}

	public void setBtnZurKasse(JButton btnZurKasse) {
		this.btnZurKasse = btnZurKasse;
	}

	public JLabel getLblPreisTotal() {
		return lblPreisTotal;
	}

	public void setLblPreisTotal(JLabel lblPreisTotal) {
		this.lblPreisTotal = lblPreisTotal;
	}
	public WarenkorbHeader() {
		this.setBounds(0, 0, 1008, 40);
		this.setLayout(null);
		
		var lbl = new JLabel("Warenkorb");
		lbl.setBounds(0, 0, 691, 40);
		this.add(lbl);
		
		this.setLblPreisTotal(new JLabel("Preis Total: "));
		this.getLblPreisTotal().setBounds(691, 0, 195, 40);
		this.add(this.getLblPreisTotal());
		
		this.setBtnZurKasse(new JButton("Zur Kasse"));
		this.getBtnZurKasse().setBounds(907, 9, 100, 23);
		this.add(this.getBtnZurKasse());		
		
	}

	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getBtnZurKasse().addActionListener(al);	
	}
	
	
	
}
