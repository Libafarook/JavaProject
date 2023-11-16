package exception;

public class CustomException {
	public void display(int age) throws LicenseException
	{
		
		if(age<18)
		{
			throw new LicenseException("Not Eligible");
			
		}
		else 
		{
			System.out.println("Eigible");
			
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomException oe=new CustomException();
		try
		{
			oe.display(15);
		}
		catch(LicenseException e) {
			
			
			
	
		
		System.out.println(e);
		}
		System.out.println("Age should be greater than 18");
	}

}
