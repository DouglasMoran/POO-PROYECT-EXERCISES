
package guialaboratorio7;

public class Felinos {
    
    private  String familia="felidae";

	String nombre_comun;
	
	double longitud;
	
	double altura_cruz;
	
	double peso;
        
	public Felinos(String nombre, double longitud,
			double altura_cruz, double peso) {
		this.nombre_comun = nombre;
		this.longitud = longitud;
		this.altura_cruz = altura_cruz;
		this.peso = peso;
	}

	public String getNombre() {
		return nombre_comun;
	}

	public void setNombre(String nombre) {
		this.nombre_comun = nombre;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	public double getAltura_cruz() {
		return altura_cruz;
	}

	public void setAltura_cruz(double altura_cruz) {
		this.altura_cruz = altura_cruz;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	public String getFamilia(){
		return this.familia;
	}

}
