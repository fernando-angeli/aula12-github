package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class Calculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Aluno aluno = new Aluno();
		
		System.out.print("Nome: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Nota 1: ");
		aluno.nota1 = sc.nextDouble();
		while(aluno.nota1<0 || aluno.nota1>30) {
		System.out.print("Digite um valor entre 0 e 30 para nota 1: ");
		aluno.nota1 = sc.nextDouble();
		}
		
		System.out.print("Nota 2: ");
		aluno.nota2 = sc.nextDouble();
		while(aluno.nota2<0 || aluno.nota2>35) {
		System.out.print("Digite um valor entre 0 e 35 para nota 2: ");
		aluno.nota2 = sc.nextDouble();
		}
		
		System.out.print("Nota 3: ");
		aluno.nota3 = sc.nextDouble();
		while(aluno.nota3<0 || aluno.nota3>35) {
		System.out.print("Digite um valor entre 0 e 35 para nota 3: ");
		aluno.nota3 = sc.nextDouble();
		}

		System.out.println(aluno);
		
		sc.close();

	}

}
