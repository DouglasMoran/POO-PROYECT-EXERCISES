
package guialaboratorio7;

public class Puma extends Felinos{
    
    String color;
	
	String color_ojos;
	
	public Puma(String nombre, double longitud, double altura_cruz, double peso, String color, String color_ojos) {
		super(nombre, longitud, altura_cruz, peso);
		this.color = color;
		
		this.color_ojos = color_ojos;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getColor_ojos() {
		return color_ojos;
	}

	public void setColor_ojos(String color_ojos) {
		this.color_ojos = color_ojos;
	}
	
	public String  retornarDatos(){
		String espacio=" ";
		String salto="\n";
		
		return 
				"Puma:"+salto+
				"Familia: "+getFamilia()+salto+
				"Longitud: "+getLongitud()+salto+
				"Altura Cruz: "+getAltura_cruz()+salto+
				"Peso: "+getPeso()+salto+
				"Color: "+getColor()+salto+
				"Color de Ojos: "+getColor_ojos()+salto;
				
	}	

}
