package Exercicio;

import java.util.Locale;
import java.util.Scanner;

public class Program3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		Rent[] vect = new Rent[10];
		
		int order = 0;
				
		for(int i=0; i<n; i++) {
				sc.nextLine();
				System.out.println();
				order++;
				System.out.println("Rent #"+order);
				System.out.print("Nome: ");
				String name = sc.nextLine();
				System.out.print("Email: ");
				String email = sc.nextLine();
				System.out.print("Room: ");
				int room = sc.nextInt();
				vect[room] = new Rent(room, name, email);	
		}
		
		System.out.println();
		System.out.println("Busy rooms:");
		for(int i = 0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
	sc.close();
}

}
