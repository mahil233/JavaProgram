package day11;

class ABC1
{
	void m1(int a)
	{
		System.out.println(a);
	}
	
	void m2(int b)
	{
		System.out.println(b);
	}
}

class XYZ1 extends ABC1
//XYZ1 contains 3 methods- 1 is overriding method & 2 is overloading method


{
	void m1(int a)        //m1 is overrided method because same method created with out changes the definition. we just change the body of method
	{
		System.out.println(a*a);
	}
	
	void m2(int a,int b) //m2 is overloaded because parameter is different in top & bottom m2 method.
	{
		System.out.println(a+b);
	}
	
}


public class OverridingVsOverloading {
	
	public static void main(String[] args) 
	{
		XYZ1 xyz1=new XYZ1();
		xyz1.m1(100);   //10000
		xyz1.m2(10);    //10
		xyz1.m2(10, 20);//30

	}

}
