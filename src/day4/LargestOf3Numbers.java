package day4;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		
		int a=300,b=200, c=100;
		
		if(a>b && a>c)
		{
			System.out.println("a is largest number:"+a);
		}
		
		else if(b>a && b>c)
		{
			System.out.println("b is largest number:"+b);
		}
		
		else
		{
			System.out.println("c is largest number:"+c);
		}

	}

}