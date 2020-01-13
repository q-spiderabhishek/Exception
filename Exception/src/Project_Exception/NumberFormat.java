package Project_Exception;

public class NumberFormat 

{
	
	public static void main(String []args)
	{
try	
{
	String a = "abc456";
	int b = Integer.parseInt(a);
		}catch(NumberFormatException as)
{
System.out.println("cant print");

}
}
}