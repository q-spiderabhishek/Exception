package Project_Exception;

public class Exception1 

{
	
public static void main(String args[])
{

	try{
	
		//int data = 100/0;
		
		int b[] = new int[5];
		b[10] = 50;

	}catch(ArithmeticException ar)
	{
	System.out.println(ar);
	}
	catch(ArrayIndexOutOfBoundsException t)
	{
		System.out.println("zero");
	}
	}

}