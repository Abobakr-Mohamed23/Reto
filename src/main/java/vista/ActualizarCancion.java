package vista;

import acceso.AccesoCancion;
import java.sql.SQLException;
import modelo.Artista;
import modelo.Cancion;

public class ActualizarCancion extends javax.swing.JInternalFrame {

    public ActualizarCancion() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCodigoCancionvista = new javax.swing.JLabel();
        lblNombreCancionVista = new javax.swing.JLabel();
        lblDuracionCancionVista = new javax.swing.JLabel();
        lblFechaLanzamientoVista = new javax.swing.JLabel();
        txtCodigoCancionEntrada = new javax.swing.JTextField();
        txtDuracionCancionActualizarEntrada = new javax.swing.JTextField();
        jDateCancionActualizarEntrada = new com.toedter.calendar.JDateChooser();
        btnLimpiarCamposActualizarCancion = new javax.swing.JButton();
        btnActualizarCancionConfirmacion = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        txtNombreCancionActualizarEntrada = new javax.swing.JTextField();
        lblErrorActualizar = new javax.swing.JLabel();
        lblValidacionCancionActualizar = new javax.swing.JLabel();
        comboBoxArtista = new javax.swing.JComboBox();
        jLabelCancionArtistaVista = new javax.swing.JLabel();
        txtArtistaCancion1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Actualizar Canción");

        lblCodigoCancionvista.setText("Código de Canción");

        lblNombreCancionVista.setText("Nombre");

        lblDuracionCancionVista.setText("Duracion");

        lblFechaLanzamientoVista.setText("Fecha de Lanzamiento");

