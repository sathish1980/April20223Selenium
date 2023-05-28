package sample;

public class SupermarketStoreType extends SuperMarketBase{
	
	
	public void StoretypeandFloor(String storetype)
	{
		
		if (storetype.equalsIgnoreCase("groceries"))
		{
			System.out.println("Its avaialbe in ground floor");
		}
		else if(storetype.equalsIgnoreCase("pharmacy"))
		{
			System.out.println("Its avaialbe in thrird floor");
			
		}
		else if(storetype.equalsIgnoreCase("toys"))
		{
			System.out.println("Its avaialbe in second floor");
		
		}
		else
		{
			System.out.println("It available in first floor");
		}
	}
	
	public static void main(String[] args)
	{
		SupermarketStoreType s = new SupermarketStoreType();
		s.name();
		s.Floors();
		//supermarketDiscount s1 = new supermarketDiscount();
		//s1.discountBranch("Annanagar");
		s.discountBranch("Annanagar");
		s.StoretypeandFloor("toys");
	}

}
