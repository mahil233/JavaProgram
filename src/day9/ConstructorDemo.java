package day9;

public class ConstructorDemo {

	int x,y;
	String s;
	
	
	//constructor will not return any value. thats why we don't use void
	//constructor is only for initializing the data
	ConstructorDemo()  //if constructor will not take any parameter, that constructor will call as default constructor
	{
		//Constructor will be used only for assigning the data into the variable
		x=100;
		y=200;
		s="welcome";
	}
	
	
	//method will print the data of variable
	void displayData()  //For print the data we used method. because constructor is used only for initializing the data
	{
	System.out.println(x);	
	System.out.println(y);
	System.out.println(s);
	}
	
	
	
	
	
	
	public static void main(String[] args)
	{
		
	//once creating an object, constructor will automatic invoked
	ConstructorDemo cd=new ConstructorDemo(); //we r invoking default constructor
	cd.displayData();
	

	}

}
