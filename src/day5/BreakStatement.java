package day5;

public class BreakStatement {

	public static void main(String[] args) {
		
		for(int i=1;i<=5;i++)
		{
			if(i==3)
			{
				break;  //when i is equal to 3 then break will come out from the entire for block
			}
			System.out.println(i); //1 2
		}

	}

}
