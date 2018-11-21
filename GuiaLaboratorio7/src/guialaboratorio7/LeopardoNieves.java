
package guialaboratorio7;

public class LeopardoNieves extends Felinos{
    
    String subfamilia="Panthera Uncia";
    String especie;
    String habitat;
    String estado;
    String caracteristica;

    public LeopardoNieves(String especie, String habitat, String estado, String caracteristica, String nombre, double longitud, double altura_cruz, double peso) {
        super(nombre, longitud, altura_cruz, peso);
        this.especie = especie;
        this.habitat = habitat;
        this.estado = estado;
        this.caracteristica = caracteristica;
    }

    public String getSubfamilia() {
        return subfamilia;
    }

    public void setSubfamilia(String subfamilia) {
        this.subfamilia = subfamilia;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
    }
    
    public String  retornoDatosLeopardoNieves(){
		String espacio=" ";
		String salto="\n";
		
		return 
				"\t:::LEOPARDO DE LAS NIEVES:::"+salto+
				"Familia: "+getFamilia()+salto+
				"Longitud: "+getLongitud()+salto+
				"Altura Cruz: "+getAltura_cruz()+salto+
				"Peso: "+getPeso()+salto+
				"Subfamilia: "+getSubfamilia()+salto+
				"Especie: "+getEspecie()+salto+
				"Habitat: "+getHabitat()+salto+
                                "Estado: "+getEstado()+salto+
                                "Dato curioso: "+getCaracteristica()+salto;	
	}
    
    
}
