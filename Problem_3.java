/*
 HW Week 3 Problem 2
 Description: Program that prints payroll statements
 Input:none/
 Output: Payroll Statement
 Student: Niklas Feil-Ho
 Known bugs: none
 Date: 02/19/2023 
*/


import java.util.Scanner;
public class Problem_3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("Enter employee's name: " );
		String employee = input.nextLine();
		System.out.printf("Enter number of hours worked in a week: ");
		int hours = input.nextInt();
		System.out.printf("Enter hourly pay rate: ");
		double pay = input.nextDouble();
		System.out.printf("Enter federal tax withholding rate: ");
		double federal = input.nextDouble();
		System.out.printf("Enter state tax withholding rate: ");
		double state = input.nextDouble();
		
		double weeks_pay = pay * hours;
		
		double federal_tax = weeks_pay * (federal); 
		double federal_tax_percent = federal * 100;
		double state_tax = weeks_pay * (state); 
		double state_tax_percent = state * 100  ;
		double total = state_tax + federal_tax;
		double net_pay = ((hours * pay) - total);
		
		System.out.printf("employee's name: %s \r " + " hours worked: %d \r " 
		+ "pay rate: %2.2f \r" + "Gross Pay: $%2.2f \r " 
		+ "Deductions \r " , employee, hours, pay, weeks_pay);
		System.out.printf("	Federal Withholding (%2.2f%s) : $%2.2f \r", federal_tax_percent, "%"  , federal_tax  );
		System.out.printf("	State Withholding (%2.2f%s) : $%2.2f \r", state_tax_percent, "%", state_tax  );
		System.out.printf("Total Deduction : $%2.2f \r", total );
		System.out.printf("Net Pay : $%2.2f", net_pay );
	
	}

}

/*
Enter employee's name: Nik
Enter number of hours worked in a week: 40
Enter hourly pay rate: 1700
Enter federal tax withholding rate: 0.2
Enter state tax withholding rate: 0.09
employee's name: Nik 
  hours worked: 40 
 pay rate: 1700.00 
Gross Pay: $68000.00 
 Deductions 
 	Federal Withholding (20.00%) : $13600.00 
	State Withholding (9.00%) : $6120.00 
Total Deduction : $19720.00 
Net Pay : $48280.00
*/
