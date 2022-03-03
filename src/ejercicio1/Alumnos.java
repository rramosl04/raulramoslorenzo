package ejercicio1;

public class Alumnos {

	public String nombre;
	String apellido; //misma clase mismo paquete
	private int edad;
	protected char inicial_nombre;
	private  double coste_matricula;
	
		
	public Alumnos() {	
	}
	
	public Alumnos(String nombre,String apellido,int edad,char inicial_nombre,double coste_matricula ) {	

		this.nombre=nombre;
		this.apellido=apellido;
		this.edad=edad;
		this.inicial_nombre=inicial_nombre;
		this.coste_matricula=coste_matricula;
	}
	
	//metodos get y set de los atributos que son privados para poder haceder si son privados
	
	public void setEdad(int valor1) {
		
		this.edad=valor1;
	}
	
	public int getEdad() {
		
			return this.edad;
	}
	
public void setcoste_matricula(int valor2) {
		
		this.coste_matricula=valor2;
	}
	
	public double getcoste_matricula() {
		
			return this.coste_matricula;
	}
	
	
	
}
