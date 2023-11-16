package placementClass2;

public class AB implements A,B{
public void show()
{
	System.out.println("Inteface A");
	
}
public void display()
{
	System.out.println("Inteface B");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
AB obj=new AB();
obj.show();
obj.display();
	}

}
