package Inheritance;

public class ExampleArithmeticException {
public void add()
{
	int a=10;
	try
	{
		int c=a/0;
	}
	catch(Exception e)
	{
		System.out.println(e);
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleArithmeticException on=new ExampleArithmeticException();
		on.add();
	}

}
