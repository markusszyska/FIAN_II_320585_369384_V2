package model;

import model.crud.DataLoader;
import model.data.Sortiment;

public class MainModel {

	private Sortiment sortiment;

	public Sortiment getSortiment() {
		return sortiment;
	}

	public void setSortiment(Sortiment sortiment) {
		this.sortiment = sortiment;
	}

	public MainModel() {
		this.setSortiment(DataLoader.getInstance().getArtikelFromDataBase());
	}

}
