package ejercicioIniciacion;

import java.util.Scanner;

public class ENaranco {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Numero lineas");

		int n = sc.nextInt();
		int digitos=1;

		for (int i = 0; i < n; i++) {
			int espacios = n - i;
			

			for (int j = 1; j < espacios; j++) {
				System.out.print("x");
			}
			
				for (int j = 0; j < digitos; j++) {
					System.out.print(i + 1);
					
				}

			for (int j = 1; j < espacios; j++) {
				System.out.print("x");
			}
			digitos+=2;
			System.out.println();
		}

	}

}
