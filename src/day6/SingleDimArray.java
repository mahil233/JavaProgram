package day6;

import java.util.Arrays;

public class SingleDimArray {

	public static void main(String[] args) {
		
		//1 declaration
		
		//Approach1
		//suppose i want to store 5 value
		//once u declare an array we have to insert the data into the array
		//as we store 5 here,which will create 5 different rows in the memory.
		
		int a[]=new int[5];  //declare an array
		
		//2 inserting the value into the array
          a[0]=100;                                //because it is integer array, we can store only integer
          a[1]=200;                                // we can not store more than 5 because we already given size 5 in array.
          a[2]=300;
          a[3]=400;
          a[4]=500;
          
          
          //Approach2
          int a1[]= {100,200,300,400,500};
          
          
          //3 Size/Length of an array
          System.out.println();
          
          
          //4 get single value from array
          //suppose want to extract 400
          
          System.out.println(a[3]); //400
          
          
          //5 get all the values from array
          
          //Approach-1
          System.out.println(Arrays.toString(a)); //[100, 200, 300, 400, 500]
          
          
          
          //Approach-2
          //get all the values one by one using loop
          
          for(int i=0;i<5;i++)
          {
        	  System.out.println(a[i]); //100 200 300 400 500
          }
   
          //or
          for(int i=0;i<=4;i++)
          {
        	  System.out.println(a[i]); //100 200 300 400 500
          }
          
          //or
          for(int i=0;i<a.length;i++)
          {
        	  System.out.println(a[i]); //100 200 300 400 500
          }
          
          
          
          //read data from array using enhanced for loop
          for(int x:a)             //a is name of array & x is variable
          {
        	  System.out.println(x);
          }
          
	}

}
