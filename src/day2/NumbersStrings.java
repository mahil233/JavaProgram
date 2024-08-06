package day2;

public class NumbersStrings {

	public static void main(String[] args) {
		
	//1 int a="123";    //invalid. 123 is string because we put in double quotation. integer variable can not hold String value 
		String s="123"; //valid because in double quote treated as string
		
	//2	when use + operator b/w string & number, it will perform concatination
		System.out.println("welcome"+100);
		System.out.println("welcome"+"100");
		
		//when use + operator b/w two strings, it will perform concatination
		System.out.println("10"+"20"); //1020
		
		//when use + operator b/w two numbers, it will perform addition operation
		System.out.println(10+20); //30

	}

}
