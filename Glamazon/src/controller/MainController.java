package controller;

import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JButton;

import model.MainModel;
import model.data.Artikel;
import view.main.MainView;

public class MainController {

	private MainView mainView;
	private MainModel model;

	public MainView getMainView() {
		return mainView;
	}

	public void setMainView(MainView mainView) {
		this.mainView = mainView;
	}

	public MainModel getModel() {
		return model;
	}

	public void setModel(MainModel model) {
		this.model = model;
	}

	public MainController() {
		this.setMainView(new MainView());
		this.setModel(new MainModel());
		this.getMainView().addActionListenerToStartButton(this::startShopping);
		this.getMainView().addActionListenerToCartBtn(this::showCartPanel);
		this.getMainView().addActionListenerToBtnSuchen(this::showShoppingPanel);
		this.getMainView().addActionListenerToBtnKasse(this::showKassePanel);
		this.getMainView().addKategorieBtn(this.getModel().getAlleKategorien());
		this.getMainView().addActionListenerToKategorieBtn(this::filterKategorie);
		this.getMainView().displayArtikel(this.getModel().getSortiment().getAlleArtikel());
	}

	private void startShopping(ActionEvent e) {
		this.getMainView().showMainPanel();
	}

	private void showCartPanel(ActionEvent e) {
		this.getMainView().showCartPanel();
	}

	private void showShoppingPanel(ActionEvent e) {
		this.getMainView().showShoppingPanel();
	}

	private void showKassePanel(ActionEvent e) {
		this.getMainView().showKassePanel();
	}

	private void filterKategorie(ActionEvent e) {
		String btnText = ((JButton) e.getSource()).getText();
		if (!btnText.equals("Alle Artikel"))
			this.getMainView().displayArtikel(this.getModel().filterSortimentKategorie(btnText));
		else 
			this.getMainView().displayArtikel(this.getModel().getAlleArtikel());
		
	}

}
