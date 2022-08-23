package view.main;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JPanel;

import model.data.Artikel;

public class MainPanel extends JPanel{
	private HeaderPanel headerPanel;
	private CardPanel cardPanel;
	private MenuPanel menuPanel;

	public HeaderPanel getHeaderPanel() {
		return headerPanel;
	}
	public void setHeaderPanel(HeaderPanel headerPanel) {
		this.headerPanel = headerPanel;
	}

	public CardPanel getCardPanel() {
		return cardPanel;
	}
	public void setCardPanel(CardPanel cardPanel) {
		this.cardPanel = cardPanel;
	}

	public MenuPanel getMenuPanel() {
		return menuPanel;
	}
	public void setMenuPanel(MenuPanel menuPanel) {
		this.menuPanel = menuPanel;
	}
	public MainPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1024, 768);

		this.setHeaderPanel(new HeaderPanel());
		this.add(this.getHeaderPanel());

		this.setCardPanel(new CardPanel());
		this.add(this.getCardPanel());

		this.setMenuPanel(new MenuPanel());
		this.add(this.getMenuPanel());
	}
	public void addActionListenerToCartBtn(ActionListener al) {
		this.getHeaderPanel().addActionListenerToCartBtn(al);
	}
	public void addActionListenerToBtnSuchen(ActionListener al) {
		this.getHeaderPanel().addActionListenerToBtnSuchen(al);
	}
	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getCardPanel().addActionListenerToBtnKasse(al);
	}

	public void showCartPanel() {
		this.getCardPanel().showCartPanel();
	}
	public void showShoppingPanel() {
		this.getCardPanel().showShoppingPanel();
	}
	public void showKassePanel() {
		this.getCardPanel().showKassePanel();
	}
	public void displayArtikel(List<Artikel> artikel) {
		this.getCardPanel().displayArtikel(artikel);
		
	}

}
