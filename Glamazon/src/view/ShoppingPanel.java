package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class ShoppingPanel extends JPanel {
	private JButton btnReturn;
	private HeaderPanel headerPanel;

	public JButton getBtnReturn() {
		return btnReturn;
	}

	public void setBtnReturn(JButton btnReturn) {
		this.btnReturn = btnReturn;
	}

	public HeaderPanel getHeaderPanel() {
		return headerPanel;
	}

	public void setHeaderPanel(HeaderPanel headerPanel) {
		this.headerPanel = headerPanel;
	}

	public ShoppingPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1024, 768);
		this.setBackground(Color.LIGHT_GRAY);

		this.setBtnReturn(new JButton("Zurueck zum Start"));
		this.getBtnReturn().setBounds(437, 600, 150, 35);
		this.add(this.getBtnReturn());
		
		this.setHeaderPanel(new HeaderPanel());
		this.add(this.getHeaderPanel());
	}

	public void addActionListenerToStartButton(ActionListener al) {
		this.getBtnReturn().addActionListener(al);
	}
}
