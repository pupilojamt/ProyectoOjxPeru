/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaCajero;

import com.placeholder.PlaceHolder;
import java.awt.Color;

/**
 *
 * @author jamt_
 */
public class ccdOtroMontoRecarga extends javax.swing.JInternalFrame {

    /**
     * Creates new form ccdOtroMontoRecarga
     */
    PlaceHolder holder;
    public static int otroMonto;
    
    public ccdOtroMontoRecarga() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        holder = new PlaceHolder(txtOtroMonto, "Monto");
        btnAceptar.requestFocus();
        this.setLocation(190, 160);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtOtroMonto = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();

        setClosable(true);
        setTitle("Monto");

        txtOtroMonto.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        btnAceptar.setBackground(new java.awt.Color(51, 255, 51));
        btnAceptar.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtOtroMonto)
                    .addComponent(btnAceptar, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(txtOtroMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAceptar)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        otroMonto = Integer.parseInt(txtOtroMonto.getText());
        this.dispose();
        ccMenuRecargaa menRe = new ccMenuRecargaa();
        bbPrincipal.escritorio.add(menRe);
        menRe.toFront();
        menRe.setVisible(true);
    }//GEN-LAST:event_btnAceptarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JTextField txtOtroMonto;
    // End of variables declaration//GEN-END:variables
}