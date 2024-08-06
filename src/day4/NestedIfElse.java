package day4;

public class NestedIfElse {

	public static void main(String[] args) {
		
		//if outer if condition is true it will enter into the block & inner if condition is false then else condition will executed
		//if outer if condition is false then it will not enter into the block & outer else condition is executed
		if(false)
		{
			if(false)
			{
				System.out.println("123");
			}
			else
			{
				System.out.println("abc");
			
			}
		}
		
		else if(true){
			if(true)
			{
			System.out.println("xyz"); //xyz
			}
		}
		
		
		

	}

}
