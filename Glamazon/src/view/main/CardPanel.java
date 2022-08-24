package view.main;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JPanel;

import model.data.Artikel;
import model.data.Warenkorb;
import view.kasse.KassePanel;
import view.shopping.ShoppingPanel;
import view.warenkorb.WarenkorbPanel;

public class CardPanel extends JPanel {
	private ShoppingPanel shoppingPanel;
	private WarenkorbPanel cartPanel;
	private CardLayout cardLayout;
	private KassePanel kassePanel;

	private final String shopping = "shopping";
	private final String cart = "cart";
	private final String kasse = "kasse";
	/**
	 * @toDO
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
	public KassePanel getKassePanel() {
		return kassePanel;
	}
	public void setKassePanel(KassePanel kassePanel) {
		this.kassePanel = kassePanel;
	}
	public CardPanel() {
		this.setCardLayout(new CardLayout());
		this.setLayout(this.getCardLayout());
		this.setBounds(0, 150, 1008, 580);

		this.setShoppingPanel(new ShoppingPanel());
		this.add(this.getShoppingPanel(), this.shopping);

		this.setCartPanel(new WarenkorbPanel());
		this.add(this.getCartPanel(), this.cart);

		this.setKassePanel(new KassePanel());
		this.add(this.getKassePanel(), this.kasse);
	}
	public void showCartPanel() {
		this.getCardLayout().show(this, this.cart);
	}
	public void showShoppingPanel() {
		this.getCardLayout().show(this, this.shopping);
	}
	public void showKassePanel() {
		this.getCardLayout().show(this, this.kasse);
	}
	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getCartPanel().addActionListenerToBtnKasse(al);
	}
	public void displayArtikel(List<Artikel> artikel) {
		this.getShoppingPanel().displayArtikel(artikel);
		
	}
	public void addActionListenerToArtikelPanel(ActionListener al) {
		this.getShoppingPanel().addActionListenerToArtikelPanel(al);	
	}
	public void aktualisiereWarenKorbView(Warenkorb warenkorb) {
		this.getCartPanel().aktualisiereWarenKorbView(warenkorb);		
	}



}
