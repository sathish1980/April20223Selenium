package CollectionConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapInterface {
	
	// 1 .HashMap
	// 2 .Linked HashMap
	// 3 .TreeMap
	
	public void Mapinterfaceimplementation()
	{
		// HashMap<Integer,String> HP = new HashMap<>();
		// LinkedHashMap<Integer,String> HP = new LinkedHashMap<>();
		TreeMap<Integer,String> HP = new TreeMap<>();
		HP.put(1, "Sathish");
		HP.put(3, "kumar");
		HP.put(4, "sathish");
		HP.put(2, "btech");
		HP.put(5, "tutor");
		HP.put(5, "java");
		HP.put(6, " ");
		
		System.out.println(HP.get(4));
		System.out.println("!!!!!!Get KEY!!!!!!!");
		System.out.println(HP.keySet());
		System.out.println("!!!!!!Get VALUE!!!!!!!");
		System.out.println(HP.values());
		System.out.println("!!!!!!Get KEY and Value!!!!!!!");
		System.out.println(HP.entrySet());
		
		for(Map.Entry ma:HP.entrySet())
		{
			System.out.println(ma.getKey() +" " + ma.getValue());
		}
		
		HP.isEmpty();
		HP.clone();
		HP.clear();
		HP.size();
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MapInterface M = new MapInterface();
		M.Mapinterfaceimplementation();
	}

}
