package day4;

public class PrintWeekNames {

	public static void main(String[] args) {
		//if non of condition is satisfied then else block will executed
		int weekno=1;
		
		if(weekno==1)
		{
			System.out.println("Sunday");
		}
		
		else if(weekno==2)
		{
			System.out.println("Monday");
		}
		
		else if(weekno==3)
		{
			System.out.println("Tuesday");
		}

		else if(weekno==4)
		{
			System.out.println("Wednesday");
		}

		else if(weekno==5)
		{
			System.out.println("Thrusday");
		}

		else if(weekno==6)
		{
			System.out.println("Friday");
		}

		else if(weekno==7)
		{
			System.out.println("Saturday");
		}

		else
		{
			System.out.println("Invalid week number");
		}

	}

}
