import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s1,s2;

	do {	
		System.out.println("Escribe la primera cadena");
		 s1= sc.nextLine();
	}while(s1.length()==0);
	
	do {
		System.out.println("Escribe  la segundacadena");
		 s2=sc.nextLine();
	}while(s2.length()==0 || s2.length()>s1.length());
	int i=-0;
	int c =0;
		do {
		
			i = s1.indexOf(s2,i);
			if(i>=0) {
				i++;
				c++;
			}
		}while(i >=0 );
		
		System.out.println("la SEGUNDA CADENA ESTA CONTENIDA = "+ c + " VECES EN LA PRIMERA");
		
	
		
	

	}

}
