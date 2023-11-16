package PlacementClass;

public class InterfaceExample implements A,B{
	
	public void show()
	{
		System.out.println("interface A");
	}
public void display()
{
	System.out.println("interface B");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceExample it=new InterfaceExample();
		it.show();
		it.display();
		

	}

}
