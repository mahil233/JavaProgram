package day12;

final class Test1
{
	
	//1 when u make the methods final u can't override the particular method in child class
	final void m()
	{
		System.out.println("This is m from Test1 class...");
	}
}

// class Test2 extends Test1   //incorrect because Test1 is final class
/*
 {
	void m()   //incorrect because m is final method so we can't override
	{
		System.out.println("This is m from Test2 class..."); 
	}
	
 }
*/











public class FinalMethodDemo {

	public static void main(String[] args) {
		

	}

}
