package exception;

public class DemoException {


	public static void main(String args[])
	{
		int i,j,k=0;
		int a[]=new int[4];
		a[0]=1;
		a[1]=3;
		a[2]=5;
		a[3]=4;
		i=8;
		j=0;
		try {
	//	k=i/j;
		
		System.out.println(a[4]);
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println(k);
	
}
}