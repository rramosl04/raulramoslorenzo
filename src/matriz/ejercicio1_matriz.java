package matriz;

import java.util.Scanner;

public class ejercicio1_matriz {

	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		String N;
		
		
		String Matriz [] []  = {{"Mesa","Vitrina","Estanteria","C�modo"},
								{"Silla","S�fa","Cuna","Sill�n"},
								{"Lampara","Cama","Mesilla","Biombo"},
								{"Armario","Mecedora","Div�n","Trnchete"}};
		
		for (int i=0; i < Matriz.length; i++) {
			
			

		
		for (int j = 0; j < Matriz[0].length; j++) {
			
			
			System.out.print(Matriz[i][j]+ " ");

		}
		System.out.println();
		}
		
	}

}
