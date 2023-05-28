package sample;

public class condition {

	public void conditionimplementation(String lightColor,String vehicletype,boolean occupied)
	{
		if(lightColor == "Red")
		{
			System.out.println("You have to stop the vehicle");
			if(vehicletype == "Ambulance")
			{
				if(occupied == true)
				{
				System.out.println("Please give a way for me");
				System.out.println("I am an "+vehicletype);
				}
				else
				{
					System.out.println("Even if you are ambulance . you have to wait since there are no patients are inside");
				}
			}
		}
		else if(lightColor == "Green")
		{
			System.out.println("You are good to go");
		}
		else if(lightColor == "Yellow")
		{
			System.out.println("You are good to start the vehicle but wait for green signal");
		}
		else
		{
			System.out.println("This is not a valid color");
		}
	}
	
	
	public void conditionimplementationwithlogic(String lightColor,String vehicletype,boolean occupied)
	{
		if(lightColor == "Red") 
		{
			if (!((vehicletype == "Ambulance")) && (occupied == true))
			{
				System.out.println("Please give a way for me");
				System.out.println("I am an "+vehicletype);
			}
			else
			{
				if((vehicletype == "Ambulance"))
				{
				System.out.println("Even if you are ambulance . you have to wait since there are no patients are inside");
				}
				else
				{
					System.out.println("You have to stop the vehicle");
				}
			}
		}
		else if(lightColor == "Green")
		{
			System.out.println("You are good to go");
		}
		else if(lightColor == "Yellow")
		{
			System.out.println("You are good to start the vehicle but wait for green signal");
		}
		else
		{
			System.out.println("This is not a valid color");
		}
	}
	
	public void switchconecpt(String transportMode)
	{
		switch(transportMode)
		{
		case "R":
			System.out.println("You hav choose Road Mode");
			System.out.println("Please follow the Traffic rules");
			break;
		case "T":
			System.out.println("You hav choose Rail Mode");
			break;
		case "A":
			System.out.println("You hav choose Air Mode");
			break;
		case "S":
			System.out.println("You hav choose Sea Mode");
			break;
		default:
			System.out.println("Please provide the valid Transport mode");
			break;
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		condition og = new condition();
		og.conditionimplementationwithlogic("orange","Ambulance",true);
		og.switchconecpt("a");
	}

}
