package day14;

public class FinallyBlock1 {

	public static void main(String[] args) {
		
		//Scanario 1-Exception occured catch block handled--->Finally block will execute
		
		System.out.println("program is started");
		System.out.println("program is in progress");


        String s=null;
		 
		try
		{
		System.out.println(s.length()); //it throw null pointer exception
		}
		
		catch(Exception e) //this catch block handle all kind of exceptions because Exception is parent of  all type of exception classes.
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
