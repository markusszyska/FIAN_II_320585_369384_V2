package model.crud;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

import javax.swing.ImageIcon;
import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.type.CollectionType;

import model.crud.utility.ImageUtility;
import model.data.Artikel;

public class FileHandler implements IDBConnection {
	public List<String> read(String file) {
		List<String> content = new ArrayList<>();
		try {
			Path p = Paths.get(file);
			if (Files.exists(p)) {
				content = Files.readAllLines(p);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return content;
	}

	public String readAsString(String file) {
		String content = "";
		try {
			Path p = Paths.get(file);
			if (Files.exists(p)) {
				content = new String(Files.readAllBytes(p));
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}

		return content;
	}

	@Override
	public ArrayList<Artikel> getAllArtikel() {
		ArrayList<Artikel> artikel_objekte = new ArrayList<>();

		List<String> artikel_liste = read("./DB/artikel-liste.csv");
		for (int i = 1; i < artikel_liste.size(); i++) {
			String[] parts = artikel_liste.get(i).split(";");
			ImageIcon icon = ImageUtility.decodeImage(ImageUtility.encodeImage("schadel.png"));
			if (parts.length > 0) {
				Set<String> kat = new HashSet<>();
				kat.add(parts[5]);
				artikel_objekte.add(new Artikel(Integer.parseInt(parts[0]), parts[1], parts[4],
						Double.parseDouble(parts[2].replace(',', '.')), icon, kat,
						Integer.parseInt(parts[3])));
			}
		}

//		String json = this.readAsString("./DB/artikel-liste.json");
//		Type collectionType = new TypeToken<ArrayList<Artikel>>(){}.getType();
//		ArrayList<Artikel> jsonArtikelliste = new Gson().fromJson(json, collectionType);
//		artikel_objekte.addAll(jsonArtikelliste);

		artikel_objekte.addAll(this.getJsonArtikelWithJackson());
		artikel_objekte.addAll(this.getArtikelFromXml());
		return artikel_objekte;
	}

	public List<Artikel> getJsonArtikelWithJackson() {
		ArrayList<Artikel> artikelliste = new ArrayList<>();
		// Jackson
		Path p = Paths.get("./DB/sortiment.json");
		try {
			String json = new String(Files.readAllBytes(p));
			ObjectMapper objectMapper = new ObjectMapper();
			CollectionType listType = objectMapper.getTypeFactory().constructCollectionType(List.class,
					LinkedHashMap.class);
			List<LinkedHashMap<Object, Object>> asList = objectMapper.readValue(json, listType);
			asList.forEach(map -> {
				int id = Integer.parseInt(map.get("id").toString());
				String name = map.get("name").toString();
				ImageIcon icon = ImageUtility.decodeImage(map.get("icon").toString());
				String beschreibung = map.get("beschreibung").toString();
				double preis = Double.parseDouble(map.get("preis").toString());
				Set<String> kat = new HashSet<>();
				kat.add(map.get("kategorie").toString());
				artikelliste.add(new Artikel(id, name, beschreibung, preis, icon, kat, 19));
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		return artikelliste;
	}

	public List<Artikel> getArtikelFromXml() {
		ArrayList<Artikel> artikelliste = new ArrayList<>();
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newDefaultInstance();
		try {
			dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
			DocumentBuilder db = dbf.newDocumentBuilder();
			Document doc = db.parse(new FileInputStream("./DB/artikel-liste.xml"));
			doc.getDocumentElement().normalize();
			NodeList list = doc.getElementsByTagName("artikel");
			for (int i = 0; i < list.getLength(); i++) {
				Node node = list.item(i);
				if (node.getNodeType() == Node.ELEMENT_NODE) {
					Element element = (Element) node;
					String id = element.getAttribute("id");
					String name = element.getElementsByTagName("name").item(0).getTextContent();
					String iconBase64 = element.getElementsByTagName("icon").item(0).getTextContent();
					ImageIcon icon = ImageUtility.decodeImage(iconBase64);
					String beschreibung = element.getElementsByTagName("beschreibung").item(0).getTextContent();
					String preis = element.getElementsByTagName("preis").item(0).getTextContent();
					Set<String> kat = new HashSet<>();
					kat.add(element.getElementsByTagName("kategorie").item(0).getTextContent());
					artikelliste.add(new Artikel(Integer.parseInt(id), name, beschreibung, Double.parseDouble(preis),
							icon, kat, 19));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return artikelliste;
	}

}
