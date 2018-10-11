package ejercicioIniciacion;

import java.util.Scanner;

public class ParImapr {

	public static void main(String[] args) {
		float num1; 
		float rest1;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("escribe el primer numero :");
		num1 = sc.nextFloat();
		
		rest1 =num1%2;
		
		if(rest1 == 0) {
			System.out.println("el numero : " + num1 + " es par ");
		}else {
			System.out.println("el numero : " + num1 + " es impar");
		}
		
		

	}

}
