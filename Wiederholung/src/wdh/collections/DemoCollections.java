package wdh.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Vector;

public class DemoCollections {
	public static void main(String[] args) {
		//Listen
		//ArrayList arbeitet intern mit einem Array
		List<Integer> arrayList = new ArrayList<>();
		//LinkedList ist eine doppelt verkettete Liste(Ein Objekt kennt den Vorgaenger und den Nachfolger)
		List<Integer> linkedList = new LinkedList<>();
		//Vector: Synchonisierte ArrayList (nicht mehr benutzen)
		List<Integer> vector = new Vector<>();
				
		//Eine Warteschlange
		Queue<Integer> queue = new LinkedList<>();
		queue.poll();//Gibt den Anfang der Warteschlange zurueck und entfernt das Objekt
		
		//Eine Warteschlange mit zwei Enden
		Deque<Integer> arrayDeque = new ArrayDeque<>();
		arrayDeque.poll();
		arrayDeque.pollLast();
				
		/*
		 * Sets sind mathematische Mengen (erlauben keine Doppelten)
		 */
		Set<Integer> hashSet = new HashSet<>();
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		Set<Integer> treeSet = new TreeSet<>(); //sortiert
		
		/*
		 * Schluessel Wertpaare
		 */
		Map<Kunde, Fahrzeug> hashMap = new HashMap<>();
		Map<String, Integer> linkedHashMap = new LinkedHashMap<>();
		Map<String, Integer> treeMap = new TreeMap<>(); //sortiert
				
		Kunde k1 = new Kunde(1);
		Kunde k2 = new Kunde(2);
		hashMap.put(k1, new Fahrzeug("B-1001"));
		hashMap.put(k2, new Fahrzeug("B-2002"));
		
		System.out.println(hashMap.get(k1).kennzeichen);
		System.out.println(hashMap.get(k2).kennzeichen);
		
		
		List<Map<Kunde, Fahrzeug>> list = new ArrayList<>();
		list.add(hashMap);
		list.add(new HashMap<>());
	}
}

class Kunde {
	public int id;
	public Kunde(int id) {
		this.id = id;
	}
}
class Fahrzeug{
	public String kennzeichen;
	public Fahrzeug(String kennzeichen) {
		this.kennzeichen = kennzeichen;
	}
}
