package ejercicioIniciacion;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		float comision1;
		float comision2;
		float comision3;
		final float sueldo=1200;
		final float porcentaje= 0.1f;
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("valor de la venta 1:");
		comision1=sc.nextFloat()*porcentaje;
		
		System.out.println("valor de la venta 2:");
		comision2=sc.nextFloat()*porcentaje;
		
		System.out.println("valor de la venta 3:");
		comision3=sc.nextFloat()*porcentaje;
		
		System.out.printf("sueldo final : " + "%.2f %n" , comision1 + comision2 + comision3 +sueldo);
		
		System.out.println("valor de la venta 1: " +comision1 );
		System.out.println("valor de la venta 2: " +comision2 );
		System.out.println("valor de la venta 3: " +comision3 );

	}

}
