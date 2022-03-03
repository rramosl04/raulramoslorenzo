package todos;

import java.util.Scanner;

public class ejercicio6tema6pag6 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
	String [] nombres = {"","","","","",""};
	
	double [] sueldos = { 1700 , 1900 , 2000 , 2050 , 1000 , 1500 };
	
	String nombreMayor = null;
	double sueldoMayor = 0;
	
	for (int i = 0; i < nombres.length; i++) {
		
		if (sueldos [i] > sueldoMayor) {
			
			nombreMayor = nombres[i];
			sueldoMayor = sueldos[i];
			
			
		}
		

	}
	
	System.out.println(+sueldoMayor +nombreMayor);
	}
}