        btnLimpiarCamposActualizarCancion.setText("Limpiar campos");
        btnLimpiarCamposActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarCamposActualizarCancionActionPerformed(evt);
            }
        });

        btnActualizarCancionConfirmacion.setText("Actualizar Compañía");
        btnActualizarCancionConfirmacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCancionConfirmacionActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblErrorActualizar.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblErrorActualizar.setForeground(new java.awt.Color(255, 0, 0));
        lblErrorActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblValidacionCancionActualizar.setBackground(new java.awt.Color(51, 255, 0));
        lblValidacionCancionActualizar.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        comboBoxArtista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxArtistaActionPerformed(evt);
            }
        });

        jLabelCancionArtistaVista.setText("Artista");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigoCancionvista)
                    .addComponent(lblNombreCancionVista)
                    .addComponent(lblFechaLanzamientoVista)
                    .addComponent(lblDuracionCancionVista)
                    .addComponent(jLabelCancionArtistaVista))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(248, 248, 248))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCodigoCancionEntrada)
                            .addComponent(jDateCancionActualizarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtNombreCancionActualizarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(txtDuracionCancionActualizarEntrada, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                            .addComponent(comboBoxArtista, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(txtArtistaCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(149, 149, 149))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(lblErrorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(btnLimpiarCamposActualizarCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(btnActualizarCancionConfirmacion)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(lblValidacionCancionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(lblTitulo)
                .addGap(18, 18, 18)
                .addComponent(lblErrorActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoCancionvista)
                    .addComponent(txtCodigoCancionEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreCancionVista)
                    .addComponent(txtNombreCancionActualizarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaLanzamientoVista)
                    .addComponent(jDateCancionActualizarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDuracionCancionVista)
                    .addComponent(txtDuracionCancionActualizarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboBoxArtista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCancionArtistaVista)
                    .addComponent(txtArtistaCancion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addComponent(lblValidacionCancionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiarCamposActualizarCancion)
                    .addComponent(btnActualizarCancionConfirmacion))
                .addContainerGap(61, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarCamposActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarCamposActualizarCancionActionPerformed
        txtCodigoCancionEntrada.setEnabled(true);
        txtNombreCancionActualizarEntrada.setEnabled(false);
        txtDuracionCancionActualizarEntrada.setEnabled(false);
        jDateCancionActualizarEntrada.setEnabled(false);

        txtCodigoCancionEntrada.setText("");
        txtNombreCancionActualizarEntrada.setText("");
        txtDuracionCancionActualizarEntrada.setText("");
        jDateCancionActualizarEntrada.setDate(null);


    }//GEN-LAST:event_btnLimpiarCamposActualizarCancionActionPerformed

    private void btnActualizarCancionConfirmacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCancionConfirmacionActionPerformed
        try {

            java.util.Date mFecha = jDateCancionActualizarEntrada.getDate();
            java.sql.Date anioFundacion = null;

            if (mFecha != null) {
                anioFundacion = new java.sql.Date(mFecha.getTime());
            }

            int codigo = Integer.parseInt(txtCodigoCancionEntrada.getText());
            String nombreCancion = txtDuracionCancionActualizarEntrada.getText();
            Double duracion = Double.parseDouble(txtDuracionCancionActualizarEntrada.getText());
            /**
             * *************preguntar camilo *************
             */
            Artista artista = (Artista) comboBoxArtista.getSelectedItem();

            if (artista != null) {
                Cancion cancion = new Cancion(codigo, nombreCancion, anioFundacion, 0, artista);
                boolean valido = AccesoCancion.modificar(cancion);

                if (valido) {
                    lblValidacionCancionActualizar.setText("Compañía actualizada correctamente");
                    txtNombreCancionActualizarEntrada.setText("");
                    jDateCancionActualizarEntrada.setDate(null);
                    txtDuracionCancionActualizarEntrada.setText("");

                } else {
                    lblErrorActualizar.setText("Error al actualizar.");
                }
            }

        } catch (NumberFormatException nfe) {
            lblErrorActualizar.setText("El código de la canción debe ser un número entero.");
        } catch (ClassNotFoundException cnfe) {
            cnfe.getStackTrace();
            lblErrorActualizar.setText("Error al conectar con la base de datos.");
        } catch (SQLException sqle) {
            lblErrorActualizar.setText("Error en la base de datos.");
        }
    }//GEN-LAST:event_btnActualizarCancionConfirmacionActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            lblErrorActualizar.setText("");
            txtNombreCancionActualizarEntrada.setText("");
            jDateCancionActualizarEntrada.setDate(null);
            txtDuracionCancionActualizarEntrada.setText("");

            int codigo = Integer.parseInt(txtCodigoCancionEntrada.getText());
            Cancion cancion = AccesoCancion.consultar(codigo);

            if (cancion == null) {
                lblErrorActualizar.setText("No existe ninguna compañía con ese código.");
            } else {
                txtCodigoCancionEntrada.setEnabled(false);
                txtNombreCancionActualizarEntrada.setText(cancion.getNombreCancion());
                jDateCancionActualizarEntrada.setDate(cancion.getFechaLanzamiento());

                /**
                 * ******preguntar*****
                 */
                txtNombreCancionActualizarEntrada.setEnabled(true);
                jDateCancionActualizarEntrada.setEnabled(true);
                txtDuracionCancionActualizarEntrada.setEnabled(true);

            }
        } catch (NumberFormatException nfe) {
            lblErrorActualizar.setText("El código de la canción debe ser un número entero.");
        } catch (ClassNotFoundException cnfe) {
            cnfe.getStackTrace();
            lblErrorActualizar.setText("Error al conectar con la base de datos.");
        } catch (SQLException sqle) {
            lblErrorActualizar.setText("Error en la base de datos.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void comboBoxArtistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxArtistaActionPerformed

        Artista artistaSeleccionado = (Artista) comboBoxArtista.getSelectedItem();

        if (artistaSeleccionado != null) {

            int idArtista = artistaSeleccionado.getIdArtista();

            txtArtistaCancion1.setText(artistaSeleccionado.getNombreCompleto());

        }

    }//GEN-LAST:event_comboBoxArtistaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCancionConfirmacion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiarCamposActualizarCancion;
    private javax.swing.JComboBox comboBoxArtista;
    private com.toedter.calendar.JDateChooser jDateCancionActualizarEntrada;
    private javax.swing.JLabel jLabelCancionArtistaVista;
    private javax.swing.JLabel lblCodigoCancionvista;
    private javax.swing.JLabel lblDuracionCancionVista;
    private javax.swing.JLabel lblErrorActualizar;
    private javax.swing.JLabel lblFechaLanzamientoVista;
    private javax.swing.JLabel lblNombreCancionVista;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValidacionCancionActualizar;
    private javax.swing.JTextField txtArtistaCancion1;
    private javax.swing.JTextField txtCodigoCancionEntrada;
    private javax.swing.JTextField txtDuracionCancionActualizarEntrada;
    private javax.swing.JTextField txtNombreCancionActualizarEntrada;
    // End of variables declaration//GEN-END:variables
}
