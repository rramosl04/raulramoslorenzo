package sanidad;

public class CentroSalud {
	
	String DireccionCentro;
	int Medicos;
	
	public CentroSalud (String DireccionCentro,int Medicos){
		
		this.DireccionCentro=DireccionCentro;
		this.Medicos=Medicos;
		
	}
	
	public void SetDireccionCentro (String valor1) {
		
		this.DireccionCentro=valor1;
		
	}
	
	public void setMedicos (int valor2) {
		
		this.Medicos=valor2;
		
	}
	
	public String getDireccionCentro () {
		
		return this.DireccionCentro;
		
	}
	
	public int getMedicos() {
		
		return this.Medicos;
		
	}
	
	public void Mostrar(){
		
		System.out.println("La dirección del centro es: " +getDireccionCentro());
		System.out.println("Hay un maximo de" +getMedicos()+ "medicos");
		
	}

}
