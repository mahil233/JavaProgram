package day4;

public class IfCondition 
{

	public static void main(String[] args) 
	{
		
		int person_age=20;
		
		if(person_age>=18) //if condition is satisfied then below statement is executed
		//Scenario-1 curly braces are optional in if block for single statement
			System.out.println("Eligible for vote");
		
		//scenario-2 curly braces are mandatory in if block for multiple statements or multiple blocks
		if(person_age>=18)
		{
			System.out.println("Checking eligibility of vote..");
			System.out.println("Eligible for vote");
		}
	}

}
