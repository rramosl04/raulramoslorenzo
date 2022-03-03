package Notas;

public class Notas {
	
	int Notas;
	
	public void Notas(int Notas) {
		
		this.Notas=Notas;
		
	}
	
	public void setNotas(int valor1) {
		
		this.Notas=valor1;
		
	}
	
	public int getNotas() {
		
		return this.Notas;
		
	}
	
	public void mostrar() {
		
		System.out.println("Mi nota es: "+getNotas());
		
	}
}
