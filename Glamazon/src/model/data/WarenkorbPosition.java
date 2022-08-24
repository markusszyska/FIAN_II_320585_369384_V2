package model.data;

public class WarenkorbPosition {
	private Artikel artikel;
	private int anzahl;
	private double gesamtpreis;
	
	public double getGesamtpreis() {
		return gesamtpreis;
	}

	public void setGesamtpreis(double gesamtpreis) {
		this.gesamtpreis = gesamtpreis;
	}

	public Artikel getArtikel() {
		return artikel;
	}

	public void setArtikel(Artikel artikel) {
		this.artikel = artikel;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}
	
	public WarenkorbPosition(Artikel artikel, int anzahl) {
		this.setArtikel(artikel);
		this.setAnzahl(anzahl);
		this.setGesamtpreis(this.getAnzahl() * this.getArtikel().getPreis());
	}
	
	public WarenkorbPosition() {
		this(new Artikel(),0);
	}

	@Override
	public String toString() {
		return "WarenkorbPosition [artikel=" + artikel + ", anzahl=" + anzahl + ", gesamtpreis=" + gesamtpreis + "] \n";
	}

}
