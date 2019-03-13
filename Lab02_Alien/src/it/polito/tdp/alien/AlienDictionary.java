package it.polito.tdp.alien;
import java.util.*;

public class AlienDictionary {
	
	List<Word> dizionario = new LinkedList<Word>();
	Map<String, Word> d = new TreeMap<String, Word>();
	
	public void addWord(String alienWord, String translation) {
		Word wtemp = new Word(alienWord.toLowerCase(), translation.toLowerCase());
		if(d.containsKey(alienWord.toLowerCase())) {
			dizionario.remove(d.get(alienWord.toLowerCase()));
			dizionario.add(wtemp);
			d.remove(alienWord.toLowerCase());
			d.put(alienWord.toLowerCase(), wtemp);
		}
		else {
			dizionario.add(wtemp);
			d.put(alienWord.toLowerCase(), wtemp);
		}
	}
	
	public String translateWord(String alienWord) {
		if(d.containsKey(alienWord.toLowerCase())) {
			return d.get(alienWord.toLowerCase()).getTransaltion();
		}
		else
			return null;
		
		
	}

}
