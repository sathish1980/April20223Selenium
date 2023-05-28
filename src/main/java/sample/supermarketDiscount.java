package sample;

public class supermarketDiscount 
{

	double discount =0.2;
	public void discountBranch(String branchName)
	{
		if(branchName.equalsIgnoreCase("Annanagar"))
		{
			System.out.println("You will have "+discount+" of  discount");
		}
		else
		{
			System.out.println("You dont have a discount");
			
		}
	}
	
}
