package Rectangulo;

public class Principal {
	
	public static void main(String[] args) {
	
		Rectangulos rl1 = new Rectangulos(); 


			System.out.println("Nombre de la clase: "+Rectangulos.nombreFigura);
				
			
			System.out.println("El número de rectangulos: "+rl1.obtenerRectangulos());
			
		
			Rectangulos rl2 = new Rectangulos ("Rectangulo 2",2,4,5.6,7.8);
			
			System.out.println("El numero de rectantgulos es: "+rl1.obtenerRectangulos());
			
			
			
			System.out.println("El nombre "+rl2.establecerNombre());
			System.out.println("Las cordenadas x1 y y1 " +rl2.x1 +rl2.y2);
			System.out.println("Las cordenadas x2 y y2 " +rl2.x2 +rl2.y2);
	
	}
	
					
	
	
	}
