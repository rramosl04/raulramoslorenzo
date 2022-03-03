package ClienteBlanco;

public class ClienteBlanco {
	//Atributos
	int numeroCuenta,saldo,deposito;
	String nombreCliente;
	/**
	 * Contructor parametrizado por los atributos
	 * @param numeroCuenta
	 * @param saldo
	 * @param nombreCliente
	 * @param deposito
	 */
	public ClienteBlanco(int numeroCuenta,int saldo, String nombreCliente,int deposito) {
		
		this.numeroCuenta=numeroCuenta;
		this.saldo=saldo;
		this.nombreCliente=nombreCliente;
		this.deposito=deposito;
		
	}
	/**
	 * Constructor parametrizado por los 2 primeros atributos
	 * @param numeroCuenta
	 * @param saldo
	 */
	public ClienteBlanco(int numeroCuenta,String nombreCliente) {
		
		this.numeroCuenta=numeroCuenta;
		this.nombreCliente=nombreCliente;
		
	}
	
	public ClienteBlanco(int deposito,int saldo) {
		
		this.deposito=deposito;
		this.saldo=saldo;
		
	}
	
	public void setNumeroCuenta(int valor1) {
		
		this.numeroCuenta=valor1;
		
	}
	
	public int getNumeroCuenta() {
		
		return this.numeroCuenta;
		
	}
	
public void setSaldo(int valor2) {
		
		this.saldo=valor2;
		
	}
	
	public int getSaldo() {
		
		return this.saldo;
		
	}
	
public void setNombreCliente(String valor3) {
		
		this.nombreCliente=valor3;
		
	}
	
	public String getNombreCliente() {
		
		return this.nombreCliente;
		
	}
	
public void setDeposito(int valor4) {
		
		this.deposito=valor4;
		
	}
	
	public int getDeposito() {
		
		return this.deposito;
		
	}
	
}
