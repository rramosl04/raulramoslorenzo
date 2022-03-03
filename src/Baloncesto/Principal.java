package Baloncesto;

public class Principal {
	
	public static void main(String[] args) {

		//Creamos el primer jugador con el constructor por defecto 
		//y utilizamos los set para asignarle el nombre y los putuntos
		
		Jugador j1 = new Jugador () {};
		j1.setNombre_Jugador("Calderon");
		j1.setPuntos_Jugador(50);
		
		//Creamos el segundo jugador con el constructor parametrizado
		
		Jugador j2 = new Jugador("soraya",10);
		
		//utilizamos el metodo creado en la clase jugador para mostrar los datos
		
		j1.resultado_Jugador();
		
		System.out.println("Nombre equipo: " + j1.getNombre_Equipo());
		System.out.println("Los puntos totales de los jugadores son: "+j1.getPuntos_Totales());
	
	}

	
	
	
	
}
