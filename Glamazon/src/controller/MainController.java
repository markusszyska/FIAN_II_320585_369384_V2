package controller;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.JMenu;

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
		
		this.getMainView().getMainPanel().getMenuPanel().getMenuList().get(0).addActionListener(this::kat1);
		this.getMainView().getMainPanel().getMenuPanel().getMenuList().get(1).addActionListener(this::kat2);
	
		
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
	
	private void kat1(ActionEvent e) {
		this.getMainView().getMainPanel().getCardPanel().getShoppingPanel().showSearchResults("Kat1 ", "Kat1 ", "Kat1 ", 0);
	}
	
	private void kat2(ActionEvent e) {
		this.getMainView().getMainPanel().getCardPanel().getShoppingPanel().showSearchResults("Kat2 ", "Kat2 ", "Kat2 ", 0);
	}
	
}
