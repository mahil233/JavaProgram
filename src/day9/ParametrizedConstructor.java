package day9;

public class ParametrizedConstructor {
	
	int x,y;
	String s;


	ParametrizedConstructor(int a, int b, String str)  //parametrized constructor
		{
			x=a;
			y=b;
			s=str;
		}
		
		
		//method will print the data of variable
		void displayData()  //For print the data we used method. because constructor is used only for initializing the data
		{
		System.out.println(x);	
		System.out.println(y);
		System.out.println(s);
		}
		
		public static void main(String[] args) {
			
			//we r invoking parametrized constructor
			ParametrizedConstructor pc=new ParametrizedConstructor(10,20,"welcome");
			pc.displayData();//10 20 welcome
			
		

	}

}
