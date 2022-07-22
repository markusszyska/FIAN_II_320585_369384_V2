package view.main;

import javax.swing.JPanel;

import view.shopping.HeaderPanel;
import view.shopping.ShoppingPanel;

public class MainPanel extends JPanel{
	private HeaderPanel headerPanel;
	private CardPanel cardPanel;
	/**
	 * @toDO
	 * WarenkorbPanel
	 * KassePanel
	 */
		
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
	public MainPanel() {
		this.setLayout(null);
		this.setBounds(0, 0, 1024, 768);
		
		this.setHeaderPanel(new HeaderPanel());
		this.add(this.getHeaderPanel());
		
		this.setCardPanel(new CardPanel());
		this.add(this.getCardPanel());
		
		
	}
	
}
