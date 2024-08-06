package day12;

public class PQR extends MNO implements ABC,XYZ 
{
	@Override
	public void m2() {
		System.out.println("This is m2 from XYZ");
		System.out.println(y); //200
		
	}

	@Override
	public void m1() {
		System.out.println("This is m1 from ABC");
		System.out.println(x);//100

		
	}
     public static void main(String[] args) 
     {
    PQR obj=new PQR();
    obj.m1();  //This is m1 from ABC
    obj.m2();  //This is m2 from XYZ
    obj.m3();  //This is m3 from MNO
     }
}
