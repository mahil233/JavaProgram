package day13;

public class DataConversionMethods {

	public static void main(String[] args) {


		//1 Convert String to int
		String s="welcome"; //not possible to convert into number
		String s1="10";
		String s2="20";
		
		System.out.println(s1+s2); //1020
		System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2)); //30
		
		
		//2 Convert String to double
		String s3="150.15";
		String s4="130.20";
		
		double s1db1=Double.parseDouble(s3);
		double s2db2=Double.parseDouble(s4);
		
		System.out.println(s1db1+s2db2); //280.35
		
		
		//3 Convert String to boolean
		String s5="true";
		boolean bool=Boolean.parseBoolean(s5);
		System.out.println(bool); //true
		
		
		//4 int,char,double,boolean to String
		
		int a=10;
		double d=15.15;
		char c='A';
		boolean b=false;
		
		System.out.println(String.valueOf(a));  //10
		System.out.println(String.valueOf(d));  //15.15
		System.out.println(String.valueOf(c));  //A
		System.out.println(String.valueOf(b));  //false
		

	}

}
