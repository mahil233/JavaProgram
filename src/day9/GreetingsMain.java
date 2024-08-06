package day9;

public class GreetingsMain {

	public static void main(String[] args) 
	{
		
	//1 first way of creating the method	
	Greetings gr=new Greetings();
	gr.greeting1();  //1         In first case we r not returning data for us. so variable is not required.
		
	//2 Second way of creating the method
	String str=gr.greeting2();      //In second case method is return something for us which is string data returning. So we create a String variable.
	System.out.println(str);  //2
	
	//or
	System.out.println(gr.greeting2()); //2
	
	//3 Third way of creating the method
	gr.greeting3("john");  //3
	
	//4 Fourth way of creating the method
	String str1=gr.greeting4("John");
	System.out.println(str1); //4
	
	//or
	System.out.println(gr.greeting4("John"));  //4
	
	}

}
