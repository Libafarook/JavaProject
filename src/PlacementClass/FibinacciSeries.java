package PlacementClass;

public class FibinacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1=0,n2=1,sum=0,i;
		System.out.print(n1+" "+n2);
	for(i=1;i<10;i++)
	{
		sum=n1+n2;
		n1=n2;
		n2=sum;
		System.out.print(" "+sum);
	}

	}

}
