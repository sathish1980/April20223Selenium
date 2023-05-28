package sample;

public class Arrays {

	int[] age = {25,34,46,22};
	
	public void myage()
	{
		System.out.println(age.length);
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
			if(age[i]==22)
			{
				System.out.println("Yes");
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays a = new Arrays();
		a.myage();
	}

}
