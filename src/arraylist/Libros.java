package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class Libros {

	
		private static String ISBN;
		private  String titulo;
		private String autor;
		private boolean estado;
		
		public Libros() {
			
			
			
		}
		
		public Libros(String ISBN,String titulo,String autor,boolean estado) {
			
			this.ISBN=ISBN;
			this.titulo=titulo;
			this.autor=autor;
			this.estado=estado;
			
			
		}
		
		public void setISBN(String valor1) { this.ISBN=valor1; }
		
		public void setTitulo(String valor2) { this.titulo=valor2; }
		
		public void setAutor(String valor3) { this.autor=valor3; }
		
		public void setEstado(boolean valor4) { this.estado=valor4; }
		
		
		
		public String getISBN() { return this.ISBN; }
		
		public String getTitulo() { return this.titulo; }
		
		public String getAutor() { return this.autor; }
		
		public boolean getEstado() { return this.estado; }
	
		public static  void introducirLibro(ArrayList<Libros> libros) {
			
			Scanner teclado = new Scanner(System.in);

			System.out.println("Introduce el ISBN del libro");
			String ISBN = teclado.next();
			
			System.out.println("Introduce el titulo del libro");
			String titulo = teclado.next();
			
			System.out.println("Introduce el Autor del libro");
			String autor = teclado.next();
			
			libros.add(new Libros(ISBN,titulo,autor,true));
			
			System.out.println("Libro introducido con exito");
			
		}
		
		public static void prestarLibro(ArrayList<Libros> libros) {
			Scanner teclado = new Scanner(System.in);

			String isbn;
			
			System.out.println("introduce el nombre titulo del libro");
			isbn = teclado.next();
			
			for(int i = 0; i < libros.size(); i++) {
				
				if (ISBN.equals(isbn)) {
					
					System.out.println("Libro disponible");
					
					
				}
				
			}
			
				
				
		}
		
}

