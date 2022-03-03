package ordenador;

public class Principal {

	/**
	 * Main con los 3 objetos
	 * @param args
	 */
	
	public static void main(String[] args) {

		PC d1 = new PC ("Maremostrum");
		PC d2 = new PC ("Selene");
		PC d3 = new PC ("HPC5");
		
		
		d1.mostar();
		d2.mostar();
		d3.mostar();
		
		
	}

}
