package Project_Exception;

public class Exception4 

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
	
		{
			b();
		
	}

}
public static void main(String []args)

{
	Exception4 s = new Exception4();
	s.c();
}

}
