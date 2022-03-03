package Asignaturas;

import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		
		
		 Asignatura [] asignatura = new Asignatura[10];
		
		
		 Scanner teclado = new Scanner (System.in);
		 
		 	int m;
		 	
		 	
		 
		 do{
			 System.out.printf("El número 1 es para introducir una asignatura\n"
			 					+ "El número 2 es para Mostrar todas las asignaturas\n"
			 					+ "El número 3 es para buscar una asignatura\n");
			 System.out.println("Introduce uno de los 3 números mencionados anteriormente o inserte 0 para parar.");
			 m=teclado.nextInt();
			 
			 	switch(m) {
			 
			 case 1:
		 
				 System.out.println();
				 
			 break;
			 
			 case 2:
				 
				 System.out.println("");
			 break;
			 
			 case 3:
				 
				 System.out.println("");
			 break; 
		 }
			 
		 }while(m != 0);
		 
		 
				 
}
	public static void introducir(Asignatura[]asignatura) {
		Scanner teclado = new Scanner (System.in);
		
		String nombre,aula;
		int alumnos;
		int contador=1;
		
		if (contador < asignatura.length) {
			
			System.out.println("Inserte el nombre de la asignatura: ");
			nombre=teclado.next();
			asignatura[contador].setNombre(nombre);
			
		}
		
		
	}
}
