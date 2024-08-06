package day11;

	
	class A1
	{
	int a;

	void display()
	{
		System.out.println(a);
	}
	}

	class B1 extends A1
	{
		int b;
		
		void show()
		{
			System.out.println(b);
		}
	}
	
	
	class C1 extends B1
	{
		int c;
		
		void print()
		{
			System.out.println(c);
		}
	}


	public class MultilevelInheritance {
		
	public static void main(String[] args) {
		
		C1 cobj=new C1();
		cobj.a=10;
		cobj.b=20;
		cobj.c=30;
		
		cobj.display();
		cobj.show();
		cobj.print();
		
		
		
		

	}

}
