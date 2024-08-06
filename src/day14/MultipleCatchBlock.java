package day14;

import java.util.Scanner;

public class MultipleCatchBlock {

	public static void main(String[] args) {

		System.out.println("program is started");
		System.out.println("program is in progress");
		
		//Example 1- I am expecting number from user
		Scanner sc=new Scanner(System.in); //Scanner is built in class in which some methods r used through which get the input from user
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		try 
		{
		//if below statement throw arithmetic exception then first catch block handle, rest of catch block will skip
			
		System.out.println(100/num);  //if num is 0 then it give arithmetic exception 
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

		

	}

}
