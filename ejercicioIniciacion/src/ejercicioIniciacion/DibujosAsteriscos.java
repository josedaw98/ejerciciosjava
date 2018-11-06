package ejercicioIniciacion;

public class DibujosAsteriscos {

	static void Volcan(int h) {
		int asteriscos = 2;
		int y = 1;
		int total = (int) Math.pow(2, h) / 2;

		// LA PARTE COMENTADA ES OTRA FORMA DE ELABORARLO
		// int total =1;
		/*
		 * for(int j=0;j<h;j++) { total+=total; }
		 */

		for (int i = 0; i < h; i++) {
			// int espacios=(total/2)-y;
			int espacios = total - (asteriscos / 2);

			for (int j = 0; j < espacios; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < asteriscos; j++) {
				System.out.print("x");
			}
			System.out.println();
			asteriscos += asteriscos;
			y += y;
		}

	}

	static void mosaico(int f, int c) {
		for (int i = 0; i < f; i++) {
//			for(int j=0;j<c;j++) {
//				if((j%2!=0 && i%2==0)||(j%2==0 && i%2!=0)) {
//					System.out.print('*');
//				}else {
//					System.out.print(' ');
//				}
			for (int j = 0; j < c; j++) {

				System.out.print((j % 2 != 0 && i % 2 == 0) || (j % 2 == 0 && i % 2 != 0) ? "*" : " ");
			}
			System.out.println();
		}
	}

	static void tablero(int f, int c, int l) {

		for (int i = 0; i < f; i++) {// numero de filas
			for (int j = 0; j < l; j++) {// para realizar los cuadrados,hay que hacer la lineas del tamaño de l
				for (int z = 0; z < c; z++) {// numero de columnas
					for (int r = 0; r < l; r++) {
						if ((z % 2 != 0 && i % 2 == 0) || (z % 2 == 0 && i % 2 != 0)) {// para saber si poner asterisco
																						// o espacio en blanco
							System.out.print("x");
						} else {
							System.out.print(" ");

						}
					}
				}
				System.out.println();// salto de linea
			}

		}

	}

	static void tablero2(int f, int c, int l) {
		int ctxt = c * l;
		int ftxt = f * l;

		for (int i = 0; i < ftxt; i++) {// numero de filas de texto

			for (int j = 0; j < ctxt; j++) {// numero de columnas de texto
				int ctab = j / l;
				int ftab = i / l;

				if ((ctab % 2 != 0 && ftab % 2 == 0) || (ctab % 2 == 0 && ftab % 2 != 0)) {// para saber si poner asterisco
					// o espacio en blanco
					System.out.print("x");
				} else {
					System.out.print(" ");

				}

			}
			System.out.println();// salto de linea
		}

	}

}
