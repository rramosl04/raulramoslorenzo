package GUARDERIA;

public class Guarderia {
	
	private static double PrecioMinimo = 120;
	private double precio;
	private String nombre;
	private String contraseña;
	private static int NumeroTotal = 0;
	
	public Guarderia(String nombre,int calcular,double PrecioMinimo,double precio,String contraseña,int NumeroTotal) {
		this.PrecioMinimo=PrecioMinimo;
		this.precio=calcular();
		this.nombre=nombre;
		this.precio=precio;
		this.contraseña=contraseña;
		this.NumeroTotal=NumeroTotal;
		
		
		NumeroTotal++;

	}
	
	public Guarderia() { NumeroTotal++;}
	
	public void setPrecio(double valor1) { this.precio=valor1;}
	
	public void setNombre(String valor2) { this.nombre=nombre;}
	
	public void setContraseña(double valor3) { this.contraseña=contraseña;}
	
	public void setNumeroTotal(double valor4) { this.NumeroTotal=NumeroTotal;}
	
	public void setPrecioMinimo(double valor5) { this.PrecioMinimo=PrecioMinimo;}
	
	public double getPrecio() {return this.precio;}
	
	public String getNombre() {return this.nombre;}
	
	public int getContraseña() {return this.contraseña;}
	
	public int getNumeroTotal() {return this.NumeroTotal;}
	
	public double getPrecioMinimo() {return this.PrecioMinimo;}
	
	public void contraseña () {
		
		
		
	}
	
	
	public double calcular() {
	
		
		
	
		if (NumeroTotal >= 0 && NumeroTotal < 4 ) {
			
			System.out.println("El precio es de 200 "); 
			
			precio = 200;
			
		}
		
		 else if (NumeroTotal >=4 && NumeroTotal < 7) {
			 
			 System.out.println("El precio es de 180 "); 
			 
			precio = 180;
			 
		 }
		
		 else if (NumeroTotal >= 7 && NumeroTotal <=10) { 
			 
			 System.out.println("El precio es :" +PrecioMinimo); 
			 
			 precio = 120;
			 
		 } 
			 else {
				 
				 System.out.println("Número de bebes maximo alcanzado");
				 	 
			 }
		
		   return precio;
		 }
		
	
	public void mostrar() {
		
		System.out.println("El precio minimo es de: "+getPrecioMinimo());
		System.out.println("Su precio es de: "+calcular());
		System.out.println("El nombre es: "+getNombre());
		
	}
	
	
	}

	

	

