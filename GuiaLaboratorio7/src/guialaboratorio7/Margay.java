
package guialaboratorio7;

public class Margay extends Felinos{
    
    String subfamilia="Felinae";

    public Margay(String nombre, double longitud, double altura_cruz, double peso) {
        super(nombre, longitud, altura_cruz, peso);
    }

    

    public String getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(String subfamilia) {
        this.subfamilia = subfamilia;
    }
    
    
    public String  retornoDatosMargay(){
		String espacio=" ";
		String salto="\n";
		
		return 
				"\t:::MARGAY:::"+salto+
				"Familia: "+getFamilia()+salto+
				"Longitud: "+getLongitud()+salto+
				"Altura Cruz: "+getAltura_cruz()+salto+
				"Peso: "+getPeso()+salto+
				"Subfamilia: "+getSubfamilia();	
	}
    
    
    
    
    
}
