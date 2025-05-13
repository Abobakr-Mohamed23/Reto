package vista;

import acceso.AccesoCancion;
import java.sql.SQLException;
import modelo.Cancion;

public class ConsultarUnaCancion extends javax.swing.JInternalFrame {

    public ConsultarUnaCancion() {
        initComponents();
        //variables
        txtNombreConsultarCancion.setEditable(false);
        textFechaLanzamineto.setEnabled(false);
        txtDuracionConsultaUnaCancionEntrada.setEditable(false);
        txtArtistaCancion.setEditable(false);

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
        jLabel1 = new javax.swing.JLabel();
        txtArtistaCancion = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestión de Canciones");
        setToolTipText("");
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

        jLabel1.setText("Artista");

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTituloListaConsultarTodasCanciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblErrorConsultarUnaCancion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tituloCodigoConsultarUnaCancion)
                    .addComponent(tituloNombreConsultarUnaCancion)
                    .addComponent(tituloDuracionConsultarUnaCancion)
                    .addComponent(tituloFechaLanzamientoConsultarUnaCancion)
                    .addComponent(jLabel1))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtCodigoConsultarUnaCancionEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(botonBuscarConsultarUnaCancion))
                    .addComponent(textFechaLanzamineto, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                    .addComponent(txtDuracionConsultaUnaCancionEntrada)
                    .addComponent(txtNombreConsultarCancion)
                    .addComponent(txtArtistaCancion))
                .addGap(53, 53, 53))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
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
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tituloNombreConsultarUnaCancion)
                    .addComponent(txtNombreConsultarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textFechaLanzamineto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloFechaLanzamientoConsultarUnaCancion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDuracionConsultaUnaCancionEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tituloDuracionConsultarUnaCancion))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtArtistaCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(26, 26, 26)
                .addComponent(btnLimpiar)
                .addContainerGap(112, Short.MAX_VALUE))
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

            int codigo = Integer.parseInt(txtCodigoConsultarUnaCancionEntrada.getText());
            Cancion cancion = AccesoCancion.consultar(codigo);

            if (cancion == null) {
                lblErrorConsultarUnaCancion.setText("No existe ninguna canción con ese código.");
            } else {
                txtNombreConsultarCancion.setText(cancion.getNombreCancion());
                textFechaLanzamineto.setDate(cancion.getFechaLanzamiento());
                txtDuracionConsultaUnaCancionEntrada.setText(String.valueOf(cancion.getDuracion()));
                txtArtistaCancion.setText(cancion.getArtista().getNombreCompleto());

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

    private void limpiar() {
        txtCodigoConsultarUnaCancionEntrada.setText("");
        lblErrorConsultarUnaCancion.setText("");
        txtNombreConsultarCancion.setText("");
        textFechaLanzamineto.setDate(null);
        txtDuracionConsultaUnaCancionEntrada.setText("");
        txtArtistaCancion.setText("");
    }
    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscarConsultarUnaCancion;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblErrorConsultarUnaCancion;
    private javax.swing.JLabel lblTituloListaConsultarTodasCanciones;
    private com.toedter.calendar.JDateChooser textFechaLanzamineto;
    private javax.swing.JLabel tituloCodigoConsultarUnaCancion;
    private javax.swing.JLabel tituloDuracionConsultarUnaCancion;
    private javax.swing.JLabel tituloFechaLanzamientoConsultarUnaCancion;
    private javax.swing.JLabel tituloNombreConsultarUnaCancion;
    private javax.swing.JTextField txtArtistaCancion;
    private javax.swing.JTextField txtCodigoConsultarUnaCancionEntrada;
    private javax.swing.JTextField txtDuracionConsultaUnaCancionEntrada;
    private javax.swing.JTextField txtNombreConsultarCancion;
    // End of variables declaration//GEN-END:variables
}
