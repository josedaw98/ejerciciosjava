package ejercicioIniciacion;

import java.util.Scanner;

public class CubosNicomaco {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in) ;
		System.out.println("dime numero de cubos");
		int n = sc.nextInt();
//		int valor=-1;
		int sgteimpar=1;
		
		
//		for(int j=1;j<=n;j++) {
//			int resultado=0;
//			
//			for(int h=1;h<=j;h++) {
//				valor+=2;
//				 resultado+=valor;
//			}
//			System.out.println(j +"^3"+ resultado);
//			realizado por alumn
		
			
			
//		}
		
		
		for (int i=1;i<=n;i++) {
			int acumulador=0;
			System.out.print(i + "^3 = ");
			for(int j=1;j<=i;j++) {
				if(j != i) {
				System.out.print(sgteimpar + "+");
				}else
					System.out.print(sgteimpar);
					acumulador+=sgteimpar;
					sgteimpar+=2;
				
			}
			System.out.println(" = " +acumulador);
		}
		

	}

}
