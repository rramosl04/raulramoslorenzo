package asignatura;

public class asignatura {

	String nombre;
	int horas,codigo;
	
	public asignatura(){	
	}
	
	public asignatura(String nombre,int horas,int codigo){
		
		this.codigo=codigo;
		this.horas=horas;
		this.nombre=nombre;
		
	}
	
	public void setCodigo(int valor) {
		this.codigo=valor;
		
	}
	
	public int getCodigo() {
		
		return this.codigo;
	}
	
	public void setHoras(int valor) {
		
		this.horas=valor;
	}
	
	public int getHoras(int valor) {
		
		return this.horas;
	}
	
	public void setNobre(String valor) {
		
		this.nombre=valor;
	}
	
	public String getNombre(String valor) {
		
		return this.nombre;
	}
	
	public  void imprime() {
		
		
	}
}
