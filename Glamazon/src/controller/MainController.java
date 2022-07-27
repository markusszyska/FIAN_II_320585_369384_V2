package controller;

import java.awt.event.ActionEvent;

import view.main.MainView;

public class MainController {
	private MainView mainView;

	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}
	
	public MainController() {
		this.setMainView(new MainView());	
		this.getMainView().addActionListenerToStartButton(this::startShopping);
		this.getMainView().addActionListenerToReturnToStartButton(this::returnToStart);
		this.getMainView().addActionListenerToCartBtn(this::showCartPanel);
		this.getMainView().addActionListenerToBtnSuchen(this::showShoppingPanel);
	}
	
	private void startShopping(ActionEvent e) {
		this.getMainView().showMainPanel();
	}
	
	private void returnToStart(ActionEvent e) {
		this.getMainView().showStartPanel();
	}
	
	private void showCartPanel(ActionEvent e) {
		this.getMainView().showCartPanel();
	}
	
	private void showShoppingPanel(ActionEvent e) {
		this.getMainView().showShoppingPanel();
	}
}
