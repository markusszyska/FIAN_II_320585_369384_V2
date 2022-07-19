package view;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class MainView extends JFrame {

	private ShoppingPanel shoppingPanel;
	private StartPanel startPanel;

	public ShoppingPanel getShoppingPanel() {
		return shoppingPanel;
	}

	public void setShoppingPanel(ShoppingPanel shoppingPanel) {
		this.shoppingPanel = shoppingPanel;
	}

	public StartPanel getStartPanel() {
		return startPanel;
	}

	public void setStartPanel(StartPanel startPanel) {
		this.startPanel = startPanel;
	}

	public MainView() {
		this.setBounds(400, 300, 1024, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setShoppingPanel(new ShoppingPanel());
		this.setStartPanel(new StartPanel());
		this.setContentPane(this.getStartPanel());
		
		this.setVisible(true);
	}

	public void addActionListenerToStartButton(ActionListener al) {
		this.getStartPanel().addActionListenerToStartButton(al);		
	}
	public void addActionListenerToReturnToStartButton(ActionListener al) {
		this.getShoppingPanel().addActionListenerToStartButton(al);		
	}

	public void showShoppingPanel() {
		this.setContentPane(this.getShoppingPanel());
	}
	
	public void showStartPanel() {
		this.setContentPane(this.getStartPanel());
	}
}
