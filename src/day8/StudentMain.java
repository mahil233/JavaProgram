package day8;

public class StudentMain {

	public static void main(String[] args) {
		
		//Student stu=new Student();
		
		//Approach1-using reference variable we can assign the data into the variable
		
		/*
		stu.sid=102;
		stu.sname="John";
		stu.grade='A';
		
		stu.show();
       
		
		//Approach2-using method  we can assign the data into the variable
		stu.setData(102, "John", 'A'); //by calling this method(setData) i will pass the data(102,John,A)
		stu.show();
		
		*/
		
		//Approach3- using constructor
		Student stu=new Student(102,"John",'A'); //passing data to constructor
		stu.show();
		
		
		
		
		
		
	}

}
