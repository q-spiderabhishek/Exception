package Project_Exception;

public class Throwk 

	{
		static void age(int age)
		{
		if(age<23)
		
			throw new ArithmeticException("not aligible");
		
		else
		
			System.out.println("welcome to shadi.com");
			
		}
	
		public static void main(String []args)
		{
			age(13);
		}
}
