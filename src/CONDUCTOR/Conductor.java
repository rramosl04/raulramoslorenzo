package CONDUCTOR;

public class Conductor {
	
	/**
	 * atributos
	 */
	
	String nombre;
	int a�oExperiencia;
	
	
	public Conductor (String nombre,int a�oExperiencia) {
		
		this.nombre=nombre;
		this.a�oExperiencia=a�oExperiencia;
		
	}
	
	public void setNombre(String nombre1) {
		
		this.nombre=nombre1;
		
	}
	
	public void setA�oExperiencia(int a�oExperiencia1) {
		
		this.a�oExperiencia=a�oExperiencia1;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public int getA�oExperiencia() {
		
		return this.a�oExperiencia;
		
	}
	
	public void mostrar() {
		
		System.out.println("Mi nombre es: "+nombre);
		System.out.println("tengo "+a�oExperiencia+" a�os de experiencia");
	}

}
	
	
	
	
	

