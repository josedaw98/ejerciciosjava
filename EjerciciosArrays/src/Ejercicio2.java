import java.util.Random;
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int n;
		do {		
		System.out.println("tamaño del vector(entre 10 y 1.000.000)");
		n= sc.nextInt();	
		if(n<11 || n>=1000000 ) 
			System.out.println("tamaña no valido(tamaño debe ser entre 1 y 50)");
		}while(n<11 || n>=1000000);
		
		int [] vector= new int [n];
		Random r = new Random();
		
		for(int i=0;i<n;i++) { 
			int valor=r.nextInt(2000000)-999999;
			do {
				valor=r.nextInt(2000000)-999999;
			vector[i]=valor;
			}while(repetidos(vector,valor,i-1));

	}
		
		long to=System.nanoTime();
		int mayor= vector[0];
		int menor=vector[0];
		
		
		for(int i=0;i<vector.length;i++) {
			if(mayor<vector[i]) {
				mayor=vector[i];
			}
			if(menor>vector[i]) {
				menor=vector[i];
			}
			
			
		}	
		long t1=System.nanoTime();
			
			System.out.println(" el numero mayor del vector es= " +mayor);
			System.out.println(" el numero menor del vector es= " +menor);
			System.out.println("diferencia entre mayor y menor= "+ (mayor-menor));
			
	
		
//		for(int i=0;i<n;i++) { 
//			System.out.print(vector[i]+ "  ");
//			
//	}
		
		
		tiempotranscurrido(t1-to);

	
	
	
	
	
	
	}
	
	static boolean repetidos(int [] vector, int valor, int p) {
		for(int i=0;i<=p;i++) {
			if(vector[i] == valor) {
				return true;
			}
			
		}
		return false;
	}
	
	
	static void tiempotranscurrido(long t) {
		long min=t / 60000000000L;
		
		t = t%60000000000L;
		
		long s= t/1000000000L;
		
		t = t % 1000000000L;
		
		System.out.println("duracion "+min+" min "+s+" s "+t +" ns ");
	}

}
