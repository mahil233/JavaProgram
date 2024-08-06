package day12;

interface Shape //Shape is interface name
{
	int length=10; //In interface variables are bydefault static & final. we don't write static & final
	int width=20;  //In interface variables are bydefault static & final. we don't write static & final


    void circle(); //abstract method means unimplemented method
    
    default void square() //in interface only default method is allowed. default is mandatory to specify otherwise it give error
    {
    	System.out.println("This is square default method");
    }
    
    static void rectangle() //In Interface static method is allowed
    {
    	System.out.println("This is rectangle");
    }

}

public class InheritanceDemo implements Shape {
	//note- we can't create object of interface
		
		public void circle()
		{
			System.out.println("This circle");
		}
		
		public static void main(String[] args) 
		{
			//Though object of child class, we can access the Shape interface
			
			InheritanceDemo idobj=new InheritanceDemo();
			
			idobj.circle();
			idobj.square();
			Shape.rectangle(); //static method can directly Access though interfacename.method names
			
			//Shape sh=new Shape();// incorrect because we can't create object of interface
			
			Shape sh1=new InheritanceDemo();//interface variable(sh) can hold onject of child class
			sh1.circle();
			sh1.square();
			
			
			
			
			
	    }

}
