package day13;

public class WrapperClassesDemo {

	public static void main(String[] args) {
	
		//1 create variable with primitive type, it is giving 100 value
		int a=100; //a is primitive variable
		System.out.println(a);
		
		
		//2 create variable with wrapper class, it is also giving 100 value 
        Integer a1=100;      //a1 is object type of variable.Integer is wrapper class
        System.out.println(a1);
        
        //3 this variables are in primitive format
        byte b=10;
        short s=20;
        int i=30;
        long l=40;
        float f=50.0F;
        double d=60.0D;
        char c='a';
        boolean b2=true;
        
        
        
        
        //3 Converting primitive into object: Autoboxing
        byte b1=10;
        Byte byteobj=b; //b is byte variable & Byte is wrapper class. byteobj is type of Byte class
        Short shortobj=s; //assigning the primitive variable into wrapper class object
        Integer intobj=i;
        Long longobj=l;
        Float floatobj=f;
        Double doubleobj=d;
        Character charobj=c;
        Boolean boolobk=b2;
        
        //4 Printing all the values of object
        System.out.println("Byte Object "+byteobj);
        System.out.println("Short Object "+shortobj);
        System.out.println("Integer Object "+intobj);
        System.out.println("Long Object "+longobj);
        System.out.println("Float Object "+floatobj);
        System.out.println("Double Object "+doubleobj);
        
        //5 Converting objects to primitive is called unboxing
        byte bytevalue=byteobj;
        short shortvalue=shortobj;
        int intvalue=intobj;
        long longvalue=longobj;
        float floatvalue=floatobj;
        double doublevalue=doubleobj;
        
        //6 Printing all the variable
        System.out.println("byte value "+bytevalue);
        System.out.println("short value "+shortvalue);
        System.out.println("int value "+intvalue);
        System.out.println("long value "+longvalue);
        }
}
