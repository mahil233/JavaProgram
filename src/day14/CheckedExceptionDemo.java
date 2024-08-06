package day14;

public class CheckedExceptionDemo {

	public static void main(String[] args) throws InterruptedException  {
		
		System.out.println("program is started..");
		System.out.println("program is in progress..");
		
		/*
		//sleep command is in Thread class.Thread is predefined class & sleep is static method
		//wait for 5 second then rest of code will exceuted
		try {
			Thread.sleep(5000);
		    }
		
		catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace(); //printStackTrace() is print the message of exception
		} 
		*/
		
		//or
		
		Thread.sleep(5000);
		
		
		System.out.println("program is finished..");
		System.out.println("program is terminated..");
	}

}
