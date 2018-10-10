package ejercicioIniciacion;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		float exam1 , exam2 , exam3 , examf , tclase , notamedia;
		float n_final;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("nota primer examen :");
		exam1 = sc.nextFloat();
		
		System.out.println("nota segundo examen :");
		exam2 = sc.nextFloat();
		
		System.out.println("nota tercer examen :");
		exam3 = sc.nextFloat();
		
		notamedia = (exam1 + exam2 + exam3) / 3;
		
		System.out.println("nota examen final :");
		examf = sc.nextFloat();
		
		System.out.println("nota tabrajo clase :");
		tclase = sc.nextFloat();
		
		n_final = ((notamedia * 0.55f) + (examf * 0.35f) + (tclase * 0.15f));
		
		System.out.printf("tu nota final es :" + "%.2f %n" , n_final);

	}

}
