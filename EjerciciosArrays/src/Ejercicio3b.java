
import java.util.Random;
import java.util.Scanner;

public class Ejercicio3b {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		do {		
		System.out.println("tamaño del vector(entre 10 y 1.000.000)");
		n= sc.nextInt();	
		if(n<11 || n>1000000 ) 
			System.out.println("tamaña no valido(tamaño debe ser entre 1 y 50)");
		}while(n<11 || n>1000000);
		
		int [] vector= new int [n];
		Random r = new Random();
		
		for(int i=0;i<n;i++) { 
			int valor=r.nextInt(201)-100;
			vector[i]=valor;
	}
		
		int suma=0;
		int parcial;

		for(int i=0;i<n;i++) {
			if(vector[i]!=13) {
			suma +=vector[i]; 
			}else {
				parcial=vector[i];
				for(int j=i+1;j<vector.length && j<=i+13;j++) {
					parcial += vector[j];
				}
				if (parcial==7) {
					suma +=parcial;
					i += 13;
				}
			}
		}
			System.out.println(suma);
	}

}