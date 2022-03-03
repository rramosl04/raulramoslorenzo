package Rectangulo;

 class Rectangulos {

	private static int numRectangulos=0;
	
	private String nombre;
	
	static final String nombreFigura="Rectangulos";
	private final double PI=3.1416;
	public double x1,y1;
	public double x2,y2;

	//constructor por defecto
	
	public Rectangulos() {
		numRectangulos++;
	}
	
	
	
	//contrcutor parametrizado
	

	
	public Rectangulos(String nombre,double x1,double y1,double x2, double y2) {
		
		this.nombre=nombre;
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
		
		numRectangulos ++;
		
	}
	
	//set del atributo privado nombre y el get del atributo numRectangulo
	
	public void obtenerNombre (String valor1) {
		
		this.nombre=valor1;
	}
	
	public String establecerNombre () {
		
		return this.nombre;
		
	}
	
	public  int getNumRectangulos () {
		
		
		return this.numRectangulos;
	}
	
	public double calcularSuperficie() {
		
		double base = (this.x2)-(this.x1);
		double altura = (this.y2)-(this.y1);
		double basealtura = base * altura;
		return basealtura;
	}
	
	public double calcularPerimetro() {
		
		double base = (this.x2)-(this.x1);
		double altura = (this.y2)-(this.y1);	
		double perimetro = (base*2)+(altura*2);
		
		return perimetro;
	}
	
	
	
	
	
	public void Desplazamiento (double desplazamientoX, double desplazamientoY ) {
		
		this.x1+=desplazamientoX;
		this.x2+=desplazamientoX;
		this.y1+=desplazamientoY;
		this.y2+=desplazamientoY;
		
	}
	
	public int obtenerRectangulos() {
		return this.numRectangulos;
		
	}
	
}
