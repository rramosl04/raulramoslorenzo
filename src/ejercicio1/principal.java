package ejercicio1;

public class principal {

	public static void main(String[] args) {
		
		Alumnos Alumnos1 = new Alumnos ("Raúl","Ramos Lorenzo",19,'R',1000.00);
		
			System.out.println("Mi nombre es: "+Alumnos1.nombre);
			System.out.println("Mi apellido es: "+Alumnos1.apellido);
			System.out.println("Mi edad es: "+Alumnos1.getEdad());
			System.out.println("Mi inicial es: "+Alumnos1.inicial_nombre);
			System.out.println("El coste de mi matricula es: "+Alumnos1.getcoste_matricula());
	}
	
}
