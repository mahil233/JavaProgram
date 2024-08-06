package day9;

public class Greetings {
	
	//1 No param no return value
	
	void greeting1()  //In first method no return value thats why we put void here
	{
	System.out.println("Hello");		
	}
	
	
	
	//2 No params Returns value  //return value means it should not be void
	
	String greeting2()  //we specify the type of data which we are returning before specify the name of method
	{
		return "Hello How are you?";  //string type of data we r return here
	}
	
	
    //3 Take params no return value    (no return value means void)
	
	void greeting3(String name)       //param is (String name)
	{
		System.out.println("Hello.."+name);
	}
	
	
	//4 Takes param return a value
	String greeting4(String name)
	{
		return ("Hello.."+name);
	}
	
	

}
