package view.main;

import java.awt.CardLayout;

import javax.swing.JPanel;

public class CardPanel extends JPanel{
	
	public CardPanel() {
		this.setLayout(new CardLayout());
		this.setBounds(0, 0, WIDTH, HEIGHT);
	}
}
