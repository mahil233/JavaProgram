package day2;

public class DataTypesDemo1 
{

	public static void main(String[] args) 
	{
		//1 int is datatype & a is variable	
		int a; 	//Creating the variable or declaration of variable
		
		a=100;  //Assignment means we can assign some value into the variable.
		
		//2 We can declare the variable and also assign the data into the variable.
		int b=100; //declaration+assignment
		System.out.println(b); //b is variable which contain some value
		
		//3 (Approach1) Variable in multiple lines
		//Approach 1 is used if we have same data type or different data type
		int x=100;
		int y=200;
		int z=300;
		
		//(Approach2) Another way of creating variable in which same data type are there
		//first we define the variable &then we assign the data
		int x1,y1,z1;
        x1=100;
        y1=200;
        z1=300;
        
        //(Approach3) Another way of creating variable in which same data type are there
        int p=100, q=200, r=300;
        System.out.println(p+q+r);//600
        
		//4 Note-plus(+) operator we can use for two purpose
        //Approach 1  it will perform just addition operation
        int t=100, u=200, v=300;
       // System.out.println(t+u+v); //600
        
        //approach2. if use concatinator operator along with space then it will print actual value of variable
        //System.out.println(t+" "+u+" "+v);// 100 200 300
        
        //5 if u want to write more meaningful message
        //string is concatinate with a. first message is printed in console window followed by value of a
        System.out.println("value of t is:"+t);
        System.out.println("value of u is:"+u);
        System.out.println("value of v is:"+v);
	}

}
