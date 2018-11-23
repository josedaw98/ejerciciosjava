import java.util.Random;
import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t;
		do {
			System.out.println("tamaño vector");
			t = sc.nextInt();
			if (t < 2 || t > 20) {
				System.out.println("el numero no es valido");
			}
		} while (t < 2 || t > 20);

		int[] vector = new int[t];

		Random r = new Random();

		for (int i = 0; i < t; i++) {
			int valor = r.nextInt(201) - 100;
			vector[i] = valor;

		}
		
		
		int anterior = vector[0];
		int diferencia = 10000;
		for (int i = 1; i < vector.length; i++) {
			if (diferencia > (Math.abs(anterior) - Math.abs(vector[i]))) {
				diferencia = anterior - vector[i];
				anterior = vector[i];
			}
			anterior = vector[i];
			System.out.print(vector[i-1]);
			System.out.print(" ");
			
			
	
			
		}
		System.out.println(vector[t-1]);
		System.out.println();
		System.out.print("la menor diferencia es  "+diferencia);

	}

}
