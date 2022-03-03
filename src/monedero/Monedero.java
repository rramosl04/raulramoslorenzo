package monedero;

public class Monedero {
	
	double saldo;
	
	public Monedero() {}
	
	public Monedero(double saldoinicial) {
		
		this.saldo=saldoinicial;
		
	}
	
	public void ingresar (double dineroI) {
		
		this.saldo+=dineroI;
		
	}
	
	public void  retirar(double dineroS) {
		
	if (dineroS >= 0)	{ this.saldo-=dineroS; }
		 
	else {System.out.println("Cantidad no admitida");}
		
		
	}
	
	public void consultarSaldo(double dineroC) {System.out.println("El saldo actual es: "+this.saldo);}
	

}
