package model.crud;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import model.data.Artikel;

public class FileHandler implements IDBConnection {
	public List<String> read(String file) {
		List<String> content = new ArrayList<String>();
		try {
			Path p = Paths.get(file);
			if(Files.exists(p)) {
				content = Files.readAllLines(p);
			}
		} catch(IOException ex) {
			ex.printStackTrace();
		}
		
		return content;
	}
	
	public String readAsString(String file) {
		String content = "";
		try {
			Path p = Paths.get(file);
			if(Files.exists(p)) {
				content = new String(Files.readAllBytes(p));
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		
		return content;
	}

	@Override
	public ArrayList<Artikel> getAllArtikel() {
		ArrayList<Artikel> artikel_objekte = new ArrayList<Artikel>();
		
		List<String> artikel_liste = read("./DB/artikel-liste.csv");
		for(int i = 1; i < artikel_liste.size(); i++) {
			String[] parts = artikel_liste.get(i).split(";");
			artikel_objekte.add(
				new Artikel(
					Integer.parseInt(parts[0]),
					parts[1],
					parts[4],
					Double.parseDouble(parts[2].replace(',', '.')),
					Integer.parseInt(parts[3])
				)
			);
		}
		
		return artikel_objekte;
	}
	
	
}
