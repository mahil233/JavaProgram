package day9;

public class ConstructorOverloading {

	int x,y;
	double d;
	
	
        //   4 rules in Constructor overloading 
	    //1  In overloading names of constructor  should be same as class name
	    //2  No of parameters should be different               
	    //3  Data Type of parameters should be different        
	    //4  Orders of parameters should be different          
		
	
	ConstructorOverloading()
	{
		x=10;
		y=20;
	}
	
	
	ConstructorOverloading(int a, int b)
	{
		x=a;
		y=b;
	}
	
	
	ConstructorOverloading(int a, double b)
	{
		x=a;
		d=b;
	}
	
	
	ConstructorOverloading(double b,int a)
	{
		d=b;
		x=a;
	}
	
	
	void display()  //to display the data we used this method
	{
		System.out.println(x);
		System.out.println(y);
		System.out.println(d);
	}
	
	
	
	public static void main(String[] args) {
	
		// ConstructorOverloading co=new ConstructorOverloading();
		//co.display(); //1st constructor will call
		
		// ConstructorOverloading co=new ConstructorOverloading(100,200);
		// co.display(); //2st constructor will call
		
		
		//ConstructorOverloading co=new ConstructorOverloading(100,20.5);
		//co.display(); //3rd constructor will call
			
		//ConstructorOverloading co=new ConstructorOverloading(20.5,100);
		//co.display(); //4th constructor will call
				
		
		

	}

}
