package matriz;

import java.util.Scanner;

public class ejercicio2_matriz {

	public static void main(String[] args) {

Scanner teclado = new Scanner (System.in);
		
		char N;
		 
		int contador=0;
		
		char Matriz [] []  = {{'A','B','C','D','E','C'},
							 {'F','G','H','I','J','V'},
							 {'K','L','M','Ñ','O','B'},
							 {'P','Q','R','S','T','A'},
							 {'U','V','W','X','Y','Z'}};
		
		System.out.println("Introduce la inicial en concreto");
		N = teclado.next().charAt(0);
		
		for (int i = 0; i < Matriz.length;i++) {
			
			for(int j = 0; j < Matriz[0].length; j++) {
				
				switch(Matriz[0].length) {
				
				case 'A': contador++;
				break;
				} 
				
				}
				
			}
			
		}
		
	}

}
