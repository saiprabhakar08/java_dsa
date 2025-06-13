package day1;
import java.util.Scanner;
public class EmployeeSalaryCalculation {
	public static float calculateMonthlySalaryWithoutBonus(float basicSalary, float hra, float da)
	{
		return basicSalary + hra + da;
	}
	public static float calculateMonthlyGrossSalary(float basicSalary,float hra, float da,float monthlyBonus)
	{
		return basicSalary + hra + da + monthlyBonus;
	}
	public static float calculateAnnualGrossSalary(float monthlyGrossSalary)
	{
		return monthlyGrossSalary*12;
	}
	
	public static void level1(String nameOftheEmployee, String locationoftheEmployee, String designation, float basicSalary, float monthlyGrossSalary, float annualGrossSalary, float monthlyBonus)
	{
		System.out.println("Employee's Name is:" + nameOftheEmployee);
		System.out.println("Employee's Location is:" + locationoftheEmployee);
		System.out.println("Employee's Designation is:" + designation);
		System.out.println("Employee's Basic Salary is:" + basicSalary);
		System.out.println("Employee's Monthly Gross Salary is:" + monthlyGrossSalary);
		System.out.println("Employee's Annual Gross Salary is:" + annualGrossSalary);
		System.out.println("Employee's Bonus earned per year is:" + monthlyBonus*12);
		
	}
	
	
	public static void level3(String nameOftheEmployee, String locationoftheEmployee, String designation, float basicSalary, float monthlyGrossSalary, float annualGrossSalary, float monthlyBonus, float taxableAmount, float taxToBePaid, float charityAmount, float homeLoanAmount, boolean isEligibleSection87) {
		
		System.out.println("Employee's Name is:" + nameOftheEmployee);
		System.out.println("Employee's Location is:" + locationoftheEmployee);
		System.out.println("Employee's Designation is:" + designation);
		System.out.println("Employee's Basic Salary is:" + basicSalary);
		System.out.println("Employee's Monthly Gross Salary is:" + monthlyGrossSalary);
		System.out.println("Employee's Annual Gross Salary is:" + annualGrossSalary);
		System.out.println("Employee's Bonus earned per year is:" + monthlyBonus*12);
		System.out.println("The Amount which is liable to tax is i.e Taxable Amount is:" + taxableAmount);
		float dudactions = 0.0f;
		if(isEligibleSection87)
		{
			if(taxableAmount >= 0)
			{
				dudactions += 300000;
			}
		}
		dudactions += ( charityAmount + homeLoanAmount );
		 
		System.out.println("Total Standard Dudaction amount on annual gross salary is:" + dudactions);
		System.out.println("Total Tax to paid calculated on Taxable amount is:" + taxToBePaid);
		
	}
	
	public static void main(String[] args)
	{ 
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Employee Name:");
		String nameOftheEmployee = scanner.nextLine();
		
		System.out.printf("Enter Employee Location Category by refering below categories : \n 1. cosmopolitan\n 2. semi-urban\n 3. rural\n");
		String locationoftheEmployee = scanner.nextLine();
		
		System.out.print("Enter Employee Designation:");
		String designation = scanner.nextLine();
		
		System.out.print("Enter Employee Basic Salary:");
		float basicSalary = scanner.nextFloat();
		
		float hra = 0.0f;
		
		if( locationoftheEmployee.equals("cosmopolitan"))
		{
			hra = basicSalary * 0.15f;
		}
		else if( locationoftheEmployee.equals("semi-urban"))
		{
			hra = basicSalary * 0.10f;
		}
		else if( locationoftheEmployee.equals("rural"))
		{
			hra = basicSalary * 0.5f;
		}
		else
		{
			System.out.println("Enter a valid location in which category your location");
			return;
		}
		float monthlyBonus = basicSalary * 0.2f;
		float da = basicSalary * 0.12f;
		
		float monthlySalaryWithoutBonus = calculateMonthlySalaryWithoutBonus(basicSalary, hra, da);
		
		float monthlyGrossSalary = calculateMonthlyGrossSalary(basicSalary, hra, da, monthlyBonus);
		
		float annualGrossSalary = calculateAnnualGrossSalary(monthlyGrossSalary);
		
		
		System.out.println("--------LEVEL 1--------");
		
		level1(nameOftheEmployee, locationoftheEmployee, designation, basicSalary, monthlyGrossSalary, annualGrossSalary, monthlyBonus);
		
		System.out.print("Employee done any Charity Enter that Charity Amount:");
		
		float taxableAmount = annualGrossSalary;
		float charityAmount = scanner.nextFloat();
		if(taxableAmount > charityAmount)
		{
			taxableAmount -= charityAmount;
		}
		else
		{
			taxableAmount = 0;
		}
		
		System.out.print("Is Employee taken any Home Loan:");
		boolean ishomeLoanTaken = scanner.nextBoolean();
		
		float homeLoanAmount = 0.0f;
		if(ishomeLoanTaken)
		{
			System.out.print("Enter Annual Home loan Interest paid:");
			homeLoanAmount =  scanner.nextFloat();
			if(taxableAmount > homeLoanAmount)
			{
				if(homeLoanAmount <= 150000)
				{
					taxableAmount -= homeLoanAmount;
				}
				else 
				{
					taxableAmount -= 150000;
				}
			}
			else
			{
				taxableAmount = 0;
			}
		}
		
		System.out.print("Is Employee is eligible under Section 87:");
		boolean isEligibleSection87 = scanner.nextBoolean();
		if(isEligibleSection87)
		{
			if(taxableAmount > 300000)
			{
				taxableAmount -= 300000;
			}
			else
			{
				taxableAmount = 0;
			}
		}
		
		float taxToBePaid = 0.0f;
		
		if(taxableAmount <= 500000)
		{
			taxToBePaid = 0.0f;
		}
		else if(taxableAmount >= 500001 && taxableAmount <= 800000)
		{
			taxToBePaid = taxableAmount * 0.1f;
		}
		else if(taxableAmount >= 800001 && taxableAmount <= 1000000)
		{
			taxToBePaid = taxableAmount * 0.15f;
		}
		else if(taxableAmount >= 1000001 && taxableAmount <= 1500000)
		{
			taxToBePaid = taxableAmount * 0.2f;
		}
		else if(taxableAmount >= 1500001 && taxableAmount <= 2000000)
		{
			taxToBePaid = taxableAmount * 0.25f;
		}
		else
		{
			taxToBePaid = taxableAmount * 0.3f;
		}
		
		System.out.println("-------LEVEL 2-------");
		System.out.println("The Amount which is liable to tax is i.e Taxable Amount is:" + taxableAmount);
		
		System.out.println("-------LEVEL 3-------");
		level3(nameOftheEmployee, locationoftheEmployee, designation, basicSalary, monthlyGrossSalary, annualGrossSalary, monthlyBonus, taxableAmount, taxToBePaid, charityAmount, homeLoanAmount, isEligibleSection87);
			
	}

}
