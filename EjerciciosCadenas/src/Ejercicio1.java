import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe la cadena");
		String cadena = sc.nextLine().toLowerCase();

		int cont_a = 0;
		int cont_i = 0;
		int cont_e = 0;
		int cont_o = 0;
		int cont_u = 0;

		for (int i = 0; i < cadena.length(); i++) {
			char c = cadena.charAt(i);
			if (c == 'a' || c == 'á') {
				cont_a++;
			} else if (c == 'e' || c == 'é') {
				cont_e++;
			} else if (c == 'i' || c == 'í') {
				cont_i++;
			} else if (c == 'o' || c == 'ó') {
				cont_o++;
			} else if (c == 'u' || c == 'ú' || c == 'ü') {
				cont_u++;
			}

		}

		System.out.println(" numero de letras a =" + cont_a + " numero de letras e =" + cont_e + " numero de letras i ="
				+ cont_i + " numero de letras o =" + cont_o + " numero de letras u =" + cont_u);

	}

}
