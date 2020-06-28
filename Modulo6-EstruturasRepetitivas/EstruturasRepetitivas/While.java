package EstruturasRepetitivas;
import java.util.Scanner;

public class While {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;

		while (x < 5) {
			y = x*3;
			System.out.print(y);
			x = x+1;
		}

		System.out.println("Fim");
		sc.close();
	
		
	/*	Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int soma = 0;

		while (x != 0) {
			soma = soma + x;
			x = sc.nextInt();
		}

		System.out.println("Soma do que foi digitado:" + soma);
		sc.close();*/
	}
}