package sample;

public class samecpackage {
	
	accessmodifier a = new accessmodifier();
	
	public void accessanotherclassvariable()
	{
		System.out.println(a.age);
		a.duplicate("kumar");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		samecpackage s = new samecpackage();
		s.accessanotherclassvariable();
	}

}
