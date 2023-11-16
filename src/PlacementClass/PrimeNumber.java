package PlacementClass;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int num=12;
boolean isPrime=true;   //count=0;

for(int i=2;i<num;i++)
{
	if(num%i==0)
	{    isPrime=false;      //count++;
		
		break;
	}
}

	if(isPrime)  //(count==2)
	{
		System.out.println("The given number is prime");
	}
	else
	{
		System.out.println("The given number is not a prime number");
}
	}

}
