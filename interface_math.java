import java.util.*;
interface A1
{
	public void add();
}
class A2 implements A1
{
	@Override
	public void add()
	{
		System.out.println("Addition");
	}
}
class Interface
{
	public static void main(String s[])
	{
		A2 obj = new A2();
		obj.add();
	}
}