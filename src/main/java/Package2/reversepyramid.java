package Package2;

public class reversepyramid {
	
	public void reversepyramidvalue()
	{
		for(int i=0;i<=5;i++)
		{
			for(int j=i;j<5;j++)
			{
				System.out.print("*");
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reversepyramid r = new reversepyramid();
		r.reversepyramidvalue();
	}

}
