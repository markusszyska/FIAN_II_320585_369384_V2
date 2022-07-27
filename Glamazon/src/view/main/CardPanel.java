package view.main;

import java.awt.CardLayout;

import javax.swing.JPanel;

import view.shopping.ShoppingPanel;
import view.warenkorb.WarenkorbPanel;

public class CardPanel extends JPanel{
	private ShoppingPanel shoppingPanel;
	private WarenkorbPanel cartPanel;
	private CardLayout cardLayout;
	
	private final String shopping = "shopping";
	private final String cart = "cart";
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
	
	public WarenkorbPanel getCartPanel() {
		return cartPanel;
	}
	public void setCartPanel(WarenkorbPanel cartPanel) {
		this.cartPanel = cartPanel;
	}	
	public CardLayout getCardLayout() {
		return cardLayout;
	}
	public void setCardLayout(CardLayout cardLayout) {
		this.cardLayout = cardLayout;
	}
	
	public CardPanel() {
		this.setLayout(new CardLayout());
		this.setBounds(0, 150, 1008, 580);
		
		this.setCardLayout((CardLayout)this.getLayout());
		
		this.setShoppingPanel(new ShoppingPanel());
		this.add(this.getShoppingPanel(), this.shopping);
		
		this.setCartPanel(new WarenkorbPanel());
		this.add(this.getCartPanel(), this.cart);
		
	}
	public void showCartPanel() {
		this.getCardLayout().show(this, this.cart);		
	}
	public void showShoppingPanel() {
		this.getCardLayout().show(this, this.shopping);
	}
	
	
	
}
