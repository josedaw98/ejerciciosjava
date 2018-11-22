import java.util.Scanner;

public class Ejercicio4 {
	static String c = "trwagmyfpdxbnjzsqvhlcke";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escribe tu nif");
		String dni = sc.nextLine();
		
		if(ValidarDni(dni)) {
			System.out.println("el dni es valido");
		}else {
			System.out.println("el dni no es valido");
		}
	}
	
	static boolean ValidarDni(String nif) {
		int numero=Integer.parseInt(nif.substring(0, nif.length()-1));
		char letra= nif.toLowerCase().charAt(nif.length()-1);
		int i=numero%23;
		return(letra == c.charAt(i));
	
	}
	

}
