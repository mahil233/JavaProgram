package day12;

class Test
{
	//1 if create variable with final keyword, we can't change value of variable through any object. that means value of variable is fixed
	final int x=100; //this variable value is constant value means we can't change value
}


public class FinalKeywordDemo1 {

	public static void main(String[] args) 
	{
	Test t=new Test();
	
	//t.x=200;  //incorrect because x is final variable
	
	System.out.println(t.x); //200
		

	}

}
