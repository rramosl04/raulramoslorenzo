package sanidad;

public class Medico {

	int NumeroColegiado,A�osExperiencia;
	String Especialidad;
	CentroSalud C1;
	int sueldo;
	
	public void medico(int NumeroColegiado,int A�osExperiencia,String Especialidad) {
		
		this.NumeroColegiado=NumeroColegiado;
		this.A�osExperiencia=A�osExperiencia;
		this.Especialidad=Especialidad;
		
		this.sueldo=calculo();;
	}
	
	/**
	 * Metodos set y get
	 */

	public void setNumeroColegiado(int valor1) {
		
		this.NumeroColegiado=valor1;
		
	}
	
	public void setA�osExperiencia(int valor2) {
		
		this.A�osExperiencia=valor2;
		
	}
	
	public void setEspecialidad(String valor3) {
		
		this.Especialidad=valor3;
		
	}
	
	public int getNumeroColegiado() {
		
		return this.NumeroColegiado;
		
	}
	
	public int getA�osExperiencia() {
		
		return this.A�osExperiencia;
		
	}
	
	public String getEspecialidad() {
		
		return this.Especialidad;
		
	}
	
	public int  calculo() {
		
		
		if (A�osExperiencia < 0) {
			sueldo = A�osExperiencia * 50 +1600;

		
		}else if(Especialidad == "investigador" || Especialidad =="neurocirujano") {
			
			sueldo = sueldo + 200;
		}
	
		
		return sueldo;
	}
	
public void mostrar() {
	
	System.out.println("El n�mero de colegiado es de: "+getNumeroColegiado());
	System.out.println("Su especialidad es: "+getEspecialidad());
	System.out.println("Tus a�os de experiencia son: "+getA�osExperiencia());
	
	System.out.println("el sueldo del medico es de: "+calculo());

}

}