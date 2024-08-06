package day8;

public class EmployeeMain {

	public static void main(String[] args) {
		
		
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


	}

}
