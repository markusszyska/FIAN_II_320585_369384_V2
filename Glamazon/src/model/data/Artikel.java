package model.data;

import java.util.Set;

public class Artikel {
	private int artikelId;
	private String artName;
	private String artBeschreibung;
	private double preis;
	//private ImageIcon icon;
	private String bild;//Wird spaeter ImageIcon
	private Set<String> kategorien;
	private int mwst;
		
	public int getArtikelId() {
		return artikelId;
	}
	public void setArtikelId(int artikelId) {
		this.artikelId = artikelId;
	}
	public String getArtName() {
		return artName;
	}
	public void setArtName(String artName) {
		this.artName = artName;
	}
	public String getArtBeschreibung() {
		return artBeschreibung;
	}
	public void setArtBeschreibung(String artBeschreibung) {
		this.artBeschreibung = artBeschreibung;
	}
	public double getPreis() {
		return preis;
	}
	public void setPreis(double preis) {
		this.preis = preis;
	}
	public String getBild() {
		return bild;
	}
	public void setBild(String bild) {
		this.bild = bild;
	}
	public Set<String> getKategorien() {
		return kategorien;
	}
	public void setKategorien(Set<String> kategorien) {
		this.kategorien = kategorien;
	}
	public int getMwst() {
		return mwst;
	}
	public void setMwst(int mwst) {
		this.mwst = mwst;
	}
	
	
	
}
