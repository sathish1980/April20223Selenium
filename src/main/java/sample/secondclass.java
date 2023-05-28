package sample;

public class secondclass {
	
	static String name = "sathish" ;
	int sa = 3;
	//static String name = "sathish" ;
	
	public void mul(int a, int b,int f , int g)
	{
		int d = add(f,g);
		int m =a*b;
		int e=d*15;
		System.out.println(e);
	}
	
	public int add(int a, int b)
	{
		int c= a+b;
		System.out.println(c);
		return c;
		
	}
	
	public void details(String names)
	{
		int sa =5;
		System.out.println(names);
		System.out.println(name);
	}

	public static void main(String[] a) {
		// TODO Auto-generated method stub
		secondclass s = new secondclass();
		s.mul(5, 7, 11,10);
		s.details("");
	}

}
