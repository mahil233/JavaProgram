package day7;

public class StringOperations {

	public static void main(String[] args) {
		
		String s="welcome";
		//String s=new String("welcome");
		
		System.out.println(s); //welcome
		
		//1 Find out length of string
		//length()- returns length of a string
		System.out.println(s.length()); //7     means 7 characters present in String
		
		
		
		
		//2 concat()- this method is used for joining strings. if join multiple strings we used this
		String s1="welcome";
		String s2="to java";
		String s3="automation";
		
		System.out.println(s1+s2);  //welcometo java
		//or
		System.out.println(s1.concat(s2)); //welcometo java
		
		System.out.println(s1+s2+s3); //welcometo javaautomation
		//or
		System.out.println(s.concat(s2).concat(s3)); //welcometo javaautomation

		
		
		//3 trim()-Want to extract only the value after removing space in left & right side
		
		s="  automation  ";
		String res=s.trim();
		System.out.println(res); //automation
		
		//or
		//calculate length before trimming
		System.out.println(s.length()); //14
		
		//calculate length after trimming
		System.out.println(s.trim()); //automation
		System.out.println(s.trim().length()); //10
		
		
		
		//4 charAt()-This method returns a single char based on index we passed
		
		//if want to extract specific value or character from String then we used charAt()
		//when use charAt then index count start from 0
		
		s="welcome";
		System.out.println(s.charAt(0));  //w
		System.out.println(s.charAt(3));  //c
		
		
		
		//5 contains()- return boolean value either true or false
		
		System.out.println(s.contains("wel")); //true because wel is part of string
		System.out.println(s.contains("com")); //true
		System.out.println(s.contains("Wel")); //false because w is in upper case & it is not part of actual string
		
		
		//6 equals(), equalsIgnoreCase()- Compare 2 strings & it return boolean value
		//equals will consider case sensitivity that will treat lower & upper case characters differently
		//equalsIgnoreCase() which will ignore case sensitivity which will not consider lower & upper case characters
		
		s1="WELCOME";
		s2="welcome";
		
		System.out.println(s1.equals(s2)); //false because String is case sensitive
		System.out.println(s1.equalsIgnoreCase(s2)); //true
		
		
		//7 replace()- this will replace single/multiple characters in a string
		//(a) suppose want to replace e character with x
		
		s="welcome to selenium automation testing selenium training";
		//in first part mention old char & in second part mention new char
		System.out.println(s.replace('e', 'X'));  //wXlcomX to sXlXnium automation tXsting sXlXnium training
		
		
		//(b)suppose want to replace selenium with java
		System.out.println(s.replace("selenium", "java")); //welcome to java automation testing java training
		
		
		
		//8 substring()-to extract substring from main string. starting index start from 0 & ending index start from 1
		
		s="welcome";
		//Want to extract lco
		System.out.println(s.substring(2, 5)); //lco
		
		System.out.println(s.substring(0, 6)); //welcom
		
		
		
		//9 split()-divide the string into multiple parts using delimeter
		//want to split string into two part- abc is one part & gmail.com is another part. on basis of @we divide here
		//@ is delemeter & return type of split is String[]
		
		s="abc@gmail.com";
		String a[]=s.split("@"); 
		
		
		System.out.println(a[0]); //abc
		System.out.println(a[1]); //gmail.com
		
		//10 toUpperCase(), toLowerCase()- convert string into uppercase & lowercase we used this method
		
		s="welCOME";
		System.out.println(s.toLowerCase());  //welcome
		System.out.println(s.toUpperCase());  //WELCOME
		
		
		
		
		
		
		
		
		
		
		
		


	}

}
