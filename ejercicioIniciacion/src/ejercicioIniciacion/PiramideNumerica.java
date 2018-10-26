package ejercicioIniciacion;

import java.util.Scanner;

public class PiramideNumerica {

	public static void main(String[] args) {
		
		for(int i=1;i<10;i++) {
			int n =i%10;
			int espacios= 10-i;
			int digitos=i+i-1;
			
			for(int j=0 ;j<espacios;j++) {
				System.out.print(" ");
			}
			for(int j=0; j<digitos;j++) {
				if(j>=digitos/2) {
				
						System.out.print(n--%10);
					
				
				}	
				else if(j<=digitos/2) {
					
				
					System.out.print(n++%10);
					
				}
				
			}
			


			
			 
			System.out.println("");
			
		}
	

	}

}

