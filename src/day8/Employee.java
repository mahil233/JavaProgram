package day8;

public class Employee {
	
	//inside Employee class will create some variables
	//if we assign the data in variable then every object having same data. thats why we just define the variables.
	int eid;
	String ename;
	String job;
	int esal;
	
	//create one method which will display the data of variables
	void display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(esal);
	}
	
/*
	public static void main(String[] args) 
	//we will create object only within main method because execution start from main method
	{
		Employee emp1=new Employee();     //by using this ref variable we will be able to access the variables & methods
        emp1.eid=101;
        emp1.ename="John";
        emp1.job="Engineer";
        emp1.esal=50000;
        
        emp1.display(); //it will print the first employee object
        
        Employee emp2=new Employee();     //by using this ref variable we will be able to access the variables & methods
        emp2.eid=102;
        emp2.ename="Scott";
        emp2.job="Manager";
        emp2.esal=70000;
        
        emp2.display(); //it will print the second employee object

	}
*/
}
