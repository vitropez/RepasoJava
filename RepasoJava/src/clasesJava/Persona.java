package clasesJava;

public class Persona {
 private String nombre;
 private int a�os;
 private Ciudad ciudad;
public Persona(String nombre, int a�os, Ciudad ciudad) {
	super();
	this.nombre = nombre;
	this.a�os = a�os;
	this.ciudad = ciudad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getA�os() {
	return a�os;
}
public void setA�os(int a�os) {
	this.a�os = a�os;
}
public Ciudad getCiudad() {
	return ciudad;
}
public void setCiudad(Ciudad ciudad) {
	this.ciudad = ciudad;
}

 
}
