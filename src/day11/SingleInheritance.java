package day11;

class A
{
int a;

void display()
{
	System.out.println(a);
}
}

class B extends A
{
	int b;
	
	void show()
	{
		System.out.println(b);
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		
		B bobj=new B();
		
		bobj.a=100;
		bobj.b=200;
		
		bobj.display();
		bobj.show();


		

	}

}
