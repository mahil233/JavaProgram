package day14;

public class FinallyBlock2 {

	public static void main(String[] args) {
		
		//Scanario 1-Exception does not occured catch block not  ignored--->Finally block will execute
		
				System.out.println("program is started");
				System.out.println("program is in progress");


		        String s="welcome";
				 
				try
				{
				System.out.println(s.length()); //7
				}
				
				catch(Exception e) //catch block will not executed if try block will not thrown any exception
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
