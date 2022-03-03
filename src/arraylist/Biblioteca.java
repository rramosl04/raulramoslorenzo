package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {


	public static void main(String[] args) {

		
		Scanner teclado = new Scanner(System.in);
		
		ArrayList<Libros> libros = new ArrayList <Libros>();
		
		int N;
		
		do {
			
		System.out.println("Para insertar un nuevo libro introduzca un '1'");
		System.out.println("Para ver la disponibilidad de un libro introduzca un '2'");
		System.out.println("Para devover un libro presado introduzca un '3'");
		System.out.println("Para ver los libros de los que dispone la biblioteca introduzca 4'");
		System.out.println("para salir de la aplicacion introduzca '0'");
		N = teclado.nextInt();
		
		teclado.nextLine();

			switch(N) {
			
			case 1: Libros.introducirLibro(libros);
				break;
			case 2: Libros.prestarLibro(libros);
				break;
			case 3:
				break;
			case 4:
				break;
			
			}
			
		}while(N != 0);
		
	}

	
	
}
