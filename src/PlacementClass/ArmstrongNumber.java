package PlacementClass;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=155;
		int temp=num;
		int r;
	
		int sum=0;
		while(num>0)
		{
		
			r=num%10;
			num=num/10;
			sum=sum+r*r*r;
			
		}
       if(temp==sum)
       {
    	   System.out.println("The given number is an armstong number");
       }
       else
       {
    	   System.out.println("The given number is not an armstong number");
       }
	}

}
