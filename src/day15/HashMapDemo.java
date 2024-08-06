package day15;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {


		//Declarations-Multiple way of declaring HashMap
		//Approach-1
		//HashMap hm=new HashMap(); //it will accept hetrogenious data(Different kind of data)
		
		//Approach-2
		Map m=new HashMap();

		//Approach-3
		HashMap<Integer,String> hm=new HashMap<Integer,String>();  //keys are Integer type & value are String type
		//only Integer allowed in key & only String allowed in value
		
		
		//Scenario1-Adding data pairs to hashmap
		hm.put(101,"John");
		hm.put(102,"Scott");
		hm.put(103,"John");
		hm.put(104,"Marry");
		hm.put(101,"David");
		
		//2 Scenario-2 Print data from Hashmap
		
		//if duplicate the key then updated value will be considered.
		//Duplicate keys are not allowed but value can be allowed
		System.out.println(hm); //{101=David, 102=Scott, 103=John, 104=Marry}
		
		//3 Find out how many pairs r there in hashmap
		System.out.println(hm.size()); //4
		
		//4 Remove the pair
		hm.remove(103);  //103 is key
		System.out.println("After removing pair:"+hm);//suppose want to remove 103   //{101=David, 102=Scott, 104=Marry}
		

		//5 want to get specific value from hashmap
		//102 is key
		System.out.println(hm.get(102)); //Scott
		
		//6 want to print only keys from hashmap
		System.out.println(hm.keySet()); //[101, 102, 104]
		
		//7want to print only values from hashmap-->only looping statement it is possible
		for(Object k:hm.keySet())
		{
			System.out.println(hm.get(k));
		}
		
		//8 want to print key & values both
		
		for(Object k:hm.keySet())
		{
			System.out.println(k+"  "+hm.get(k));
		}
		
		//9 clear all data from hashmap
		hm.clear();
		System.out.println(hm); //{}
		
		
		
		
		
	}

}
