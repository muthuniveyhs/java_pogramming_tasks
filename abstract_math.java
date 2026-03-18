import java.util.*;
abstract class A1
{
	void add()
	{
		System.out.println("Addition");
	}
	abstract void sub();
}
class A2 extends A1
{
	void mul()
	{
		System.out.println("Multiplication");
	}
	@Override
	void sub()
	{
		System.out.println("Subtraction");
	}
}
class Abstract
{
	public static void main(String args[])
	{
		A2 obj = new A2();
		obj.add();
		obj.sub();
		obj.mul();
	}
}