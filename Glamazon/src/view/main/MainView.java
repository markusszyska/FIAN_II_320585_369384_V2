package view.main;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;

import model.data.Artikel;

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

	public void addActionListenerToCartBtn(ActionListener al) {
		this.getMainPanel().addActionListenerToCartBtn(al);
	}

	public void addActionListenerToBtnSuchen(ActionListener al) {
		this.getMainPanel().addActionListenerToBtnSuchen(al);
	}

	public void addActionListenerToBtnKasse(ActionListener al) {
		this.getMainPanel().addActionListenerToBtnKasse(al);
	}

	public void showMainPanel() {
		this.setContentPane(this.getMainPanel());
	}

	public void showStartPanel() {
		this.setContentPane(this.getStartPanel());
	}

	public void showCartPanel() {
		this.getMainPanel().showCartPanel();
	}

	public void showShoppingPanel() {
		this.getMainPanel().showShoppingPanel();
	}

	public void showKassePanel() {
		this.getMainPanel().showKassePanel();
	}

	public void displayArtikel(List<Artikel> artikel) {
		this.getMainPanel().displayArtikel(artikel);
	}

}
