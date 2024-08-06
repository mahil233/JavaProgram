package day9;

public class MethodOverloading {
	
	int x,y,z;
	double d;
	
	

	


		//   4 rules in Method overloading 
	    //1  In overloading names of method name should be same (ex-1 & 2nd method)
	    //2  No of parameters should be different               (ex-1 & 2nd method)
	    //3  Data Type of parameters should be different        (ex-2 & 3rd method) 
	    //4  Orders of parameters should be different           (ex-3 & 4th method)
		
		void sum()  //this line we call as definition    
		{
			//this body we call as implementation
			x=10;
			y=20;
			System.out.println(x+y);
		}
		
		
		void sum(int a, int b)   //2 parameter r there   
		{
			x=a;
			y=b;
			System.out.println(x+y);
		}
		
		void sum(int a, double b)   //no of parameter r same in this method and above also but data type are different. 
		{
			x=a;
			d=b;
			System.out.println(x+d);
		}
		
		void sum(double b,int a)   //no of parameter r same in this method and above also but orders are different. 
		{
			d=b;
			y=a;
			System.out.println(d+y);
		}
		
		
		public static void main(String[]args)
		{
			MethodOverloading mo=new MethodOverloading();
			mo.sum(); //30
			mo.sum(100,200); //300
			mo.sum(10.5,10); //20.5
			mo.sum(10,20.5); //30.5
			
		}
		
		
		
		
		
		
		
			
		

	

}
