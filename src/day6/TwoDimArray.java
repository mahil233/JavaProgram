package day6;

public class TwoDimArray {

	public static void main(String[] args) {
		
		//1 Declaration
		int a[][]=new int[3][2];
		//or
		int [][]a1=new int [3][2];
		//or
		int []a2[]=new int [3][2];
		
		
		//2 Insert data/value ito array
		//approach-1
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		
		//approach-2
		int a4[][]= {{100,200}, //{100,200} is first row data
				     {300,400}, //{300,400} is 2nd row data
				     {500,600}
				     };
		
		
		
		//3 Find size/length of an array
		
		//(a)find the number of rows
		System.out.println(a.length); //3   3 is no of rows
		
		//(b)find the number of columns
		//a[0] means we have to provide atleast one row number. 0 is row number because all rows have same no of columns 
		System.out.println(a[0].length); //2   2 is no of columns.
		
		
		
		//4 read specific value from array
		System.out.println(a[2][0]);  //500
		
		//5 reading data from array using classic for loop
		//approach-1
		for(int r=0;r<a.length;r++)   //r is row
		{
			for(int c=0;c<a[r].length;c++)  //c is column
			{
				System.out.print(a[r][c]+" ");
			}
			System.out.println();
		}
		
		
		//approach-2
		for(int x[]:a)
		{
			for(int v:x)
			{
				System.out.print(v+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
