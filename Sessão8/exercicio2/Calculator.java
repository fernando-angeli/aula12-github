package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		System.out.println();
		
		System.out.println("Employee: " + employee.name + ", $ "+String.format("%.2f", employee.netSalary()));
		System.out.println();
		
		System.out.print("Which percentage to increase salary? ");
		double percent = sc.nextDouble();
		employee.increaseSalary(percent);
		System.out.println();
		
		System.out.print("Update data: " + employee.name + ", $ "+ String.format("%.2f", employee.netSalary()));
		
		sc.close();
	}

}
