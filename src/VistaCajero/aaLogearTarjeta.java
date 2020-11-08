/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaCajero;

import Conexion.ConexionSQL;
import com.placeholder.PlaceHolder;
import java.awt.Color;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jamt_
 */
public class aaLogearTarjeta extends javax.swing.JFrame {

    /**
     * Creates new form aaLogearTarjeta
     */
    public static int idTarjeta;
    public static String nombre, apellidoP, apellidoM, dniii;
    
    
    public aaLogearTarjeta() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.WHITE);
    }
    
    void verificar(String codigo, String dni){
        String mostrar = "select * from Cliente c INNER JOIN Tarjeta t ON c.idTarjeta = t.idTarjeta WHERE c.dni = '"+dni+"' AND t.codigoTarjeta = '"+codigo+"'";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(mostrar);
            int cont=0;
            if(rs.next()){
                idTarjeta = rs.getInt("idTarjeta");
                cont++;
            }
            
            System.out.println("idTarjeta >> " + idTarjeta);
            
            if(cont==1){
                obtenerDatosCliente();
                bbPrincipal principal = new bbPrincipal();
                principal.setVisible(true);
                this.dispose();
            }else{
                JOptionPane.showMessageDialog(null, "No existe Cliente");
            }
            
        } catch (SQLException ex) {
            System.out.println("Error Logear Cliente -- " + ex);
        }   
    }
    
    void obtenerDatosCliente(){
        String mostrar = "select * from Cliente c INNER JOIN Tarjeta t ON c.idTarjeta = t.idTarjeta WHERE t.idTarjeta="+idTarjeta;
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(mostrar);
            
            if(rs.next()){
                nombre= rs.getString("nombre");
                apellidoP= rs.getString("apellidoP");
                apellidoM= rs.getString("apellidoM");
                dniii= rs.getString("dni");
            }
            
            System.out.println("nombre >> " + nombre + " " + apellidoP +  " " + apellidoM +  " " + dniii);
     
        } catch (SQLException ex) {
            System.out.println("Error obetener datos clientes -- " + ex);
        }   
    }
    
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNroTarjeta1 = new LIB.FSTexFieldMD();
        txtDni1 = new LIB.FSTexFieldMD();
        btnIniciarSesion = new LIB.FSButtonMD();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar2.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.setMaximumSize(new java.awt.Dimension(32, 32));
        jButton1.setMinimumSize(new java.awt.Dimension(32, 32));
        jButton1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar2.png"))); // NOI18N
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cerrar.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoLoginTarjeta3.jpg"))); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 30)); // NOI18N
        jLabel2.setText("  BIENVENIDOS ");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        txtNroTarjeta1.setForeground(new java.awt.Color(51, 51, 51));
        txtNroTarjeta1.setBordeColorFocus(new java.awt.Color(102, 255, 102));
        txtNroTarjeta1.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        txtNroTarjeta1.setPlaceholder("Nro Tarjeta \"1010-1010-1010-1010\"");
        txtNroTarjeta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNroTarjeta1MouseClicked(evt);
            }
        });

        txtDni1.setForeground(new java.awt.Color(51, 51, 51));
        txtDni1.setBordeColorFocus(new java.awt.Color(102, 255, 102));
        txtDni1.setFont(new java.awt.Font("Roboto Bold", 1, 12)); // NOI18N
        txtDni1.setPlaceholder("Dni");

        btnIniciarSesion.setBackground(new java.awt.Color(51, 255, 51));
        btnIniciarSesion.setText("Iniciar Sesión");
        btnIniciarSesion.setColorHover(new java.awt.Color(153, 255, 153));
        btnIniciarSesion.setColorNormal(new java.awt.Color(51, 255, 51));
        btnIniciarSesion.setColorTextNormal(new java.awt.Color(0, 0, 0));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe", 1, 18)); // NOI18N
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(17, 17, 17))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDni1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(txtNroTarjeta1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel2)
                .addGap(38, 38, 38)
                .addComponent(txtNroTarjeta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDni1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 198, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNroTarjeta1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNroTarjeta1MouseClicked
        // TODO add your handling code here:
        txtNroTarjeta1.setText("1010-1010-1010-");
    }//GEN-LAST:event_txtNroTarjeta1MouseClicked

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        // TODO add your handling code here:
        String codigo = txtNroTarjeta1.getText();
        String dni = txtDni1.getText();
        
        verificar(codigo, dni);
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(aaLogearTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(aaLogearTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(aaLogearTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(aaLogearTarjeta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new aaLogearTarjeta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private LIB.FSButtonMD btnIniciarSesion;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private LIB.FSTexFieldMD txtDni1;
    private LIB.FSTexFieldMD txtNroTarjeta1;
    // End of variables declaration//GEN-END:variables
Conexion.ConexionSQL cc = new ConexionSQL();
Connection cn= ConexionSQL.conexionn();
}
