package sample;

public class Loops {

	
	public void forloop()
	{
		for(int i=0;i!=10;i++)
		{
			System.out.println(i);

		}
	}
	
	public void startprogram(int totalRow)
	{
		for(int j=0;j<totalRow;j++)
		{
			for(int i=0;i<j+1;i++)
			{
				System.out.print("*");
				
			}
			System.out.println("sathis");
		}
	}
	
	public void whileloop()
	{
		int i=0;
		while(i<10)
		{
			i=i+1;
			if(i==5)
			{
				continue;
			}
			System.out.println(i);

		}
	}
	
	
	public void dowhile(int i)
	{
		do
		{
			System.out.println(i);
			i=i+1;
		}
		while(i<10);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops l = new Loops();
		//l.forloop();
		//l.startprogram(10);
		l.dowhile(11);
	}

}
