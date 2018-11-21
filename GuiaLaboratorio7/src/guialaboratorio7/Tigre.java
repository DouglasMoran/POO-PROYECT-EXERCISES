
package guialaboratorio7;


public class Tigre extends Felinos{
    
    String subfamilia="Leopardus tigrinus";
	
	int cantidad_rayas;
	
	int edaddocumentada;
	
	String nombreAsignado;
	
	public Tigre(String nombre_comun, double longitud, 
			double altura_cruz, double peso, int cantidad_manchas, 
			int edad_documentada, String nombreAsignado) {
		super(nombre_comun, longitud, altura_cruz, peso);
		this.cantidad_rayas = cantidad_manchas;
		this.edaddocumentada = edad_documentada;
		this.nombreAsignado = nombreAsignado;
	}

	
	public int getCantidad_rayas() {
		return cantidad_rayas;
	}


	public void setCantidad_rayas(int cantidad_manchas) {
		this.cantidad_rayas = cantidad_manchas;
	}


	public int getEdaddocumentada() {
		return edaddocumentada;
	}


	public void setEdaddocumentada(int edaddocumentada) {
		this.edaddocumentada = edaddocumentada;
	}


	public String getNombreAsignado() {
		return nombreAsignado;
	}


	public void setNombreAsignado(String nombreAsignado) {
		this.nombreAsignado = nombreAsignado;
	}


	public String  retornarDatos(){
		String espacio=" ";
		String salto="\n";
		
		return 
				"Tigre"+salto+
				"Familia: "+getFamilia()+salto+
				"Longitud: "+getLongitud()+salto+
				"Altura Cruz: "+getAltura_cruz()+salto+
				"Peso: "+getPeso()+salto+
				"CantidadManchas: "+getCantidad_rayas()+salto+
				"Edad Documentada: "+getEdaddocumentada()+salto+
				"Nombre Asignado: "+getNombreAsignado()+salto;
				
	}

    
}
