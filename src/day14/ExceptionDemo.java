package day14;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {


		System.out.println("program is started");
		System.out.println("program is in progress");
		
		//Example 1- I am expecting number from user
		Scanner sc=new Scanner(System.in); //Scanner is built in class in which some methods r used through which get the input from user
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println(100/num);  //if num is 0 then it give arithmetic exception 
		System.out.println("program is completed");
		System.out.println("program is exit");
		
	
		

	}

}
