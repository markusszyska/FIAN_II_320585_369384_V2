package model;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Predicate;

import model.crud.DataLoader;
import model.data.Artikel;
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

	public List<Artikel> filterSortimentKategorie(String kategorie) {
		List<Artikel> alleArtikel = new ArrayList<>(this.getSortiment().getAlleArtikel());
		
		Predicate<Artikel> pred = artikel -> !artikel.getKategorien().contains(kategorie);					
		alleArtikel.removeIf(pred);
		
		return alleArtikel;
	}
	
	public Set<String> getAlleKategorien(){
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

//	public static void main(String[] args) {
//		MainModel m = new MainModel();
//		m.getSortiment().getAlleArtikel().forEach(a->System.out.println(a.getArtName() + " " + a.getKategorien()));
//	}
}
