package day10;

public class StaticMain {

	public static void main(String[] args) {
		
		//1 static methods can access static stuff directly(with out object
		
				System.out.println(StaticExample.a); //a is static variable & main is also static method. so main method can directly access a with out object
			    //System.out.println(b); //incorrect because b is non static variable & main is static, so we can't directly access
				
				StaticExample.m1();//we can call this method because m1 is static method
				//m2();//incorrect because m2 is non static method
				
				
			//2 static method can access non static stuff through object
				
				StaticExample se=new StaticExample();
				System.out.println(se.b);
				se.m1();
				se.m(); //10 20 This is m1 static method This is m2 non static method


	}

}
