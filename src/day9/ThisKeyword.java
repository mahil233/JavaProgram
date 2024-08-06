package day9;

public class ThisKeyword {
	
	int x,y;  //x & y are instance variable or class variable. x & y we can used anywhere
	
	
	//This- To differentiate local variable & class variable we used this keyword
	
	/*
	//local variable we can access only with in the method
	void setData(int a, int b)  //a and b are the local variable or method variable. a and b we can used only this method
	{
		x=a;
		y=b;
	}
	*/
	
	
	
	
	//parametrized method
	void setData(int x, int y)  //this x and y are the local variable or method variable. this x and y we can used only this method
	{
		this.x=x;  //this.x  is representing the class variable and x is represent the local variable
		this.y=y;
	}
	
	
	
	//parametrized constructor
	ThisKeyword(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	
	
	void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
	
	public static void main(String[] args)
	{
		//ThisKeyword th=new ThisKeyword();
		//th.setData(10,20);
		//th.display();          //10 20
		
		
		ThisKeyword th=new ThisKeyword(10,20);
		th.display();           //10 20
	}
	
	}
