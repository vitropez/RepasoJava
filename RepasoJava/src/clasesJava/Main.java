package clasesJava;

public class Main {

	public static void main(String[] args) {
		
		Ciudad poblacion =new Ciudad("coru�a",15004,true);
		Persona estudiante = new Persona("yago",48,poblacion);
		
		System.out.println("datos del estudiante "+estudiante.getNombre()+" edad "+estudiante.getA�os()+
				" vive en "+poblacion.getNombreCiudad()+" y es una ciudad "+poblacion.costera());
}		
	

}