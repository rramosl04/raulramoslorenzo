package ClienteBlanco;

public class Principal {
	
	public static void main(String[] args) {
	
	ClienteBlanco v1 = new ClienteBlanco(524145215,10000,"Pablo",5000); 

	System.out.println("Mi número de cuenta es: "+v1.numeroCuenta );
	System.out.println("Mi saldo es: "+v1.saldo);
	System.out.println("Me llamo: "+v1.nombreCliente);
	System.out.println("Ingreso: "+v1.deposito);
	
	
	ClienteBlanco v2 = new ClienteBlanco(112,"Pedro Moreno");{
		
		System.out.println("Mi número de cuenta es: "+v2.numeroCuenta);
		System.out.println("Mi nombre es: "+v2.nombreCliente);
		
	}	
	
	ClienteBlanco v3 = new ClienteBlanco(10000,50000); {
		
			System.out.println("Tengo un saldo de:" +v3.saldo);
			System.out.println("Voy a depositar: "+v3.deposito);
	}
	}
	
	}
	

