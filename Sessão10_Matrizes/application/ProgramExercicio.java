package application;

import java.util.Locale;
import java.util.Scanner;

public class ProgramExercicio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		int[][] mat = new int [m][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println();
		System.out.println("Matriz:");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.print("Pesquise um elemento na matriz:");
		int search = sc.nextInt();
		
		System.out.println("--------------");
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				if(mat[i][j] == search){
					System.out.println("Position " + i + ","+ j + ":");
					if(j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if(i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if(j < mat[i].length-1) {
						System.out.println("Rigth: " + mat[i][j+1]);
					}
					if(i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);				
					}
					}
			}
			System.out.println();
		}
		sc.close();
	}
}