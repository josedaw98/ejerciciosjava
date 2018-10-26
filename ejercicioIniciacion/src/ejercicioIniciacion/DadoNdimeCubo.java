package ejercicioIniciacion;

import java.util.Scanner;

public class DadoNdimeCubo {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("dime numero de cubos");
		int n = sc.nextInt();

		int sgteimpar=1;
		int contador=1;
		

		

		for (int i=1;i<=n;i++) {
			int acumulador=0;
			for(int j=1;j<=i;j++) {
					acumulador+=sgteimpar;
					sgteimpar+=2;
					
					
				
			}
			if(i==n) {
				System.out.println("el valor del cubo es= " + acumulador);
			}
			
		}
		
	
		
		

	}

}
