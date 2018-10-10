package ejercicioIniciacion;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		double ingreso;
		double saldo;
		double beneficio;
		double porcentage =0.02;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("escriba la cantidad a añadir");
		ingreso = sc.nextDouble();
		saldo=ingreso*(1+porcentage);
		beneficio = ingreso*porcentage;
		System.out.println("usted ingreso = " + ingreso + "€" + ", su saldo actual es = " + saldo + "€" + "ha obtenido unos beneficios por valor de = " + beneficio + "€");

	}

}
