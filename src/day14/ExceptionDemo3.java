package day14;

public class ExceptionDemo3 {

	public static void main(String[] args) {
		
		String s="welcome";
		int num=Integer.parseInt(s);
		System.out.println(num); // NumberFormatException because welcome is invalid data, we can't convert into integer
		

	}

}
