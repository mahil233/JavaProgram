package day3;

public class OperatorsDemo {

	public static void main(String[] args) {
		
		//1 Arithmetic Operators-it will work only numeric data types, it can be integer or decimal
		int a=20,b=10;
		
		//when u have concatinated operator along with +, u have to put the expression inside the bracket
		System.out.println("Sum of a and b is:"+(a+b));
		System.out.println("Diff of a and b is:"+(a-b));
		System.out.println("Multiplication of a and b is:"+(a*b));
		System.out.println("Division of a and b is:"+(a/b)); //it will return the quotient value
		System.out.println("Modular division of a and b is:"+(a%b)); //it will return the remainder value
		
		//2 Relational/Comparison operators
		//suppose we want to compare two values.it will work for numbers, strings, characters, everything...
		//relational operators will always return boolean value(true/false)
		
		System.out.println(a>b); //true
		System.out.println(a<b); //false
		
		b=20;
		System.out.println(a>=b); //true
		System.out.println(a<=b); //true
		System.out.println(a!=b); //false
		System.out.println(a==b); //true
		
		//single equal to is assignment operator(=) which will assign value into the variable.
		//Double equal to(==) is comparison operator which will compare the two values 
		
		
		//3 Logical Operators (&&(and), ||(or), !(not)). 
		//&& means both values should be true. or means either one value should be true 
		//not is nothing but opposite or negation
		//Logical operators works b/w 2 or more boolean values(true/false)
		// it is also return boolean value(true/false)
		
		boolean x=true;
		boolean y=false;
		System.out.println(x && y); //false
		System.out.println(x || y); //true
		System.out.println(!x);    //false
		
		//sometimes we can store expression also into the boolean variable. 10>20 is expression
		boolean b1=10>20; //false
		boolean b2=20>10; //true
		System.out.println(b1 && b2); //false
		System.out.println(b1 || b2); //true
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
