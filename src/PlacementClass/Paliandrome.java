package PlacementClass;

public class Paliandrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="malayalam";
		String rev="";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		
			rev=rev+s.charAt(i);
			
		if(s.equals(rev))
		{
			System.out.println(s+" is a paliandrome");
		}
		else {
			System.out.println(s+" is a not paliandrome");
		}

	}

}
