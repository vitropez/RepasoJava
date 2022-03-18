package clasesJava;

public class Persona {
 private String nombre;
 private int años;
 private Ciudad ciudad;
public Persona(String nombre, int años, Ciudad ciudad) {
	super();
	this.nombre = nombre;
	this.años = años;
	this.ciudad = ciudad;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getAños() {
	return años;
}
public void setAños(int años) {
	this.años = años;
}
public Ciudad getCiudad() {
	return ciudad;
}
public void setCiudad(Ciudad ciudad) {
	this.ciudad = ciudad;
}

 
}
