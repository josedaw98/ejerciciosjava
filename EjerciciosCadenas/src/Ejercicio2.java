import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la cadena");
		String cadena= sc.nextLine();
		
		
		for (int x=cadena.length()-1;x>=0;x--) {
			    System.out.print(cadena.charAt(x));
	}
	
	}
}
