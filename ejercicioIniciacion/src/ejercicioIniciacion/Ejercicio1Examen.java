package ejercicioIniciacion;

import java.util.Scanner;

public class Ejercicio1Examen {

	public static void main(String[] args) {
		int n, m = 2;
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("dime numero de filas");
			n = sc.nextInt();
		} while (n % 2 == 0);

		do {
			System.out.println("dime numero de colunmas");
			m = sc.nextInt();
		} while (m % 2 == 0);

		
//		 * for (int i = 0; i < n; i++) { 
//			 if (i == n / 2) {
//				 for (int j = 0; j < m; j++)
//		 * System.out.print("*");
//		 * 
//		 * }
//			 else { 
//				 for (int j = 0; j < m; j++) {
//				 if (j == m / 2) {
//		 * System.out.print("*"); 
//		 } else {
//		 * 
//		 * System.out.print(" "); } } } System.out.println(); }
		 

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (i == n / 2 || j == m / 2) {
					System.out.print("♣");
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
