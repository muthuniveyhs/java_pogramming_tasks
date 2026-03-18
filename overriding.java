import java.util.*;
class A1
{
	A1(String message)
	{
		System.out.println(message);
	}
}
class A2 extends A1
{
	A2(String message)
	{
		super("Php");
	System.out.println(message);
	}
public static void main(String s[])
{
	A2 obj = new A2("Java");
}
}