package sample;

public class accessmodifier {
	
	public int age =50;
	
	 public void duplicate(String name)
	{
		if (name=="Sathish")
		{
			System.out.println("You have given duplicate name");
		}
		else
		{
			System.out.println("You have enter the name is : "+name);
			System.out.println("Your age is : "+age);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		accessmodifier a = new accessmodifier();
		a.duplicate("Sathish kumar");
	}

}
