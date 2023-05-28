package CollectionConcepts;

import java.util.ArrayList;
import java.util.Iterator;

public class ListConcepts {
	
	public void listconceptsimplementation()
	{
		ArrayList<String> AL1 = new ArrayList<>();
		AL1.add("Python");
		AL1.add("Java");
		AL1.add("C#");
		ArrayList<String> AL = new ArrayList<>();
		AL.add("Sathish");
		AL.add("Sathish");
		AL.add("Sathish");
		AL.add(1, "Kumar");
		AL.add("B.Tech");
		AL.add("Besant");
		AL.addAll(AL1);
		// Update the value
		AL.set(0, "SATHISH");
		//remove
		// AL.remove("Besant");
		// AL.removeAll(AL1);
		
		System.out.println(AL.isEmpty());
		
		//retreive tha value from the ArrayList
		System.out.println("SecondIndex Value : "+AL.get(1));
		Iterator it = AL.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//or
		
		System.out.println("**********Other WAY of GET*******");
		for(String eachvalue : AL)
		{
			System.out.println(eachvalue);
		}
		
		System.out.println("Size Value : "+AL.size());
		Object newList =AL.clone();
		AL.clear();
		System.out.println(AL);
		System.out.println(newList);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListConcepts L = new ListConcepts();
		L.listconceptsimplementation();
	}

}
