package colegio;

public class colegio {

	String nombre,direccion;
	int num_alumnos;

public colegio () {
}	

public colegio (String nombre, String direccion, int num_alumnos) {
	
	this.nombre=nombre;
	this.direccion=direccion;
	this.num_alumnos=num_alumnos;
}

public void setNombre (String valor) {
	this.nombre=valor;	
}

public String getNombre (String valor) {
	return this.nombre;	
}


public void setDireccion (String valor) {
	this.direccion=valor;
}

public String getDireccion (String valor) {
	return this.direccion;	
}

public void setNum_alumnos (int valor) {
	this.num_alumnos=valor;
}

public int getNum_alumnos (int valor) {
	return this.num_alumnos;	
}
}
