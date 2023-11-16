package placementClass2;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=153,r,temp=0,sum=0;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum+r*r*r;
			num=num/10;
		}
		
 if(temp==sum)
 {
	 System.out.println("The given number is an armstrong number");
	 
 } else 
 {
	 System.out.println("The given number is not an armstrong number");
 }
	}

}
