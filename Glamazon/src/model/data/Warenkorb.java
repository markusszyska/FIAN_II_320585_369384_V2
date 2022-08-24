package model.data;

import java.util.ArrayList;
import java.util.List;

public class Warenkorb {
	private List<WarenkorbPosition> positionen;

	public List<WarenkorbPosition> getPositionen() {
		return positionen;
	}

	public void setPositionen(List<WarenkorbPosition> positionen) {
		this.positionen = positionen;
	}
	
	public Warenkorb() {
		this.setPositionen(new ArrayList<>());
	}
	
	public void fuegeArtikelEin(Artikel a, int anzahl) {
		this.getPositionen().add(new WarenkorbPosition(a, anzahl));
	}
}
