package day14;

import java.util.Scanner;

public class ExceptionDemo2 {

	public static void main(String[] args) {


		int a[]=new int[5]; //0..4
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		System.out.println("Enter position(0-4):"); //if give value 5 then it give exception Array Index Out Of Bound Exception
		int pos=sc.nextInt();
		
		a[pos]=num; //Array Index Out Of Bound Exception
		System.out.println(a[pos]);
		System.out.println("program is completed");
		System.out.println("program is exit");
		
		

	}

}
