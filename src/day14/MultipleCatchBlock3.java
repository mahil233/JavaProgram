package day14;

public class MultipleCatchBlock3 {

	public static void main(String[] args) {


        String s=null;
		
        //Scenario- if catch block handle all kind of exceptions
        
		try
		{
		System.out.println(s.length()); //it throw null pointer exception
		}
		
		catch(Exception e) //this catch block handle all kind of exceptions because Exception is parent of  all type of exception classes.
		{
			System.out.println("Exception thrown");
		}
		
		System.out.println("Program is completed");
		System.out.println("program is exited");

	}

}
