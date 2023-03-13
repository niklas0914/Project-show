/*
HW Week 3 Problem 2
 Description: Calculating Cost of Shipping
 Input:none/
 Output: Cost of Shipping
 Student: Niklas Feil-Ho
 Known bugs: none
 Date: 02/12/2023 
*/

import java.util.Scanner;

public class Problem_2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		// prompt user to enter weight of package in pounds
		System.out.print("Enter weight in pounds");
		double w = input.nextDouble();
		
		System.out.println("The shipping cost is"  );
		if ( w <= 1 ) {
			System.out.print("3.5 dollars");
		}
		else if (w <= 3) {
			System.out.print("5.5 dollars");
		}
		else if (w <= 10) {
			System.out.print("8.5 dollars");
		}
		else if (w <= 20) {
			System.out.print("10.5 dollars");
		}
		else {
			System.out.print("the package cannot be shipped");
				
		}
	}
}

/*
 Enter weight in pounds 1
The shipping cost is
3.5 dollars
Enter weight in pounds 2
The shipping cost is
5.5 dollars
Enter weight in pounds 8
The shipping cost is
8.5 dollars
Enter weight in pounds 17
The shipping cost is
10.5 dollars
Enter weight in pounds 37
The shipping cost is
the package cannot be shipped
*/ 
