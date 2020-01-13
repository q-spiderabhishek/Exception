package Project_Exception;

import java.io.IOException;

public class throwsk 

{
	
	static void validate(int age)
	{
	if(age<23)
	
    throw new ArithmeticException("not aligible");
	
		

		else
	
		System.out.println("welcome to shadi.com");
		
	}

	public static void main(String []args) //throws ArithmeticException
	{
		try
		{
			validate(20);
			
		}catch(ArithmeticException jj)
		
		{
			System.out.println("welcome for marriage");
		}
		
	}

}
