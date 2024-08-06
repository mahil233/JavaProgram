package day3;

public class TernaryOperator {

	public static void main(String[] args) {
		// syntax var = exp?result1:result2;
		
		//scenario:1
		int a=200, b=100;
		int x=a>b?a:b;
		System.out.println(x);//200
		
		//scenario:2
		a=1000;
		b=2000;
		
		x=b<a? b:a;
		System.out.println(x); //1000

		//scenario:3
		x=(1==1)?100:200;
		System.out.println(x); //100
		
		//scenario 4
		int age=18;
		String res=(age>=18)? "Eligible for vote":"Not Eligible for vote";
		System.out.println(res); //Eligible for vote
		
		
		
		
	}

}
