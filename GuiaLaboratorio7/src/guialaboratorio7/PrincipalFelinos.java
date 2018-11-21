
package guialaboratorio7;

import javax.swing.JOptionPane;

public class PrincipalFelinos {
    
    public static void main (String [] args){
		
		Tigre miTigrito = new Tigre("Tigre",220.0,122,100,25,20,"Tigre Berto");
		
		Puma miPuma = new Puma("Puma",240.0,80,53,"Dorado","Marron");
                
                LeopardoNieves pantheraUncia = new LeopardoNieves("Mamífero carnivoro", "Asia Central", 
                        "Peligro de extinción", 
                        "Posee uno de los saltos más largos entre los felinos y es la única especie de su género que no ruge", 
                        "Leopardo de las Nieves", 150.0,60,55);
		
                Margay maracaya = new Margay("PEPITO", 220.0, 150, 25);
                        
                
		JOptionPane.showMessageDialog(null, miPuma.retornarDatos());

		JOptionPane.showMessageDialog(null, miTigrito.retornarDatos());
                
                JOptionPane.showMessageDialog(null, pantheraUncia.retornoDatosLeopardoNieves());
                
                JOptionPane.showMessageDialog(null, maracaya.retornoDatosMargay());

	}

}
