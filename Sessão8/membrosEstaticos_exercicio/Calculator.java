package membrosEstaticos_exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double cDolar = sc.nextDouble();
		System.out.print("How many dollars will be bought? ");
		double qDolar = sc.nextDouble();
		double reais = CurrencyConverter.convert(cDolar,qDolar);
		System.out.printf("Amount to be paid in reais = %.2f%n", reais);
		
		sc.close();

	}

}
