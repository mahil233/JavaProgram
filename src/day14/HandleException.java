package day14;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {


		System.out.println("program is started");
		System.out.println("program is in progress");
		
		//Example 1- I am expecting number from user
		Scanner sc=new Scanner(System.in); //Scanner is built in class in which some methods r used through which get the input from user
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		
		//1 Those statement throw exception, that should be keep inside try block.
		//2 What type of exception it will throw, name of exception throw in catch block 
		
		try 
		{
		System.out.println(100/num);  //if num is 0 then it give arithmetic exception 
		}
		
		catch(ArithmeticException e) //e is variable of arithmetic exception
		{
			e.printStackTrace(); //this method give u information about exception name
			System.out.println(e.getMessage());//this method give u exception message
			System.out.println("You have entered invalid input."); //this message is given to user
		}
		
		
		System.out.println("program is completed");
		System.out.println("program is exit");
}
}
