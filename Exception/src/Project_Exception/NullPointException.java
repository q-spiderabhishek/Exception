package Project_Exception;

public class NullpointException 

{
	
	public static void main(String []args)
	{
	
	try
	{
		String a = null;
		a.length();
	}catch(NullPointerException ne)
	{
	System.out.println("null");
	}
}
}