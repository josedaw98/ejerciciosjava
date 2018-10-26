package ejercicioIniciacion;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la medida de un lado ");
		float lado1=sc.nextFloat();
		
		System.out.println("Escribe la medida de un lado ");
		float lado2=sc.nextFloat();
		
		System.out.println("Escribe la medida de un lado ");
		float lado3=sc.nextFloat();
		
		if(lado1<lado2+lado3 && lado2<lado1+lado3 && lado3<lado1+lado2) {
			System.out.println("se puede formar el triangulo");
			if(lado1 ==lado2 && lado1==lado3) {
				System.out.println("el triangulo es equilatero");
			}else if(lado1!=lado2 && lado1!=lado3 &&lado2!=lado3 ) {
				System.out.println("el triángulo es escaleno");
			}else {
				System.out.println("el triángulo es isosceles");
			}
		}else {
			System.out.println("no se puede formar el triángulo");
		}

	}

}
