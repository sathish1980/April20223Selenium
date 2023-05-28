package Package2;

public class MethodOverloading {
	
	final int age =50;
	
	public void interestrate()
	{
		System.out.println("2.3");
	}
	public void add(int a, int b)
	{
		System.out.println("method with 2 parameter");
		System.out.println(a+b);
	}
	
	public void add(int a, int b,int c)
	{
		System.out.println("method with 3 parameter");
		System.out.println(a+b+c);
	}
	
	public void add(double a, double b)
	{
		System.out.println("method with 2 parameter with different datatype");
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloading M = new MethodOverloading();
		M.add(4.6, 5.9);
	}

}
