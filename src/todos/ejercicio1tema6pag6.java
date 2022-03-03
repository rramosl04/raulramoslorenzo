package todos;

import java.util.Scanner;

public class ejercicio1tema6pag6 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner teclado = new Scanner (System.in);
		
		//String nom;
		
		
		
String [] nombre = new String [5];

for (int i = 0 ; i < nombre.length; i++) {
	System.out.println("Introduce nombre: ");
		//nom=teclado.nextLine();
		nombre [i] = teclado.nextLine();
}

for (int i=0; i<nombre.length;i++) {
	
	System.out.println(nombre[i]);
	
}

	

	}

}
