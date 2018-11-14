import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nif");
		String dni = sc.nextLine();
		int p_num= ;
		char letra_dni = (char) dni.length();
		String c = "trwagmyfpdxbnjzsqvhlcke";
		int v = p_num % 23;
		char letra = c.charAt(v);
		System.out.println(p_num);
		if(letra==letra_dni) {
			System.out.println("el dni= "+ dni+ "es valido");
		}else {
			System.out.println("el dni= "+ dni+ " no es valido");
		}

	}

}
