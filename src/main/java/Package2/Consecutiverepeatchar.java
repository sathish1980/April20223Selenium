package Package2;

public class Consecutiverepeatchar {
	
	public void validation(String name)
	{
		char[] newchar = name.toCharArray(); // converted in to character array
		int count=1; //intialized
		for(int i=0;i< newchar.length;i++)
		{
			if( (i!=newchar.length-1))
			{
				if(newchar[i]==newchar[i+1])
				{
					count=count+1;
				}
				else if (count>1)
				{
					System.out.println(newchar[i]+":"+count);
					count=1;
				}
			}
			else if (count>1)
			{
				System.out.println(newchar[i]+":"+count);
				count=1;
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consecutiverepeatchar c = new Consecutiverepeatchar();
		c.validation("saatthishhh kumarr");
	}

}
