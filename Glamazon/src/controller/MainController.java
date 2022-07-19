package controller;

import java.awt.event.ActionEvent;

import view.MainView;

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
	}
	
	private void startShopping(ActionEvent e) {
		this.getMainView().showShoppingPanel();
	}
	
	private void returnToStart(ActionEvent e) {
		this.getMainView().showStartPanel();
	}
}
