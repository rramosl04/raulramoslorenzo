package Asignaturas;

public class Asignatura{

		//ejercicio1tema6pag7
		
		private String nombre,aula;
		private int NumeroAlumnos;
		
		public Asignatura(String nombre, String aula, int NumeroAlumnos) {
			
			this.nombre=nombre;
			this.aula=aula;
			this.NumeroAlumnos=NumeroAlumnos;
			
		}
	
		public void setNombre(String valor1) {
			
			this.nombre=valor1;
			
		}
		
		public void setAula(String valor2) {
			
			this.aula=valor2;
			
		}
		
		public void setNumeroAlumnos(int valor3) {
			
			this.NumeroAlumnos=valor3;
			
		}
		
		public String getNombre() {
			
			return this.nombre;
			
		}
		
		public String getAula() {
			
			return this.aula;
			
		}
		
		public int getNumeroAlumnos() {
			
			return this.NumeroAlumnos;
			
		}
		
		
		public void mostrar() {
			
			System.out.println("El nombre de la asignatura es:"+getNombre());
			System.out.println("el aula es: "+getAula());
			System.out.println("Tiene un número de alumnos de:" +getNumeroAlumnos());
		}
}
