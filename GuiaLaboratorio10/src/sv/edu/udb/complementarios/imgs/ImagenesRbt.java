
package sv.edu.udb.complementarios.imgs;

/**
 *
 * @author dougl
 */
public class ImagenesRbt extends javax.swing.JInternalFrame {

    /**
     * Creates new form ImagenesRbt
     */
    public ImagenesRbt() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        rbtEstrellas = new javax.swing.JRadioButton();
        rbtGalaxia = new javax.swing.JRadioButton();
        rbtNebulosa = new javax.swing.JRadioButton();
        lblImagenes = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Rbt e imagenes");

        jLabel1.setText("SELECCIONA UNA IMAGENE:");

        buttonGroup1.add(rbtEstrellas);
        rbtEstrellas.setText("Estrellas");
        rbtEstrellas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtEstrellasActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtGalaxia);
        rbtGalaxia.setText("Galaxia");
        rbtGalaxia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtGalaxiaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbtNebulosa);
        rbtNebulosa.setText("Nebulosa");
        rbtNebulosa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtNebulosaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbtNebulosa)
                    .addComponent(rbtGalaxia)
                    .addComponent(rbtEstrellas))
                .addGap(18, 18, 18)
                .addComponent(lblImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(133, 133, 133))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rbtEstrellas)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(rbtGalaxia)
                        .addGap(18, 18, 18)
                        .addComponent(rbtNebulosa))
                    .addComponent(lblImagenes, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtEstrellasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtEstrellasActionPerformed
        // TODO add your handling code here:
        this.rbtEstrellas.isSelected();
           lblImagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("estrellas.jpg")));
    }//GEN-LAST:event_rbtEstrellasActionPerformed

    private void rbtGalaxiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtGalaxiaActionPerformed
        // TODO add your handling code here:
        this.rbtGalaxia.isSelected();
           lblImagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("galaxia.jpg")));
    }//GEN-LAST:event_rbtGalaxiaActionPerformed

    private void rbtNebulosaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtNebulosaActionPerformed
        // TODO add your handling code here:
        this.rbtNebulosa.isSelected();
           lblImagenes.setIcon(new javax.swing.ImageIcon(getClass().getResource("nebulosa.jpg")));
    }//GEN-LAST:event_rbtNebulosaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblImagenes;
    private javax.swing.JRadioButton rbtEstrellas;
    private javax.swing.JRadioButton rbtGalaxia;
    private javax.swing.JRadioButton rbtNebulosa;
    // End of variables declaration//GEN-END:variables
}
