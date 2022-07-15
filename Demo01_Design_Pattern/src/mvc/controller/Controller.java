package mvc.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mvc.model.Model;
import mvc.view.View;

public class Controller implements ActionListener {
	private View mainView;
	private Model model;

	public View getMainView() {
		return mainView;
	}

	public void setMainView(View mainView) {
		this.mainView = mainView;
	}

	public Model getModel() {
		return model;
	}

	public void setModel(Model model) {
		this.model = model;
	}

	public Controller() {
		this.setMainView(new View());
		this.setModel(new Model());
		this.getMainView().addActionListenerToButtons(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		switch (e.getActionCommand()) {
		case "Up": {
			int wert = this.getModel().countUp();
			this.getMainView().displayValue(wert);
			break;
		}
		case "Down": {
			int wert = this.getModel().countDown();
			this.getMainView().displayValue(wert);
			break;
		}
		}
	}

}
