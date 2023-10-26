package dictionary_MAP;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class dictionaryMap {
	private Map<String, String> dictionary = new TreeMap<String, String>();
	
	public dictionaryMap() {
	}
	
	public String addNewWord(String word, String mean) {
		return this.dictionary.put(word, mean);
	}
	
	public String deleteWord(String word) {
		return this.dictionary.remove(word);
	}
	
	public String translateToVietNamese(String word) {
		String mean = dictionary.get(word);
		return mean;
	}
	
	public void printAllWord() {
		Set<String> allWords = this.dictionary.keySet();
		System.out.println("Dictionary:");
		System.out.println(Arrays.toString(allWords.toArray()));
	}
	
	public int getNumberWords()	{
		return this.dictionary.size();
	}
	
	public void cleanDictionary() {
		dictionary.clear();
	}
}
