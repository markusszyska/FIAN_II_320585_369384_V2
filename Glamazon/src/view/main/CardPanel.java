package view.main;

import java.awt.CardLayout;

import javax.swing.JPanel;

import view.shopping.ShoppingPanel;

public class CardPanel extends JPanel{
	private ShoppingPanel shoppingPanel;	
	/**
	 * @toDO
	 * WarenkorbPanel
	 * KassePanel
	 */
	public ShoppingPanel getShoppingPanel() {
		return shoppingPanel;
	}
	public void setShoppingPanel(ShoppingPanel shoppingPanel) {
		this.shoppingPanel = shoppingPanel;
	}
	
	public CardPanel() {
		this.setLayout(new CardLayout());
		this.setBounds(0, 150, 1008, 580);
		
		this.setShoppingPanel(new ShoppingPanel());
		this.add(this.getShoppingPanel());
		
		
	}
	
	
	
}
