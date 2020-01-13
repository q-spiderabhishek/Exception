package Project_Exception;

public class Exception3 

{
	void a()
	{
		int data = 100/0;
	}
	void b()
	{
		a();
		
	}
	void c()
	{
		try
		{
			b();
		}
		catch(ArithmeticException g)
		{
			System.out.println("infinity");
	}

}
public static void main(String []args)

{
	Exception3 s = new Exception3();
	s.c();
}
}