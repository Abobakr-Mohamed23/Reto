
package vista;
import acceso.AccesoCancion;
import acceso.AccesoCompania;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cancion;
import modelo.Compania_Discografica;





public class InsertarCancion extends javax.swing.JInternalFrame {

   
    public InsertarCancion() {
        initComponents();
        lblErrorInsertarCancion.setText("");
        cargarDatosArtista();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloInsertarCancion = new javax.swing.JLabel();
        jLabelTextoNombreCancion = new javax.swing.JLabel();
        jLabelTextoFechaLanzamientoCancion = new javax.swing.JLabel();
        jLabelTextoDuracionCancion = new javax.swing.JLabel();
        jdateFechaLanzamientoCancionAinsertar = new com.toedter.calendar.JDateChooser();
        lblErrorInsertarCancion = new javax.swing.JLabel();
        buttonAgregarCancion = new java.awt.Button();
        lblConfirmacionInsertarCancion = new javax.swing.JLabel();
        comboBoxArtista = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtArtistaCancion1 = new javax.swing.JTextField();
        jTextNombreCancionAInsertar = new javax.swing.JTextField();
        jTextDuracionCancionAInsertar = new javax.swing.JTextField();

        jLabelTituloInsertarCancion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTituloInsertarCancion.setText("Insertar Canción");

        jLabelTextoNombreCancion.setText("Nombre Canción");

        jLabelTextoFechaLanzamientoCancion.setText("Fecha de Lanzamiento");

        jLabelTextoDuracionCancion.setText("Duración");

        lblErrorInsertarCancion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblErrorInsertarCancion.setForeground(new java.awt.Color(204, 0, 0));

        buttonAgregarCancion.setActionCommand("Agregar");
        buttonAgregarCancion.setLabel("Agregar");
        buttonAgregarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAgregarCancionActionPerformed(evt);
            }
        });

        lblConfirmacionInsertarCancion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N

        comboBoxArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxArtistaActionPerformed(evt);
            }
        });

        jLabel1.setText("Artista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(273, 273, 273)
                        .addComponent(lblErrorInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(27, 27, 27)
                                .addComponent(comboBoxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(txtArtistaCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblConfirmacionInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTextoFechaLanzamientoCancion)
                                    .addComponent(jLabelTextoDuracionCancion)
                                    .addComponent(jLabelTextoNombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jdateFechaLanzamientoCancionAinsertar, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE)
                                    .addComponent(jTextNombreCancionAInsertar)
                                    .addComponent(jTextDuracionCancionAInsertar)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(261, 261, 261)
                        .addComponent(jLabelTituloInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(259, 259, 259)
                        .addComponent(buttonAgregarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(10, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblErrorInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTextoNombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jdateFechaLanzamientoCancionAinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jTextDuracionCancionAInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelTextoFechaLanzamientoCancion)
                                .addGap(28, 28, 28)
                                .addComponent(jLabelTextoDuracionCancion)))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfirmacionInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(comboBoxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtArtistaCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jTextNombreCancionAInsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(buttonAgregarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        buttonAgregarCancion.getAccessibleContext().setAccessibleName("botonAgregarCancion");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAgregarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAgregarCancionActionPerformed
       try{
           java.util.Date mFecha =jdateFechaLanzamientoCancionAinsertar.getDate();
           java.sql.Date anioFundacion = null;
           if(mFecha != null){
               anioFundacion = new java.sql.Date(mFecha.getTime());
           }
           String nombreCancion = jTextNombreCancionAInsertar.getText();
           String duracion = jTextDuracionCancionAInsertar.getText();
           
           Cancion cancion = new Cancion(nombreCancion, duracion, ERROR, WIDTH);
           AccesoCancion.insertar(cancion);
           lblConfirmacionInsertarCancion.setText("Insertado correctamente");
           
           jTextNombreCancionAInsertar.setText("");
           jdateFechaLanzamientoCancionAinsertar.setDate(null);
           jTextDuracionCancionAInsertar.setText("");
           
           
       } catch (NumberFormatException nfe) {
            lblErrorInsertarCancion.setText("El código de la canción debe ser un número entero.");
            lblConfirmacionInsertarCancion.setText("");
        } catch (ClassNotFoundException cnfe) {
            lblErrorInsertarCancion.setText("Error al conectar con la base de datos.");
            lblConfirmacionInsertarCancion.setText("");
        } catch (SQLException sqle) {
            lblErrorInsertarCancion.setText("Error en la base de datos.");
            lblConfirmacionInsertarCancion.setText("");
        }
    }//GEN-LAST:event_buttonAgregarCancionActionPerformed

    private void comboBoxArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxArtistaActionPerformed
       
        
       
        
        
        
    }//GEN-LAST:event_comboBoxArtistaActionPerformed

    
    
     private void cargarDatosArtista(){
         try {
            for (Artista artista : AccesoArtista.consultarTodos()) {
               
              
                comboBoxArtista.addItem(artista.getNombre());
                
                
            }
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InsertarCancion.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(InsertarCancion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonAgregarCancion;
    private javax.swing.JComboBox<String> comboBoxArtista;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelTextoDuracionCancion;
    private javax.swing.JLabel jLabelTextoFechaLanzamientoCancion;
    private javax.swing.JLabel jLabelTextoNombreCancion;
    private javax.swing.JLabel jLabelTituloInsertarCancion;
    private javax.swing.JTextField jTextDuracionCancionAInsertar;
    private javax.swing.JTextField jTextNombreCancionAInsertar;
    private com.toedter.calendar.JDateChooser jdateFechaLanzamientoCancionAinsertar;
    private javax.swing.JLabel lblConfirmacionInsertarCancion;
    private javax.swing.JLabel lblErrorInsertarCancion;
    private javax.swing.JTextField txtArtistaCancion1;
    // End of variables declaration//GEN-END:variables
}
