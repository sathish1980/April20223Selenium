package Package2;

public class MethodOverriding extends MethodOverloading {

	public void interestrate()
	{
		System.out.println("5.0");
		super.interestrate();
		
		System.out.println(age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding M = new MethodOverriding();
		M.interestrate(); //Method call
		
		
		
	}

}
