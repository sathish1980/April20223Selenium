package Package2;

public class Stringsconcept {
	
	String[] fruits= {"apple","Orange","Mango"};
	
	String name1 = " Sathish kumar .R ";
	String name2 = "sathish kumar .R";
	
	public void stringconceptHandling()
	{
		System.out.println(name1.charAt(12));
		System.out.println(name1.indexOf("ath"));
		System.out.println(name1.lastIndexOf('a'));
		System.out.println(name1.length());
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.equals(name2));
		System.out.println(name1.equalsIgnoreCase(name2));
		System.out.println(name1+name2);
		System.out.println(name1.concat(name2));
		System.out.println(name1.contains("thiz"));
		System.out.println(name1.startsWith("Sat"));
		System.out.println(name1.endsWith(".R"));
		System.out.println(name1.isEmpty());
		System.out.println(name1.replace(" ", ""));
		System.out.println(name1);
		String[] aftersplit = name1.split("a");
		for(String eachval : aftersplit)
		{
			System.out.println(eachval);
		}
		
		System.out.println(name1.substring(1,10));
		System.out.println(name1.substring(10));
		System.out.println(name1.toCharArray());
		char[] afterchar = name1.toCharArray();
		for(char eachval : afterchar)
		{
			System.out.println(eachval);
		}
		System.out.println(name1.toLowerCase());
		System.out.println(name1.toUpperCase());
		System.out.println(name1.trim());
		

	}
	
	public void startdwithvalidation(String[] value)
	{
		for(int i=0;i<value.length;i++)
		{
			System.out.print( value[i].startsWith("sat"));
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stringsconcept s = new Stringsconcept();
		s.stringconceptHandling();
	}

}
