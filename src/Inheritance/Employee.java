package Inheritance;
import java.util.Scanner;


public class Employee {
	
public int bp;
public int deduction;
public int b;
public void getDetail()
{
	System.out.println("Enter basic pay");
	Scanner r=new Scanner(System.in);
	 bp=r.nextInt(); 
	System.out.println("Enter deductions if any");
	 deduction=r.nextInt();
	System.out.println("Enter bonus given");
	b=r.nextInt();
	r.close();
	}	

	
	
	
}


