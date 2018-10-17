package ejercicioIniciacion;

import java.util.Scanner;

public class Iva {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("introduce el precio");
		float precio = sc.nextFloat();
		System.out.println("tipo de iva : (0) 7% - (1) 10% - (3) 21%");
		int tipoIva = sc.nextInt();
		float iva = 0 ;
		if(tipoIva ==0) {
			iva = 0.07f;
		}else if (tipoIva ==1 ) {
			iva = 0.1f;
		}else if (tipoIva ==2 ) {
			iva = 0.21f;
				
		}else {
			System.out.println("el tipo de iva no es correto");
		}
		
		if(iva!=0) {
			double totalIva = precio * iva;
			double total = precio + totalIva;
		}
		
		sc.close();
	}

}
