package model.data;

import java.util.ArrayList;

public class Sortiment {
	ArrayList<Artikel> alleArtikel;

	public ArrayList<Artikel> getAlleArtikel() {
		return alleArtikel;
	}

	public void setAlleArtikel(ArrayList<Artikel> alleArtikel) {
		this.alleArtikel = alleArtikel;
	}
	
	public Sortiment() {
		this.setAlleArtikel(new ArrayList<Artikel>());
	}
}
