import java.lang.*;
import java.util.*;
class Handlings
{
	public static void main(String s[])
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the A value");
			int a = sc.nextInt();
			System.out.println("Enter the B value");
			int b = sc.nextInt();
			int c = a/b;
			System.out.println("Division Value " + c);
		}
	catch(InputMismatchException e)
	{
		System.out.println("Please give valid input ");
	}
	catch(ArithmeticException e)
	{
		System.out.println("Please enter non zero value" );
	}
	catch(Exception e)
	{
		System.out.println("Error");
	}
	finally
	{
		System.out.println("Successed ");
	}
	}

}