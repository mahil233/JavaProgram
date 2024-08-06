package day10;

public class StaticExample {
	
	static int a=10; //static variable
	int b=20;       //non-static variable
	
	
	
	static void m1()  //static method
	{
		System.out.println("This is m1 static method");
	}
	
	void m2()         //non-static method
	{
		System.out.println("This is m2 non static method");
	}
	
	
	//3 non static methods can access everything directly
	
	void m()         //non static method
	{
		System.out.println(a);
		System.out.println(b);
		m1();
		m2();
	}
	

	public static void main(String[] args) 
	{
		
		/*
	//1 static methods can access static stuff directly(with out object
		
		System.out.println(a); //a is static variable & main is also static method. so main method can directly access a with out object
	    //System.out.println(b); //incorrect because b is non static variable & main is static, so we can't directly access
		
		m1();//we can call this method because m1 is static method
		//m2();//incorrect because m2 is non static method
		
		
	//2 static method can access non static stuff through object
		
		StaticExample se=new StaticExample();
		System.out.println(se.b);
		se.m1();
		se.m(); //10 20 This is m1 static method This is m2 non static method
       */
	}
}
