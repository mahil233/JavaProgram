package day6;

public class ObjectTypeArray {

	public static void main(String[] args) {
		
		//1 Declaration
		Object a[]=new Object[5];
		
		//2 Insert value into an array
		a[0]=10;
		a[1]=10.5;
		a[2]="welcome";
		a[3]='A';
		a[4]=true;
		
		//3 Extract all value from array
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		
		//4 Extract all value from array using for each loop
		for(Object x:a)
		{
			System.out.println(x);
		}
		

	}

}
