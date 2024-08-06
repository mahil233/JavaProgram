package day5;

public class ContinueStatement {

	public static void main(String[] args) {
	/*	
		//Example1-
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i); //1 2 3 4 6 7 8 9 10
		}
		
		//Example2-
		for(int i=1;i<=10;i++)
		{
			if(i==3  && i==5) //this condition is not match because at one time i is not equal to 3 & 5
			{
				continue;
			}
			System.out.println(i); //1 2 3 4 5 6 7 8 9 10
		}
   */
		
		
		//Example3-
		for(int i=1;i<=10;i++)
		{
			if(i==3  || i==5) //this condition is true. instead of 3 & 5 all number will be printed
			{
				continue;
			}
			System.out.println(i); //1 2  4  6 7 8 9 10
		}
	}

}
