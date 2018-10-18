package ejercicioIniciacion;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("¿cuantos numeros de la serie quieres obtener?");
		
		int n= sc.nextInt();
		
		int numero1 = 1;
		int numero2 =0;
		
		for(int i=0; i<=n;i++)
		{
			numero1=numero1+numero2;
			System.out.println(numero1);
			numero2=numero1;
			
			
		}
	}

}
