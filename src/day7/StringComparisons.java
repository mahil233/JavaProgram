package day7;

public class StringComparisons {

	public static void main(String[] args) {
		
	/*	
		//case 1-
		
		String s1="welcome";
		String s2="welcome";
		
		System.out.println(s1==s2);   //true because we are not creating object here. using new keyword we can create object
		System.out.println(s1.equals(s2)); //true
	
		
		//case 2-
		
				String s1=new String("welcome");
				String s2=new String("welcome");
				
				//== will compare objects

				System.out.println(s1==s2);   //false because s1 & s2 are two different objects 
				
				//equals compare value of objects
				System.out.println(s1.equals(s2)); //true because value(welcome) of s1 & s2 object are same.
   */

				//case 3-
				
				String s1="abc";
				String s2=new String("abc");
				String s3=s2;
				
				System.out.println(s1);	//abc
				System.out.println(s2); //abc
				System.out.println(s3); //abc
				
				System.out.println(s1==s2); //false because s1 & s2 are two different objects
				System.out.println(s1.equals(s2)); //true because both values(abc) r same
				
				System.out.println(s2==s3); //true because s2 & s3 r same object
				System.out.println(s2.equals(s3)); //true because s2 & s3 hv same value
				
				
				
				
				
				
				
	}

}
