package monedero;

public class Principal {

	public static void main(String[] args) {

		Monedero m1 = new Monedero(500); 
		
		m1.consultarSaldo(0);
		m1.retirar(100);
		m1.ingresar(50);
		m1.consultarSaldo(0);
		m1.retirar(1000);
	}

}
