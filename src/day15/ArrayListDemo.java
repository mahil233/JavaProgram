package day15;

import java.util.ArrayList;
import java.util.List;

/*Scenarios in Arraylist
 *1 Heterogeneous data-allowed 
 *2 Insertion order- preserved(index)
 *3 Duplicate elements-allowed
 *4 Multiple nulls-allowed
 */ 



class Employee
{
	int empno;
	String empname;
	
	void display()
	{
		//code
	}
}



public class ArrayListDemo {

	public static void main(String[] args) {
		
		//declaration- To declare array list multiple approaches r there
		//Approach 1
		ArrayList mylist=new ArrayList();  //in this object i can store only homogeneous data(Same type of data)

		//Approach 2
		//ArrayList<Integer> mylist1=new ArrayList<Integer>(); //when specify Integer wrapper class then we will store integer in this ArrayList
		
		//Approach 3
		//ArrayList<String> mylist12=new ArrayList<String>(); //when specify String wrapper class then we will store String in this ArrayList
		
        //Approach 4
		// List mylist3=new ArrayList(); //we can't create object of List because list is interface.ArrayList is child class of parent Class(List)
		
		Employee empobj1=new Employee();
		Employee empobj2=new Employee();
		Employee empobj3=new Employee();
		Employee empobj4=new Employee();
		Employee empobj5=new Employee();
		
		
		//Multiple methods in ArrayList
		//1 adding data element into arraylist-->add() will be used if u add the value at the end of list
		mylist.add(100);
		mylist.add(10.5);
		mylist.add("welcome");
		mylist.add(true);
		mylist.add(100);  //duplicate data
		mylist.add(null);
		mylist.add(null);
		mylist.add(empobj1); //add object into arraylist
		
		//2 Size ofArrayList-size() is method which is present in arraylist
		
		System.out.println(mylist.size());  //8
		
		//3 Print the data in Array List-  which ever data we have added in same order, it is printed
		System.out.println(mylist); //[100, 10.5, welcome, true, 100, null, null, day15.Employee@e2d56bf]
		
		//4 Remove value from ArrayList
		//index start from zero
		
		mylist.remove(3);  //based on index value particular element is removed
		System.out.println("After removing element "+mylist); //[100, 10.5, welcome, 100, null, null, day15.Employee@e2d56bf]
		
		//5 insert new element in the middle of the list
		mylist.add(2,"java"); //add java in 2nd position
		
		System.out.println("After insertion: "+mylist); //[100, 10.5, java, welcome, 100, null, null, day15.Employee@e2d56bf]

		//6 Want to get specific value from ArrayList
		    //scenario is to print welcome
		System.out.println(mylist.get(3)); //welcome
		
		
		
		//7 want to read all the data one by one from ArrayList
		
		for(Object x:mylist)  //when create variable as object we can store any type of value
		{
			System.out.println(x);
		}
		
		//8 want to remove/clear all data from ArrayList
		mylist.clear();
		System.out.println("After clearing "+mylist);
		
		
		
		
		
		
		
		
	}

}
