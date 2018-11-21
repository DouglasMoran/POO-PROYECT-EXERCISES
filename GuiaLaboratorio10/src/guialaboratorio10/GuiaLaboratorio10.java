
package guialaboratorio10;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class GuiaLaboratorio10 extends javax.swing.JInternalFrame {

    /*public static void main(String[] args) {
            new GuiaLaboratorio10();
            
        }*/

    public GuiaLaboratorio10() {
        JLabel lblHola = new JLabel("Hola");
        add(lblHola);
        this.setSize(200, 200);
        this.setTitle("Primera interfaz gráfica");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
    }
    
    
}
