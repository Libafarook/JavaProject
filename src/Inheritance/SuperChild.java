package Inheritance;

public class SuperChild extends SuperParent{
	int b=250;
	public void display()
	{
		System.out.println(super.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SuperChild ov=new  SuperChild();
		 ov.display();

	}

}
