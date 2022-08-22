package model.crud;

import java.io.IOException;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

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
		
		String json = this.readAsString("./DB/artikel-liste.json");

		Type collectionType = new TypeToken<ArrayList<Artikel>>(){}.getType();
		ArrayList<Artikel> jsonArtikelliste = new Gson().fromJson(json, collectionType);
		artikel_objekte.addAll(jsonArtikelliste);
		artikel_objekte.addAll(this.getJsonArtikelWithJackson());
		
		return artikel_objekte;
	}
	
	public List<Artikel> getJsonArtikelWithJackson(){
		ArrayList<Artikel> artikelliste = new ArrayList<>();
		//Jackson
		Path p = Paths.get("./DB/sortiment.json");
		try {
			String json = new String(Files.readAllBytes(p));
			System.out.println(json);
			
			ObjectMapper objectMapper = new ObjectMapper();
			CollectionType listType = objectMapper.getTypeFactory().constructCollectionType(List.class, LinkedHashMap.class);
			List<LinkedHashMap<Object, Object>> asList = objectMapper.readValue(json, listType);
			asList.forEach(map->{ 
				int id = Integer.parseInt(map.get("id").toString());
				String name = map.get("name").toString();
				String beschreibung = map.get("beschreibung").toString();
				double preis = Double.parseDouble(map.get("preis").toString());
				artikelliste.add(new Artikel(id, name, beschreibung, preis, 19));
			} );			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return artikelliste;
	}
	
	
}
