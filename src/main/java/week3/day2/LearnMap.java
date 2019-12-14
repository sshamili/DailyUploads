package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LearnMap {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("78.0.1", "Chrome");
		map.put("71.0.0", "Firefox");
		map.put("78.0.2", "Chrome");
		map.put("11.0.0", "IE");
		System.out.println("Size of the map "+map.size());
		System.out.println("Keys in map "+map.keySet());
		System.out.println("Values in map "+map.values());
		System.out.println(map.containsKey("11.0"));
		System.out.println(map.get("11.0.0"));
		System.out.println(map);
		for(Entry<String, String> eachEntry :map.entrySet()) {
			System.out.println
			(eachEntry.getKey()+"->"+eachEntry.getValue());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
