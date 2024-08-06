package day2;

public class DataTypesDemo2 {

	public static void main(String[] args) {
		
		//1 numeric-integer data types
		int a=100, b=200;
		
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		
		long x=123456789;
		System.out.println("Value of x is:"+x); //+ is concatenation operator here.first x is String & second x is concatination operator
		
		byte by=100;
		System.out.println(by);
		
		short sh=32765;
		System.out.println(sh);

		//2 decimal numbers-float, double this are for storing the decimal number.
		
		float item_price=15.50F; //when create float variable, at end of value specify f or F
		System.out.println(item_price);  //15.5
		
		double d=1234.65645645;
		System.out.println(d);
		
		//if store number in decimal variable, it is allowed
		double du=125; //valid statement
		System.out.println(du); //125.0
		
		//integer type of variable can not hold decimal type of data
		//int it=10.50;  //not valid
		
		//3 when we store character, that should be represented with single quotation.String will represented with double quotation
		char grad='A';
		System.out.println("Grade of student is:"+grad);
		
		//only true or false is allowed in boolean
		boolean bo=true;
		System.out.println(bo); //true
		
		//boolean bol="true"; //invalid statement
		//boolean bo1=ABC;    //invalid statement
		
		String person_name="John kenedy";
		System.out.println("name of person is: "+person_name);
		
		//4 String can have single or multiple characters.
		String str="A";  //valid statement
		System.out.println(str);
		
		// 5 In case of char it should be single character
		//char ch='ABC'; //invalid statement
		
		//6 
		//String sr=true; //invalid because true is boolean data but variable is String type of variable
		String s="true"; //valid statement because we put in double quotation
		
		
		
		
		
		
	}

}
