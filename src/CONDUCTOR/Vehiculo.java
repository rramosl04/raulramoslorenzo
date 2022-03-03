package CONDUCTOR;

public class Vehiculo {
	
	/**
	 * atributos
	 */
	
	private String matricula,color;
	private int nPlazas;

	Conductor c1;
	
	/**
	 * metodo por defecto
	 */
	
	public Vehiculo () {}
	
	public Vehiculo (String matricula,String color,int nPlazas) {
		
		this.matricula=matricula;
		this.color=color;
		this.nPlazas=nPlazas;
		
	}
	
	public Vehiculo (String matricula,String color,int nPlazas,Conductor c1) {
		
		this.matricula=matricula;
		this.color=color;
		this.nPlazas=nPlazas;
		this.c1.nombre=c1.nombre;
		
	}

	public void setMatricula(String matricula1) {
		
		this.matricula=matricula1;
		
	}
	
	public void setColor(String valor) {
		
		this.color=valor;
		
	}
	
	public void setNPlazas(int NPlazas1) {
		
		this.nPlazas=NPlazas1;
		
	}
	
	
	public String getMatricula() {
		
		return this.matricula;
		
	}
	
	public String getColor() {
		
		return this.color;
		
	}
	
	public int getNPlazas() {
		
		return this.nPlazas;
		
	}
	
	public void mostrar() {
		
		System.out.println("La matricula es: "+this.matricula);
		System.out.println("El color es: "+this.color);
		System.out.println("El Número de plazas en el coche es de: "+this.nPlazas);
		
	}
	
	
	
	
	
}
