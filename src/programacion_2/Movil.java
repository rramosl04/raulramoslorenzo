package programacion_2;
public class Movil {

	String marca;
	int modelo;
	
	public Movil(){	
	}
	public Movil(String marca, int modelo) {
	
	this.marca=marca;
	this.modelo=modelo;
	}
	
	public void llamada() {
		
		System.out.println("Iniciando llamada de "+this.marca+" "+this.modelo);
		System.out.println("Finalizando llamada de "+this.marca+" "+this.modelo);
	}
}
