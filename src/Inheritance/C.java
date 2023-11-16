package Inheritance;

public class C extends B{
	int e=8,f=5;
	public void multi()
	{
		System.out.println("Multiplication="+e*f);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C ob=new C();
		ob.subtract();
		ob.multi();
	

	}

}
