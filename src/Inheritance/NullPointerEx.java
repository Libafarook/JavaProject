package Inheritance;

public class NullPointerEx {

	public void display()
	{
		try
		{
			String n="";
			System.out.println(n.length());
			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointerEx ob=new NullPointerEx();
		ob.display();

	}

}


