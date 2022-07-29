package model.data;

import java.util.HashSet;
import java.util.Set;

public class Sortiment {
	Set<Artikel> alleArtikel;

	public Set<Artikel> getAlleArtikel() {
		return alleArtikel;
	}

	public void setAlleArtikel(Set<Artikel> alleArtikel) {
		this.alleArtikel = alleArtikel;
	}
	
	public Sortiment() {
		this.setAlleArtikel(new HashSet<>());
	}
}
