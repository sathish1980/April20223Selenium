package Package2;

public class abstractexecution extends Abrstractclass{

	public void bonus()
	{
		System.out.println("You are eligible for bonus");
	}
	
	public void loanarrears() {
		// TODO Auto-generated method stub
		int amount =10000;
		int balance = 4000;
		int arrears =amount-balance;
		System.out.println("loan arrears is :RS. " +arrears);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Abrstractclass a = new abstractexecution();
		//a.bonus();
		a.loanarrears();
		abstractexecution a1 = new abstractexecution();
		a1.bonus();
	}

	
	

}
