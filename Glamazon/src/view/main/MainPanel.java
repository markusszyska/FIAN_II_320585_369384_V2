package view.main;

import javax.swing.JPanel;

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
	
}
