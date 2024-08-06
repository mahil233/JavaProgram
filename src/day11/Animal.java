package day11;

public class Animal {

	String color="White";
	
	void eat()
	{
		System.out.println("eating....");
	}

}

class Dog extends Animal
{
	String color="Blank"; //override the value of color
	
	void displayColor()
	{
		//1 requirement is I want to print the Parent class variable
		System.out.println(super.color); //super is keyword which always represent immediate parent class. immediate parent of Dog is animal
	                                     //if it is just only color, it is only invoke current class variable
	
	}
	
	void eat()
	{
		super.eat(); //2 it will invoke parent class eat method
		System.out.println("eating bread");//override
	}
	
}
