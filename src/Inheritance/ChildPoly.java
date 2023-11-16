package Inheritance;

public class ChildPoly extends ParentPoly{
	@Override
	public void display()
	{  super.display();
		System.out.println("Child class");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildPoly obj=new ChildPoly();
		obj.display();

	}

}
