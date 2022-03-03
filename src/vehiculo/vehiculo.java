
	package vehiculo;
	public class vehiculo {
		//atributo
		String marca, modelo, color;
		int velocidad_max;
		//método
		public vehiculo () {	
		}
		public vehiculo (String marca, String modelo, String color, int velocidad_max) {
			this.marca=marca;
			this.modelo=modelo;
			this.color=modelo;
			this.velocidad_max=velocidad_max;
		}
		//Para imprimir los valores en pantalla
		public void imprime () {
			System.out.println("Los atributos son: ");
			System.out.println("Marca: " + this.marca);
			System.out.println("Modelo: " + this.modelo);
			System.out.println("Color: " + this.color);
			System.out.println("Velocidad máxima: " + this.velocidad_max);
		}
		
		}

