package ejercicioIniciacion;

import java.util.Random;


public class CompararNumeros {

	public static void main(String[] args) {
		
		Random r = new Random();
		int num1 = r.nextInt(1000);
		int num2 = r.nextInt(1000);
		
		System.out.println("numero 1 es: " + num1);
		System.out.println("numero 2 es: " + num2);
		
		if(num1 > num2 ) {
			System.out.println("numero mayor es :" + num1 +" " +"numero menor es :" + num2 );
			
		}else if(num1 <num2) {
			System.out.println("numero mayor es :" + num2 +"numero menor es :" + num1 );

		}else {
			System.out.println("Los numeros son iguales");
		}
		
		
		
		
	

		
		
		
	}

}
