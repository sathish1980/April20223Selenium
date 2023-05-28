package sample;

public class paulsupermarket extends supermarketDiscount{
	
	public void supermarketlocated()
	{
		System.out.println("chennai");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		paulsupermarket p = new paulsupermarket();
		p.supermarketlocated();
		p.discountBranch("t.nagar");
	}

}
