package day8;

public class Student {
	//class variable or instance variable
	int sid;
	String sname;
	char grade;
	
	
	void show()  //in this method we r not passing any parameter, just it printing the data, not return anything
	{
		//here print the data of student. we print all data in single line we can do concatination.
		System.out.println(sid+" "+sname+" "+grade);
	}
	
	
	
	//local variable-int id, String name, char g
	//purpose to create this method is just assign the data into the variable
	//this method(setData) is taking parameter & it is assigning same data from those parameter into variable
	
	void setData(int id, String name, char g)  //this method will set the data into the variable
	{
		sid=id;   //means this variable value(id) is assign to sid
		sname=name;
		grade=g;
	}

	
	//constructor
	Student(int id, String name, char g) 
	{
		sid=id;   //means this variable value(id) is assign to sid
		sname=name;
		grade=g;
	}

}
