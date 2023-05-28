package sample;

public class SuperMarketBase  extends supermarketDiscount
{
	
	int estyear = 1990;
	
	public void name()
	{
		System.out.println("SATZ Super Market");
		System.out.println(estyear);
	}
	
	public void Floors()
	{
		System.out.println("It has 3 Floors");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMarketBase s = new SuperMarketBase();
		s.name();
		s.Floors();
		//supermarketDiscount s1 = new supermarketDiscount();
		//s1.discountBranch("Annanagar");
		s.discountBranch("Annanagar");
	}

}
