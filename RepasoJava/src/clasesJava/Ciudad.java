package clasesJava;

public class Ciudad {
 private String nombreCiudad;
 private int codigo;
 private boolean playa;

public Ciudad(String nombreCiudad, int codigo, boolean playa) {
	super();
	this.nombreCiudad = nombreCiudad;
	this.codigo = codigo;
	this.playa = playa;
}
public String getNombreCiudad() {
	return nombreCiudad;
}
public void setNombreCiudad(String nombreCiudad) {
	this.nombreCiudad = nombreCiudad;
}
public int getCodigo() {
	return codigo;
}
public void setCodigo(int codigo) {
	this.codigo = codigo;
}
public boolean isPlaya() {
	return playa;
}
public void setPlaya(boolean playa) {
	this.playa = playa;
}
public String costera() {
	
	if(playa) {
		return "costera";	
	}else {
	return "interior";
}
}

}
