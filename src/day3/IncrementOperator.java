package day3;

public class IncrementOperator {
	public static void main(String[] args)
	{
	//++ is called increment operator. inside this we have pre increment & post increment
	
	int a=10; //want to increase the value of a by 1
	
	//Scenario 1- there is no difference b/w post & pre increment
	
	//post increment
//	a++;   //a++ is equal to a=a+1; 
//	System.out.println(a); //11
	
	//pre increment
//	++a;
//	System.out.println(a); //11
	
	//Scenario-2
	//a++ means a value(10) stored into result variable before incrementation. thats why we call as post increment.thats why result become 10
	//++a means before storing a value into the result variable it is incrementing. thats why we call as pre increment. thats why we got 11
	int res=a++;
	//int res=++a;
	System.out.println(res);//10 
	System.out.println(a);

	
	
	
	
	
	
	
	
	
	}
}
