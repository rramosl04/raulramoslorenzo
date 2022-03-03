package ordenador;

public class PC {
	
	/*
	 * atributos 
	 */
	
	public String identificador;
	public static int num_max =15;
	public static int num_actual=0;
	
	/**
	 * contructor por defecto
	 */
	 
	public PC() {}
	
	/**
	 *  Constructor con parametro identificador
	 * @param identificadorEquipo
	 */
	
	public PC (String identificadorEquipo) {
		
		this.identificador=identificadorEquipo;
		
	}
	
	/**
	 * metodos set y get 
	 * @param valor1
	 */

	public void setIdentificador(String valor1) {this.identificador=valor1;}
	
	public String getIdentificador() { return this.identificador;}
	
	/**
	 * Metodo mostrar 
	 */
	
	public void mostar () {	
		
	
		System.out.println("identificador: "+this.identificador);
		System.out.println("Número Maximo: "+this.num_max);
		System.out.println("Número Actual: "+this.num_actual);
		
	
	}

		

	
}
