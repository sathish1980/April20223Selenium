package Package2;

public class Interfaceinheritance implements Interface1,Interface2{
	@Override
	public void discount() {
		// TODO Auto-generated method stub
		System.out.println("discount");
	}

	@Override
	public void tax() {
		// TODO Auto-generated method stub
		System.out.println("tax");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interface2 I = new Interfaceinheritance();
		I.discount();
		//I.tax();
	}



}
