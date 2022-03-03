package personas;

public class Personas {

	String nombre,genero;
	int edad,idPersonas;
	
		public Personas () {
		}
		public Personas(int edad, String nombre,int idPersonas,String genero ) {
			
			this.edad=edad;
			this.nombre=nombre;
			this.idPersonas=idPersonas;
			this.genero=genero;
		}
	
		public void setIdPersonas(int valor) {
			
			 this.idPersonas=valor;
		}
		
		public int getIdPersonas() {
			return this.idPersonas;
			
		}
		
		public void setEdad(int valor) {
			this.edad=valor;
		}
		
		public int getEdad() {
			
			return this.edad;
		}

		public void setNombre (String valor) {
			
			this.nombre=valor;
		}
		
		public String getNombre () {
			
			return this.nombre;
		}
		
		public void setGenero(String valor) {
			
			this.genero=valor;
		}
		
		public String getGenero () {
			
			return this.genero;
		}

}
