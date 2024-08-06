package day15;

/*Hashset Scenarios-
 * 1 Hetrogenious data-allowed
 * 2 Insertion order-Not preserved(index not supported)
 * 3 Duplicate elements-Not allowed
 * 4 Multiple null not allowed/only single null allowed
 */

//Hashset did not follow index

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {

		//Declaration-Multiple declarations r there
          //Approach-1
		HashSet myset=new HashSet();  //it will accept hetrogenious data(Different kind of data)
		
		//Approach-2
		//Set myset=new HashSet(); //HashSet is class which implemented set interface
		
		//approach-3  Suppose i want to store only homogenious data
		// HashSet <Integer> myset1=new HashSet<Integer>();   //primitive types not allowed only wrapper class r allowed 

		
		//1 Want to add data in HashSet
		//add() is used to add new value at the end of Set
		//1 Hetrogenious data-allowed
		myset.add(100);
		myset.add(10.5);
		myset.add("welcome");
		myset.add(100);
		myset.add(null);
		myset.add(null);
		
		//2 Print the data
		
		/*
		2 Insertion order-Not preserved(index not supported)
		3 Duplicate elements-Not allowed
		4 Multiple null not allowed/only single null allowed
		*/
		
		//whichever order we have inserted the data but it is not giving the same order
		System.out.println(myset); //[null, 100, 10.5, welcome] //insertion order not preserved
		
		
		//3 Want to fnd the size of hashset
		System.out.println(myset.size()); //4
		
		//4 remove value from hashset
		
		//we have to pass value but not index because index won't support here
		myset.remove(10.5);  //want to remove 10.5 
		System.out.println("After memoving "+myset); //[null, 100, welcome]
		
		//5 insert a new value in middle of list
		
		//insertion is not possible in hashset because here we don't maintain the order
		
		//6 Get specific value from hashset
		//not possible because in hashset there is no index concept
		
		//7 only looping statement we get data from hashset
		for(Object x:myset)
		{
			System.out.println(x);
		}
		
		
		
		
		
		
		
	}

}
