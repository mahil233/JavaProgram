package day5;

public class TestingLoops {

	public static void main(String[] args) {
		
	/*	
		//Example1-if want to print 5 only
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				System.out.println(i);
			}
		}
   
		//Example2- if want to print only 2,5,10
				for(int i=1;i<=10;i++)
				{
					if(i==2||i==5||i==10)
					{
						System.out.println(i);
					}
				}
		
	
		
		//Example3- want to print other than 2,5 & 10
		for(int i=1;i<=10;i++)
		{
			if(i!=2 && i!=5 && i!=10)
			{
				System.out.println(i);
			}
		}

	*/
		
		
		//Example-4
		boolean flag=true;
		
		if(flag)
		{
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
			}
		}
		
		else
		{
			for(int i=10;i>=1;i--)
			{
				System.out.println(i);
			}
		}
	}

}
