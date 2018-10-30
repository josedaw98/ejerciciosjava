package ejercicioIniciacion;

public class DibujosAsteriscos {
	
	static void Volcan(int h) {
		int asteriscos=2;
		int y=1;
		int total=(int)Math.pow(2, h)/2;
		
		
		//LA PARTE COMENTADA ES OTRA FORMA DE ELABORARLO
		//int total =1;
		/*for(int j=0;j<h;j++) {
			 total+=total;
		}*/
		
		for(int i=0;i<h;i++) {
			//int espacios=(total/2)-y;
			int espacios=total-(asteriscos/2);
			
			for(int j=0;j<espacios;j++) {
				System.out.print(" ");
			}
			for(int j=0;j<asteriscos;j++) {
				System.out.print("x");
			}
			System.out.println();
			asteriscos+=asteriscos;
			y+=y;
		}

	}
	
	 static void mosaico(int f, int c) {
		for(int i=0;i<f;i++) {
//			for(int j=0;j<c;j++) {
//				if((j%2!=0 && i%2==0)||(j%2==0 && i%2!=0)) {
//					System.out.print('*');
//				}else {
//					System.out.print(' ');
//				}
			for(int j=0;j<c;j++) {
			
					System.out.print((j%2!=0 && i%2==0)||(j%2==0 && i%2!=0)?"*":" ");
			}
			System.out.println();
		}
	}
	 
	 static void tablero(int f , int c) {
		 
		 
	 }
	
}
