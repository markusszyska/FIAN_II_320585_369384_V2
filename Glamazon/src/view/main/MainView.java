package view.main;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import view.shopping.ShoppingPanel;

public class MainView extends JFrame {

	private MainPanel mainPanel;
	private StartPanel startPanel;

	public StartPanel getStartPanel() {
		return startPanel;
	}

	public void setStartPanel(StartPanel startPanel) {
		this.startPanel = startPanel;
	}

	public MainPanel getMainPanel() {
		return mainPanel;
	}

	public void setMainPanel(MainPanel mainPanel) {
		this.mainPanel = mainPanel;
	}

	public MainView() {
		this.setBounds(400, 300, 1024, 768);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setMainPanel(new MainPanel());
		this.setStartPanel(new StartPanel());
		this.setContentPane(this.getStartPanel());
		
		this.setVisible(true);
	}

	public void addActionListenerToStartButton(ActionListener al) {
		this.getStartPanel().addActionListenerToStartButton(al);
	}

	public void addActionListenerToReturnToStartButton(ActionListener al) {
		
	}

	public void showShoppingPanel() {
		this.setContentPane(this.getMainPanel());
	}

	public void showStartPanel() {
		this.setContentPane(this.getStartPanel());
	}
}
