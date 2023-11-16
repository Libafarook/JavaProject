package Inheritance;

public class ChildPolymorphism extends ParentPolymorphism{
	@Override
	public void add(int a,int b)
	{
		super.add(a, b);
		System.out.println("Sum="+(a+b));
	}


public static void main(String args[])
{
	ChildPolymorphism oc=new ChildPolymorphism();
	oc.add(10,20);
}
}