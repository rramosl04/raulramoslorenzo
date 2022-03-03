package Baloncesto;

public class Jugador {
	
	//realiza una aplicacion que tenga 2 clases la primera clase se llamara jugador y 
	//tendra los siguientes atributos: el nombre del equipo que solo sera accesible desde la clase 
	// y que tomara el valor moraloCB, nombre del jugador  que solo es accesible desde la clase, puntos del jugador
	//que solo es accesible desde la clase y puntos totales del equipo que sera accesible desde el paquet:
	//los metodos que tendra la clase jugador son: el constructor pro defecto el contructor parametrizado con los 
	//atributos que creamos necesario y los set y get que creamos que son necesarios ademas tambien tendremos un metodo
	//resultado jugador que imprima por pantalla el nombre del jugador y los puntos que lleve dicho jugador la otra clase
	//equipo en esta clase crearemos 2 jugadores el primer jugador se creara con el constructor por defecto 
	//y se el asignara el nombre calderon y 50 puntos el segundo jugador se creara llamadno al constructor parametrizado
	//y el nombre sera soraya con 10 puntos mostrar por pantalla los datos del primer jugador el nomrbre del equipo y 
	//los puntos totales del equipo
	
	
	private static final String nombre_Equipo="MoraloCB";
	private String nombre_Jugador;
	private int puntos_Jugador;
	static int puntos_Totales;

		public Jugador () {}
	
		
		public Jugador (String nombre_Jugador, int puntos_Jugador) {
			
			this.nombre_Jugador=nombre_Jugador;
			this.puntos_Jugador=puntos_Jugador;
			puntos_Totales += puntos_Jugador;
			
		}
	
		
		
	
		
		public void setNombre_Jugador(String valor1) {this.nombre_Jugador=valor1;}

		public String getNombre_Jugador() {return this.nombre_Jugador;}
		
		public void setPuntos_Jugador(int valor2) {this.puntos_Jugador=valor2;}

		public int getPuntos_Jugador() {return this.puntos_Jugador;}
		

		public String getNombre_Equipo() {return this.nombre_Equipo;}

		public void setPuntos_Totales(int valor4) {this.puntos_Totales=valor4;}

		public int getPuntos_Totales() {return this.puntos_Totales;}
		
		public void resultado_Jugador (){
			System.out.println("Nombre del jugador: " + this.nombre_Jugador);
			System.out.println("Puntos del jugador: " + this.puntos_Jugador);
		}
			
}
