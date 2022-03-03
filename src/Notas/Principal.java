package Notas;

import java.util.Scanner;

public class Principal {

	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		double [] N= new double[10];
		int num;
		
		
		do {
			
			
			System.out.println("En este programa hay varia opciones.");
			System.out.println("Si introduces el número '1' Mostrara todas las notas.");
			System.out.println("Si introduces el número '2' Ordena de mayor a menor las notas." );
			System.out.println("Si introduces el número '3' Busca una nota.");
			System.out.println("Si introduces el número '4' Muestra la media de las notas");
			System.out.println("Si introduces el número '5' Muestra el número de aprobados");
			System.out.println("Si introduces el número '6' La nota mas alta");
			
			System.out.println("Al introducir '0' el programa dejara de ejecutarse");
			
			
			System.out.println("Introduce un número: ");
			num=teclado.nextInt();
			
			switch(num) {
				case 1:mostrarNota(N);
				break;
			}
		
		}while(num != 0);
	}

	public static void Notas(double [] N) {
		
		Scanner teclado = new Scanner (System.in);
		
		
		int i=0;
		while( i >= N.length) {
			
			System.out.println("Introduce las notas");
			N[i] = teclado.nextDouble();
			
			if(N[i] >=0 && N[i] <= 10 ) {
				System.out.println("Nota introducida: " + N[i]);
				i++;
		}
			else {
				System.out.println("Nota no permitida.");
				
			}
	}
	
}
	
	public static void mostrarNota(double [] N) {
		for(int i=0;i<N.length;i++) {
		System.out.println(N[i]);}
		
	}
	
	
	
	
	
	
	
	
	}
