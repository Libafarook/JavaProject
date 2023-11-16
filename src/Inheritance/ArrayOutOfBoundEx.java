package Inheritance;

public class ArrayOutOfBoundEx {
	public void numbers()
	{int arr[]= {10,20,30,50};
		try {
			//int arr[]= {10,20,30,50};
			System.out.println(arr[6]);
		}
	catch(Exception e)
		{
		System.out.println(e);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayOutOfBoundEx obj=new ArrayOutOfBoundEx();
		obj.numbers();

	}

}
