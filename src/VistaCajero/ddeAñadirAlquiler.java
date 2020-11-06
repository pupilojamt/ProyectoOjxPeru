/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VistaCajero;

import Conexion.ConexionSQL;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jamt_
 */
public class ddeAñadirAlquiler extends javax.swing.JInternalFrame {

    /**
     * Creates new form ddeAñadirAlquiler
     */
    DefaultTableModel model;
    public static int cont2;
    public static double PrecioP;
    
    
    public ddeAñadirAlquiler() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        tablaPelicula.setBackground(Color.WHITE);
        if(ddMenuAlquierr.con==3){
            btnAniadir.setEnabled(false);
        }
        cargar2();
    }
    
    void cargar2(){
        String mostrar="SELECT * FROM PedidoPelicula p INNER JOIN Pelicula q ON p.idPelicula=q.idPelicula WHERE estadoPP ="+3;
        String []titulos={"ID","PELICULA","PRECIO"};
        String []Registros=new String[3];
        model= new DefaultTableModel(null, titulos);
        String apellido="";
        try {
              Statement st = cn.createStatement();
              ResultSet rs = st.executeQuery(mostrar);
              while(rs.next())
              {
                  Registros[0]= rs.getString("idPedidoPelicula");
                  Registros[1]= rs.getString("nombreP");
                  Registros[2]= rs.getString("costoP");
                     
                  model.addRow(Registros);
              }
              tablaPelicula.setModel(model);
        } catch (SQLException ex) {
            System.out.println("Error en la tabla paciente: " + ex);
        }
    }

    void obtenerPrecio(){
        String mostrar="SELECT * FROM PedidoPelicula p INNER JOIN Pelicula q ON p.idPelicula=q.idPelicula WHERE idPedidoPelicula = (SELECT MAX(idPedidoPelicula) FROM PedidoPelicula WHERE estadoPP="+1+")";
        
        try {
                Statement st = cn.createStatement();
                ResultSet rs = st.executeQuery(mostrar);
                if(rs.next())
                {
                    PrecioP += rs.getDouble("costoP");
                }
                
                System.out.println("Costo Pelicula >> " + PrecioP);
              
        } catch (SQLException ex) {
            System.out.println("Error en obtener id pp: " + ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaPelicula = new javax.swing.JTable();
        btnAniadir = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Peliculas");

        tablaPelicula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaPelicula);

        btnAniadir.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        btnAniadir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Añadir2.png"))); // NOI18N
        btnAniadir.setText("Añadir");
        btnAniadir.setBorderPainted(false);
        btnAniadir.setContentAreaFilled(false);
        btnAniadir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAniadir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Añadir2.png"))); // NOI18N
        btnAniadir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Añadir.png"))); // NOI18N
        btnAniadir.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnAniadir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAniadir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAniadirActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 255, 51));
        jButton2.setFont(new java.awt.Font("Calibri", 0, 12)); // NOI18N
        jButton2.setText("Realizar Pedido");
        jButton2.setBorder(null);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jButton3.setText("Eliminar");
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAniadir, javax.swing.GroupLayout.DEFAULT_SIZE, 122, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 470, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAniadir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAniadirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAniadirActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ddMenuAlquierr menAlqui = new ddMenuAlquierr();
        bbPrincipal.escritorio.add(menAlqui);
        menAlqui.toFront();
        menAlqui.setVisible(true);
    }//GEN-LAST:event_btnAniadirActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ddfConfirmarAlquiler confirAlqui = new ddfConfirmarAlquiler();
        bbPrincipal.escritorio.add(confirAlqui);
        confirAlqui.toFront();
        confirAlqui.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int nro=Integer.parseInt((String) tablaPelicula.getValueAt(tablaPelicula.getSelectedRow(),0));
        try {
                    
                    String insertar = "UPDATE PedidoPelicula SET "
                    +"estadoPP="+1+" "
                    +"WHERE idPedidoPelicula='"+nro+"'";
                    PreparedStatement pst = cn.prepareStatement(insertar);
                    pst.executeUpdate();
                    cargar2();
                    obtenerPrecio();
                    
                    cont2++;
                    btnAniadir.setEnabled(true);
                    
            } catch (Exception e) {
                System.out.println("error al modificar los datos: "+e);
            } 
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAniadir;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaPelicula;
    // End of variables declaration//GEN-END:variables
Conexion.ConexionSQL cc = new ConexionSQL();
Connection cn= ConexionSQL.conexionn();
}
