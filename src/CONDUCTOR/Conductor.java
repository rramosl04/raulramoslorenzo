package CONDUCTOR;

public class Conductor {
	
	/**
	 * atributos
	 */
	
	String nombre;
	int añoExperiencia;
	
	
	public Conductor (String nombre,int añoExperiencia) {
		
		this.nombre=nombre;
		this.añoExperiencia=añoExperiencia;
		
	}
	
	public void setNombre(String nombre1) {
		
		this.nombre=nombre1;
		
	}
	
	public void setAñoExperiencia(int añoExperiencia1) {
		
		this.añoExperiencia=añoExperiencia1;
		
	}
	
	public String getNombre() {
		
		return this.nombre;
		
	}
	
	public int getAñoExperiencia() {
		
		return this.añoExperiencia;
		
	}
	
	public void mostrar() {
		
		System.out.println("Mi nombre es: "+nombre);
		System.out.println("tengo "+añoExperiencia+" años de experiencia");
	}

}
	
	
	
	
	

