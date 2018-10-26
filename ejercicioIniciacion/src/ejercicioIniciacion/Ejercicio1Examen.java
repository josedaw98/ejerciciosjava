package ejercicioIniciacion;

import java.util.Scanner;

public class Ejercicio1Examen {
	
	static int obtenerFC(String valor) {
		int n;
		Scanner sc = new Scanner(System.in);
		

		do {
			System.out.println("dime numero de "+valor);
			n = sc.nextInt();
			if(n % 2 == 0 || n<3) {
				System.out.println("numero de" +valor +"incorrecto,vuelva a introducir un numero valido");
			}
		} while (n % 2 == 0 || n<3);
		
		return n;
		
	}

	public static void main(String[] args) {
		int n= obtenerFC("fila");
		int m= obtenerFC("columna");
		
		
		

		
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
//				if (i == n / 2 || j == m / 2) {
//					System.out.print("♣");
//				} else {
//					System.out.print(" ");
//				}
				System.out.print((i == n / 2 || j == m / 2) ? "♣" : " ");//simbolos terniarios , 
																			//? marca que si la expresion primera es correcta se imprisa el literal de su derecha, 
																			//: marca que si expreseion es falsa imprima el literal de su derecha
			}
			System.out.println();
		}

	}

}
