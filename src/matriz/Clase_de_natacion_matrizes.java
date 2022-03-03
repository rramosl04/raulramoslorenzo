package matriz;

import java.util.Scanner;

public class Clase_de_natacion_matrizes {

	/**
	 * Metodo main con el menú echo con un do - while y un shitch - case
	 * @param args
	 */
	
	public static void main(String[] args) {

		Scanner teclado = new Scanner (System.in);
		
		int  Matriz [][]  =  {{15,19,20,12},
							{16,14,12,11},
							{17,20,11,10},
							{11,12,13,18},
							{18,19,20,19}};
		
		
		int N1;
		
		
		do {
			
			System.out.println("Para mostrar los valores almacenados inserte '1'");
			System.out.println("Para mostrar el total de alumnos por dia inserte '2'");
			System.out.println("Para mostrar el total de alumnos por hora inserte '3'");
			System.out.println("Para mostrar la media de los alumnos por dia inserte '4'");
			System.out.println("Para mostrar un número determinado de alumnos inserte '5'");
			
			System.out.println("Para parar inserta '0'");
			N1 = teclado.nextInt();
			
			switch(N1){
			
			case 1: mostrar(Matriz);
				break;
			case 2: totalAlumnos(Matriz);
				break;
			case 3: totalHoras(Matriz);
				break;
			case 4: mediaHoras(Matriz);
				break;
			case 5: //falta 
				break;
			}
		}while(N1 != 0); {}
		
	}

	
	/**
	 * Metodo mostrar para en caso 1 del menú nos mostrara los valores almacenados en el array por dia 
	 * y el total de los números del array
	 * @param Matriz
	 */
	public static void mostrar(int [][] Matriz) {

		int sum = 0;

		System.out.println();



		System.out.printf(" Lunes:    "  +Matriz[0][0]+ " "+Matriz[0][1] +" "+Matriz[0][2]+" " +Matriz[0][3]);
		System.out.printf("\n Martes:   "+Matriz[1][0]+ " "+Matriz[1][1] +" "+Matriz[1][2]+" " +Matriz[1][3]);
		System.out.printf("\nMiercoles: "+Matriz[2][0]+ " "+Matriz[2][1] +" "+Matriz[2][2]+" " +Matriz[2][3]);
		System.out.printf("\n Jueves:   "+Matriz[3][0]+ " "+Matriz[3][1] +" "+Matriz[3][2]+" " +Matriz[3][3]);
		System.out.printf("\n Viernes:  "+Matriz[4][0]+ " "+Matriz[4][1] +" "+Matriz[4][2]+" " +Matriz[4][3]);

		System.out.println();

		System.out.println();
		
		for (int i=0; i < Matriz.length; i++) {
			
			for (int j = 0; j < Matriz[0].length; j++) {
		
		
				sum += Matriz[i][j];  
		
						
			}
			
		}				
		System.out.println("El total de alumnos es: "+sum);
		
		System.out.println();


		}
	
	/**
	 * Metodo total de alumnos suma el total de los alumnos por fila y los muestra 
	 * @param Matriz
	 */
	
	public static void totalAlumnos(int [][] Matriz) {
		
		int sum1 = 0,sum2 = 0,sum3 = 0,sum4 = 0,sum5 = 0;

		
		for (int i = 0; i < 4; i++) {
			
			sum1 += Matriz[0][i];
			sum2 += Matriz[1][i];
			sum3 += Matriz[2][i];
			sum4 += Matriz[3][i];
			sum5 += Matriz[4][i];
		}
		
		System.out.println("El total de alumnos por dia es:");

		
		System.out.println("Lunes: " +sum1);
		System.out.println("Martes: " +sum2);
		System.out.println("Miercoles: " +sum3);
		System.out.println("Jueves: " +sum4);
		System.out.println("Viernes: " +sum5);

	}
		
	/**
	 * Metodo total de alumnos por hora suma los alumnos por columnas y los va mostrando hasta que las columnas son inferiores a 5
	 * @param Matriz
	 */
	
		public static void totalHoras(int [][] Matriz) {
			
			int sum1 = 0,sum2 = 0,sum3 = 0,sum4 = 0,sum5 = 0;
			
			for (int i = 0; i < 5; i++) {
				
				sum1 += Matriz[i][0];
				sum2 += Matriz[i][1];
				sum3 += Matriz[i][2];
				sum4 += Matriz[i][3];
				
			}
			
			System.out.println("Total de alumnos en la primera hora: "+sum1);
			System.out.println("Total de alumnos en la segunda hora: "+sum2);
			System.out.println("total de alumnos en la tercera hora: "+sum3);
			System.out.println("Total de alumnos en la cuarta  hora: "+sum4);
		}
		
		/**
		 * Metodo para hacer la media de las horas coge las columnas del array las suma y lo divide por 5 que son los dias que hay clase
		 * @param Matriz
		 */
		
		public static void mediaHoras(int [][] Matriz) {
			
			

			double sum1 = 0,sum2 = 0,sum3 = 0,sum4 = 0,sum5 = 0;
			
			for (int i = 0; i < 5; i++) {
				
				sum1 += Matriz[i][0];
				sum2 += Matriz[i][1];
				sum3 += Matriz[i][2];
				sum4 += Matriz[i][3];
				
				
			}
			sum1 /= 5;
			sum2 /= 5;
			sum3 /= 5;
			sum4 /= 5;
			
			System.out.println("La media de alumnos la primera hora: "+sum1);
			System.out.println("La media de alumnos la segunda hora: "+sum2);
			System.out.println("La media de alumnos la tercera hora: "+sum3);
			System.out.println("La media de alumnos la cuarta  hora: "+sum4);
			System.out.println();
		}
		
		/**
		 * Metodo mostrar las horas y los dias introducido por teclado en el que hay un número determinado de alumnos
		 * @param Matriz
		 */
		
			public static void mostrarHoras(int [][] Matriz) {
				
				// No me ha dado tiempo a hacerle 
				
			}
			
		}
		
	

