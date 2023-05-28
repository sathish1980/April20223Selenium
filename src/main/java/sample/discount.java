package sample;

public class discount {
	
	public void discountcal(int amount, double dicpercentage)
	{
		double discountamount = amount*dicpercentage;
		System.out.println(discountamount);
		double actaulamount = amount-discountamount;
		System.out.println(actaulamount);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		discount d = new discount();
		d.discountcal(1000, 0.5);
	}

}
