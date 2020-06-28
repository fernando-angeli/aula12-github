package Exercicios;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int senha = 0;
				
		for(int i = 0; i<3; i++) 
		
		while (senha != 2002) {
			senha = sc.nextInt();
			if(senha!=2002) {
			System.out.println("Senha Invalida");
			
			}
		}
		System.out.println("Acesso Permitido");
		}
	}
}