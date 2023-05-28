package CollectionConcepts;

import java.util.*;


public class SetConcept {
	
	// 1 .Hashset
	// 2. Linked Hashset
	// 3. Tree Set
	
	public void setimplementation()
	{
		//HashSet<String> AL1 = new HashSet<String>();
		//LinkedHashSet<String> AL1 = new LinkedHashSet<String>();
		TreeSet<String> AL1 = new TreeSet<String>();
		AL1.add("sathish");
		AL1.add("Sathish");
		AL1.add("kumar");
		AL1.add("r");
		AL1.add("b.tech");
		// AL1.remove("kumar");
		
		for (String eachvalue : AL1)
		{
			System.out.println(eachvalue);
		}
		
		//or
		
		Iterator it = AL1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		System.out.println(AL1.isEmpty());
		//HashSet<String> AL2 = (HashSet<String>) AL1.clone();
		TreeSet<String> AL2 = (TreeSet<String>) AL1.clone();
		AL1.clear();
		System.out.println(AL1);
		for (String eachvalue : AL2)
		{
			System.out.println(eachvalue);
		}
		System.out.println(AL2.size());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetConcept s = new SetConcept();
		s.setimplementation();
	}

}
