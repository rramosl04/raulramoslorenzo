package CONDUCTOR;

public class Principal {

	public static void main(String[] args) {
		
		Vehiculo v2 = new Vehiculo ();
		Conductor v3 = new Conductor ("Feliz",4);
		Vehiculo v1 = new Vehiculo ("GASD-SDF","verde",4);
		
		v3.mostrar();
		v1.mostrar();
	}

}
