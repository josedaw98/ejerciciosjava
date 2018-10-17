package ejercicioIniciacion;

import java.util.Scanner;

public class Divisible {

	public static void main(String[] args) {
		int x, y;
		int rest;
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("comprobar si el numero es divisible(s/n)");
		String respuesta = sc.next();
		
		while("si".equalsIgnoreCase(respuesta)) {
			
		System.out.println("escribe el primer numero :");
		x = sc.nextInt();
		
		System.out.println("escribe el segundo numero :");
		y = sc.nextInt();
		
		rest =x % y;
		
		if(rest == 0) {
			System.out.println("el numero : " + x + " ,es divisible por el numero :"  + y );
		}
		else {
			System.out.println("el numero : " + x + " ,no es divisible por el numero :" + y);
			
		}
		System.out.println("comprobar si el numero es divisible(si/no)");
		respuesta = sc.next();
		
		}
	}

}
