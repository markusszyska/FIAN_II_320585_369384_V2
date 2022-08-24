package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

import model.crud.DataLoader;
import model.data.Artikel;
import model.data.Sortiment;
import model.data.Warenkorb;

public class MainModel {

	private Sortiment sortiment;
	private Warenkorb warenkorb;

	public Sortiment getSortiment() {
		return sortiment;
	}

	public void setSortiment(Sortiment sortiment) {
		this.sortiment = sortiment;
	}

	public Warenkorb getWarenkorb() {
		return warenkorb;
	}

	public void setWarenkorb(Warenkorb warenkorb) {
		this.warenkorb = warenkorb;
	}

	public MainModel() {
		this.setSortiment(DataLoader.getInstance().getArtikelFromDataBase());
		this.setWarenkorb(new Warenkorb());
	}

	public List<Artikel> filterSortimentKategorie(String kategorie) {
		List<Artikel> alleArtikel = new ArrayList<>(this.getSortiment().getAlleArtikel());

		Predicate<Artikel> pred = artikel -> !artikel.getKategorien().contains(kategorie);
		alleArtikel.removeIf(pred);

		return alleArtikel;
	}

	public Set<String> getAlleKategorien() {
		Set<String> kat = new HashSet<>();
//		Consumer<Artikel> con = new Consumer<Artikel>() {
//			@Override
//			public void accept(Artikel t) {
//				kat.addAll(t.getKategorien());
//			}
//		};
		Consumer<Artikel> con = artikel -> kat.addAll(artikel.getKategorien());
		this.getSortiment().getAlleArtikel().forEach(con);
		return kat;
	}

	public List<Artikel> getAlleArtikel() {
		return this.getSortiment().getAlleArtikel();
	}

	public void addItemToCart(String productName, Integer anzahl) {
//		System.out.println(anzahl + " " + productName + " wurde dem Warenkorb hinzugefuegt");
		//Pre Java 8
//		Artikel result = null;
//		for (Artikel a : this.getSortiment().getAlleArtikel()) {
//			if (a.getArtName().equals(productName)) {
//				result = a;				
//			}
//		}
//		if(result != null && anzahl > 0) {
//			this.getWarenkorb().fuegeArtikelEin(result, anzahl);
//		}
		//Ab Java 8
		Optional<Artikel> opt = this.getSortiment().getAlleArtikel().stream().filter(a->a.getArtName().equals(productName)).findFirst();
		if(opt.isPresent()&&anzahl>0)
			this.getWarenkorb().fuegeArtikelEin(opt.get(), anzahl);
	}

//	public static void main(String[] args) {
//		MainModel m = new MainModel();
//		m.getSortiment().getAlleArtikel().forEach(a->System.out.println(a.getArtName() + " " + a.getKategorien()));
//	}
}
