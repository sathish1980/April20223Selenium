package sample;

import java.io.IOException;

public class Exceptionhandling {
	
	final int age =30;
	public void div(int a , int b) throws Throwable
	{
		try
		{
		double c = a/b;
		System.out.println(c);
		//age =age+10;
		finalize();
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is airthmetic exception: "+e);
		}
		catch(Exception e)
		{
			System.out.println("This is normal exception: "+e);
		}
		finally
		{
			System.out.println("finally");
		}
	}
	
	public void sum(int a , int b)
	{
		int c= a+b;
		System.out.println(c);
		//throw new ArithmeticException("hi this is sathish") ;
		//throw new IOException("");
		//System.out.println();
	}
	
	public final void indexoutofbound() throws ArithmeticException,ArrayIndexOutOfBoundsException,IOException
	{
		int[] age= {1,2,3,5};
		System.out.println(age[3]);
	}
	
	public static void main(String[] args) throws Throwable
	{
		Exceptionhandling e = new Exceptionhandling();
		e.div(10, 0);
		e.indexoutofbound();
		e.sum(5, 6);
	}

}
