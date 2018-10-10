package ejercicioIniciacion;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		float sueldoBase;
		float comision;
		float sueldo;
		
		Scanner sc =  new Scanner(System.in);
		System.out.println("ingrese sueldo base");
		sueldoBase=sc.nextFloat();
		comision=sueldoBase*0.10f;//se pone la f para que sea de tipo float , sino seria un double por defecto
		sueldo=sueldoBase+comision;
		System.out.println("El sueldo base es : " + sueldoBase + " la comsion es : "+ comision + " El sueldo es final es : " + sueldo);

	}

}
