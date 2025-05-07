
package vista;
import acceso.AccesoCancion;
import java.sql.SQLException;
import modelo.Cancion;





public class InsertarCancion extends javax.swing.JInternalFrame {

   
    public InsertarCancion() {
        initComponents();
        lblErrorInsertarCancion.setText("");
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTituloInsertarCancion = new javax.swing.JLabel();
        jLabelTextoNombreCancion = new javax.swing.JLabel();
        jLabelTextoFechaLanzamientoCancion = new javax.swing.JLabel();
        jLabelTextoDuracionCancion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextNombreCancionAInsertar = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextDuracionCancionAInsertar = new javax.swing.JTextArea();
        jdateFechaLanzamientoCancionAinsertar = new com.toedter.calendar.JDateChooser();
        lblErrorInsertarCancion = new javax.swing.JLabel();
        buttonAgregarCancion = new java.awt.Button();
        lblConfirmacionInsertarCancion = new javax.swing.JLabel();

        jLabelTituloInsertarCancion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelTituloInsertarCancion.setText("Insertar Canción");

        jLabelTextoNombreCancion.setText("Nombre Canción");

        jLabelTextoFechaLanzamientoCancion.setText("Fecha de Lanzamiento");

        jLabelTextoDuracionCancion.setText("Duración");

        jTextNombreCancionAInsertar.setColumns(20);
        jTextNombreCancionAInsertar.setRows(5);
        jScrollPane1.setViewportView(jTextNombreCancionAInsertar);

        jTextDuracionCancionAInsertar.setColumns(20);
        jTextDuracionCancionAInsertar.setRows(5);
        jScrollPane3.setViewportView(jTextDuracionCancionAInsertar);

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(lblErrorInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblConfirmacionInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(buttonAgregarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelTextoFechaLanzamientoCancion)
                                    .addComponent(jLabelTextoDuracionCancion)
                                    .addComponent(jLabelTextoNombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jdateFechaLanzamientoCancionAinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelTituloInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(lblErrorInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabelTextoNombreCancion, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelTextoFechaLanzamientoCancion)
                        .addGap(28, 28, 28)
                        .addComponent(jLabelTextoDuracionCancion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jdateFechaLanzamientoCancionAinsertar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buttonAgregarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmacionInsertarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
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
           
           Cancion cancion = new Cancion(nombreCancion, duracion, anioFundacion);
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button buttonAgregarCancion;
    private javax.swing.JLabel jLabelTextoDuracionCancion;
    private javax.swing.JLabel jLabelTextoFechaLanzamientoCancion;
    private javax.swing.JLabel jLabelTextoNombreCancion;
    private javax.swing.JLabel jLabelTituloInsertarCancion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextDuracionCancionAInsertar;
    private javax.swing.JTextArea jTextNombreCancionAInsertar;
    private com.toedter.calendar.JDateChooser jdateFechaLanzamientoCancionAinsertar;
    private javax.swing.JLabel lblConfirmacionInsertarCancion;
    private javax.swing.JLabel lblErrorInsertarCancion;
    // End of variables declaration//GEN-END:variables
}
