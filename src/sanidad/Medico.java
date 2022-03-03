package sanidad;

public class Medico {

	int NumeroColegiado,AñosExperiencia;
	String Especialidad;
	CentroSalud C1;
	int sueldo;
	
	public void medico(int NumeroColegiado,int AñosExperiencia,String Especialidad) {
		
		this.NumeroColegiado=NumeroColegiado;
		this.AñosExperiencia=AñosExperiencia;
		this.Especialidad=Especialidad;
		
		this.sueldo=calculo();;
	}
	
	/**
	 * Metodos set y get
	 */

	public void setNumeroColegiado(int valor1) {
		
		this.NumeroColegiado=valor1;
		
	}
	
	public void setAñosExperiencia(int valor2) {
		
		this.AñosExperiencia=valor2;
		
	}
	
	public void setEspecialidad(String valor3) {
		
		this.Especialidad=valor3;
		
	}
	
	public int getNumeroColegiado() {
		
		return this.NumeroColegiado;
		
	}
	
	public int getAñosExperiencia() {
		
		return this.AñosExperiencia;
		
	}
	
	public String getEspecialidad() {
		
		return this.Especialidad;
		
	}
	
	public int  calculo() {
		
		
		if (AñosExperiencia < 0) {
			sueldo = AñosExperiencia * 50 +1600;

		
		}else if(Especialidad == "investigador" || Especialidad =="neurocirujano") {
			
			sueldo = sueldo + 200;
		}
	
		
		return sueldo;
	}
	
public void mostrar() {
	
	System.out.println("El número de colegiado es de: "+getNumeroColegiado());
	System.out.println("Su especialidad es: "+getEspecialidad());
	System.out.println("Tus años de experiencia son: "+getAñosExperiencia());
	
	System.out.println("el sueldo del medico es de: "+calculo());

}

}