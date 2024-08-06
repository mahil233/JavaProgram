package day11;

public class TestSuper {

	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.displayColor(); //White because super keyword invoke parent class variable
		
		d.eat(); //eating.. because super keyword invoke parent class method
		         //eating bread it print child class method
		
		

	}

}
