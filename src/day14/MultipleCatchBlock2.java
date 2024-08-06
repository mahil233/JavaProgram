package day14;

public class MultipleCatchBlock2 {

	public static void main(String[] args) {


		String s=null;
		
		//if we don't know the exception type then we can write multiple catch block
		//every catch block specify different type of exception
		
		try
		{
		System.out.println(s.length()); //it throw null pointer exception
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic exception thrown");
		}
		
		catch(NumberFormatException e)
		{
			System.out.println("Number format exception thrown");
		}
		
		catch(NullPointerException e)
		{
			System.out.println("Null pointer exception thrown");
		}

		System.out.println("program is completed");
		System.out.println("program is exit");
		

	}

}
