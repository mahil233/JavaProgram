package day14;

public class FinallyBlock3 {

	public static void main(String[] args) {
		
		//Scanario 3-Exception occured catch block not handled--->Finally block will execute
		
		System.out.println("program is started");
		System.out.println("program is in progress");


        String s=null;
		 
		try
		{
		System.out.println(s.length()); //null pointer exception 
		}
		
		catch(ArithmeticException e) //catch block will not handle the exception because we mention arithmetic but statement give null pointer, then code will be terminated
		{
			System.out.println("Exception occured...handled");
		}
		
		finally
		{
			System.out.println("Entered into finally block.....");
		}
		
		System.out.println("Program is completed");
		System.out.println("program is exited");


	}

}
