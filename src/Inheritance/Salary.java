package Inheritance;

public class Salary extends Calculate {
public double totalSalary;
public void ts()
{
	totalSalary=bp+HRA-PF-deduction+b;
	//System.out.println("Totalsalary="+totalSalary);
}
public void display()
{
	System.out.println("\t SalarySlip");
	System.out.println("Basic Pay="+bp);
	System.out.println("Deduction="+deduction);
	System.out.println("HRA="+HRA);
	System.out.println("PF="+PF);
	System.out.println("Bonus="+b);
	System.out.println("TotalSalary="+totalSalary);
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub17
		Salary os=new Salary();
		os.getDetail();
		os.calculate();
		os.ts();
		os.display();
		
	}

}



