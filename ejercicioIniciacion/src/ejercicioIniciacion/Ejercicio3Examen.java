package ejercicioIniciacion;

import java.util.Scanner;

public class Ejercicio3Examen {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ingrese un numero");
		int n= sc.nextInt();
		if(n<=1) {
			System.out.println("error");
		}else {
			do {
				
				if(n%2==0) {
					n=n/2;
					System.out.println(n);
				}else {
					n=n*3+1;
					System.out.println(n);
				}
			}while(n!=1);
		}

	}

}
