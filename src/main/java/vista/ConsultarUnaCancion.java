
package vista;

import acceso.AccesoCancion;
import java.sql.SQLException;
import modelo.Cancion;

public class ConsultarUnaCancion extends javax.swing.JInternalFrame {

    
    public ConsultarUnaCancion() {
        initComponents();
        //variables
        txtNombreConsultarCancion.setEnabled(false);
        textFechaLanzamineto.setEnabled(false);
        txtDuracionConsultaUnaCancionEntrada.setEnabled(false);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloListaConsultarTodasCanciones = new javax.swing.JLabel();
        tituloCodigoConsultarUnaCancion = new javax.swing.JLabel();
        txtCodigoConsultarUnaCancionEntrada = new javax.swing.JTextField();
        tituloNombreConsultarUnaCancion = new javax.swing.JLabel();
        txtNombreConsultarCancion = new javax.swing.JTextField();
        tituloDuracionConsultarUnaCancion = new javax.swing.JLabel();
        txtDuracionConsultaUnaCancionEntrada = new javax.swing.JTextField();
        tituloFechaLanzamientoConsultarUnaCancion = new javax.swing.JLabel();
        textFechaLanzamineto = new com.toedter.calendar.JDateChooser();
        botonBuscarConsultarUnaCancion = new javax.swing.JButton();
        lblErrorConsultarUnaCancion = new javax.swing.JLabel();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(600, 500));

        lblTituloListaConsultarTodasCanciones.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTituloListaConsultarTodasCanciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloListaConsultarTodasCanciones.setText("Canción Consultada");

        tituloCodigoConsultarUnaCancion.setText("Código");

        tituloNombreConsultarUnaCancion.setText("Nombre");

        txtNombreConsultarCancion.setEditable(false);

        tituloDuracionConsultarUnaCancion.setText("Duración");

        txtDuracionConsultaUnaCancionEntrada.setEditable(false);

        tituloFechaLanzamientoConsultarUnaCancion.setText("Fecha de Lanzamiento");

        botonBuscarConsultarUnaCancion.setText("Buscar");
        botonBuscarConsultarUnaCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarConsultarUnaCancionActionPerformed(evt);
            }
        });

        lblErrorConsultarUnaCancion.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblErrorConsultarUnaCancion.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorConsultarUnaCancion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloListaConsultarTodasCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCodigoConsultarUnaCancion)
                    .addComponent(tituloNombreConsultarUnaCancion)
                    .addComponent(tituloDuracionConsultarUnaCancion)
                    .addComponent(tituloFechaLanzamientoConsultarUnaCancion))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoConsultarUnaCancionEntrada)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscarConsultarUnaCancion))
                    .addComponent(textFechaLanzamineto, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(txtDuracionConsultaUnaCancionEntrada)
                    .addComponent(txtNombreConsultarCancion))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblErrorConsultarUnaCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblTituloListaConsultarTodasCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorConsultarUnaCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCodigoConsultarUnaCancionEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(tituloCodigoConsultarUnaCancion)
                        .addComponent(botonBuscarConsultarUnaCancion)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tituloNombreConsultarUnaCancion)
                    .addComponent(txtNombreConsultarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFechaLanzamineto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloFechaLanzamientoConsultarUnaCancion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloDuracionConsultarUnaCancion, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDuracionConsultaUnaCancionEntrada, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(90, 90, 90))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonBuscarConsultarUnaCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarConsultarUnaCancionActionPerformed
        try {
            
            java.util.Date mFecha = textFechaLanzamineto.getDate();
            java.sql.Date anioFundacion = null;

            if (mFecha != null) {
                anioFundacion = new java.sql.Date(mFecha.getTime());
            }
            
            
            lblErrorConsultarUnaCancion.setText("");
            txtNombreConsultarCancion.setText("");
            textFechaLanzamineto.setDate(null);
            txtDuracionConsultaUnaCancionEntrada.setText("");
            
            
            int codigo = Integer.parseInt(txtCodigoConsultarUnaCancionEntrada.getText());
            Cancion cancion = AccesoCancion.consultar(codigo);
            
            if (cancion == null) {
                lblErrorConsultarUnaCancion.setText("No existe ninguna canción con ese código.");
            } else {
                txtNombreConsultarCancion.setText(cancion.getNombreCancion());
                textFechaLanzamineto.setDate(mFecha);
                txtDuracionConsultaUnaCancionEntrada.setText(String.valueOf(cancion.getDuracion()));
                
            }
        } catch (NumberFormatException nfe) {
            lblErrorConsultarUnaCancion.setText("El código de la canción debe ser un número entero.");
        } catch (ClassNotFoundException cnfe) {
            cnfe.getStackTrace();
            lblErrorConsultarUnaCancion.setText("Error al conectar con la base de datos.");
        } catch (SQLException sqle) {
            lblErrorConsultarUnaCancion.setText("Error en la base de datos.");
        }
    }//GEN-LAST:event_botonBuscarConsultarUnaCancionActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarConsultarUnaCancion;
    private javax.swing.JLabel lblErrorConsultarUnaCancion;
    private javax.swing.JLabel lblTituloListaConsultarTodasCanciones;
    private com.toedter.calendar.JDateChooser textFechaLanzamineto;
    private javax.swing.JLabel tituloCodigoConsultarUnaCancion;
    private javax.swing.JLabel tituloDuracionConsultarUnaCancion;
    private javax.swing.JLabel tituloFechaLanzamientoConsultarUnaCancion;
    private javax.swing.JLabel tituloNombreConsultarUnaCancion;
    private javax.swing.JTextField txtCodigoConsultarUnaCancionEntrada;
    private javax.swing.JTextField txtDuracionConsultaUnaCancionEntrada;
    private javax.swing.JTextField txtNombreConsultarCancion;
    // End of variables declaration//GEN-END:variables
}
