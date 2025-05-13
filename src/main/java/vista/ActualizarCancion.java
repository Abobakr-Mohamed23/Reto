package vista;

import acceso.AccesoArtista;
import acceso.AccesoCancion;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Artista;
import modelo.Cancion;

public class ActualizarCancion extends javax.swing.JInternalFrame {

    public ActualizarCancion() {
        initComponents();
        jDateFechaLanzamiento.getDateEditor().setEnabled(false);
        desactivar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblCodigo1 = new javax.swing.JLabel();
        lblCodigo2 = new javax.swing.JLabel();
        lblCodigo3 = new javax.swing.JLabel();
        lblCodigo4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtCodigoBuscar = new javax.swing.JTextField();
        txtNombreCancion = new javax.swing.JTextField();
        txtDuracionCancion = new javax.swing.JTextField();
        jDateFechaLanzamiento = new com.toedter.calendar.JDateChooser();
        comboBoxArtistaCancion = new javax.swing.JComboBox();
        btnLimpiar = new javax.swing.JButton();
        btnActualizarCancion = new javax.swing.JButton();
        lblConfirmación = new javax.swing.JLabel();
        lblValido = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Actualizar Canción");
        setToolTipText("");
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

        lblCodigo1.setText("Nombre canción");

        lblCodigo2.setText("Fecha de lanzamiento");

        lblCodigo3.setText("Duración");

        lblCodigo4.setText("Artista");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar Campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnActualizarCancion.setText("Actualizar Canción");
        btnActualizarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCancionActionPerformed(evt);
            }
        });

        lblConfirmación.setForeground(new java.awt.Color(255, 0, 51));

        jLabel1.setText("(Minutos)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblConfirmación, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblValido, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblCodigo)
                                .addComponent(lblCodigo4)
                                .addComponent(lblCodigo3)
                                .addComponent(lblCodigo2)
                                .addComponent(lblCodigo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(118, 118, 118)
                        .addComponent(btnActualizarCancion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(25, 25, 25)
                                .addComponent(btnBuscar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtDuracionCancion)
                                .addComponent(jDateFechaLanzamiento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 226, Short.MAX_VALUE)
                                .addComponent(txtNombreCancion, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(comboBoxArtistaCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblConfirmación, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblValido, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo1)
                    .addComponent(txtNombreCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCodigo2)
                    .addComponent(jDateFechaLanzamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo3)
                    .addComponent(txtDuracionCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo4)
                    .addComponent(comboBoxArtistaCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnActualizarCancion))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {

            int codigo = Integer.parseInt(txtCodigoBuscar.getText());
            Cancion cancion = AccesoCancion.consultar(codigo);

            if (cancion == null) {
                lblConfirmación.setText("No existe ninguna canción con ese código.");
            } else {
                txtNombreCancion.setText(cancion.getNombreCancion());
                txtDuracionCancion.setText(Double.toString(cancion.getDuracion()));
                jDateFechaLanzamiento.setDate(cancion.getFechaLanzamiento());

                cargarArtistasActualizar();
                Artista artistaCancion = cancion.getArtista();
                for (int i = 0; i < comboBoxArtistaCancion.getItemCount(); i++) {
                    Artista artista = (Artista) comboBoxArtistaCancion.getItemAt(i);
                    if (artista.getIdArtista() == artistaCancion.getIdArtista()) {
                        comboBoxArtistaCancion.setSelectedIndex(i);
                        break;
                    }
                }

                activar();

            }
        } catch (NumberFormatException nfe) {
            lblConfirmación.setText("El código de la canción debe ser un número entero.");
        } catch (ClassNotFoundException cnfe) {
            cnfe.getStackTrace();
            lblConfirmación.setText("Error al conectar con la base de datos.");
        } catch (SQLException sqle) {
            lblConfirmación.setText("Error en la base de datos.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void activar() {

        txtCodigoBuscar.setEnabled(false);
        txtNombreCancion.setEnabled(true);
        txtDuracionCancion.setEnabled(true);
        jDateFechaLanzamiento.setEnabled(true);
        comboBoxArtistaCancion.setEnabled(true);
        jDateFechaLanzamiento.setEnabled(true);
        jDateFechaLanzamiento.getDateEditor().setEnabled(false);

    }

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        desactivar();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void desactivar() {
        txtCodigoBuscar.setEnabled(true);
        txtNombreCancion.setEnabled(false);
        txtDuracionCancion.setEnabled(false);
        jDateFechaLanzamiento.setEnabled(false);
        comboBoxArtistaCancion.setEnabled(false);
        txtCodigoBuscar.setText("");
        txtNombreCancion.setText("");
        txtDuracionCancion.setText("");
        jDateFechaLanzamiento.setDate(null);
        comboBoxArtistaCancion.removeAllItems();
    }
    private void btnActualizarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCancionActionPerformed

        try {

            java.util.Date mFecha = jDateFechaLanzamiento.getDate();
            java.sql.Date anioFundacion = null;

            if (mFecha != null) {
                anioFundacion = new java.sql.Date(mFecha.getTime());
            }

            int codigo = Integer.parseInt(txtCodigoBuscar.getText());
            String nombreCancion = txtNombreCancion.getText();
            Double duracion = Double.parseDouble(txtDuracionCancion.getText());
            Artista artistaSeleccionado = (Artista) comboBoxArtistaCancion.getSelectedItem();

            Cancion cancion = new Cancion(codigo, nombreCancion, anioFundacion, duracion, artistaSeleccionado);

            boolean valido = AccesoCancion.modificar(cancion);

            if (valido) {
                lblValido.setText("Canción actualizada correctamente");
                limpiar();
                desactivar();

            } else {
                lblConfirmación.setText("Error al actualizar.");
            }
        } catch (NumberFormatException nfe) {
            lblConfirmación.setText("El código de la compañía debe ser un número entero.");
        } catch (ClassNotFoundException cnfe) {
            cnfe.getStackTrace();
            lblConfirmación.setText("Error al conectar con la base de datos.");
        } catch (SQLException sqle) {
            lblConfirmación.setText("Error en la base de datos.");
        }


    }//GEN-LAST:event_btnActualizarCancionActionPerformed

    private void cargarArtistasActualizar() {
        comboBoxArtistaCancion.removeAllItems();
        try {
            for (Artista artista : AccesoArtista.consultarTodos()) {
                comboBoxArtistaCancion.addItem(artista);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }

    private void limpiar() {
        lblConfirmación.setText("");
        txtNombreCancion.setText("");
        txtDuracionCancion.setText("");
        comboBoxArtistaCancion.removeAllItems();
        jDateFechaLanzamiento.setDate(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCancion;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox comboBoxArtistaCancion;
    private com.toedter.calendar.JDateChooser jDateFechaLanzamiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigo1;
    private javax.swing.JLabel lblCodigo2;
    private javax.swing.JLabel lblCodigo3;
    private javax.swing.JLabel lblCodigo4;
    private javax.swing.JLabel lblConfirmación;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValido;
    private javax.swing.JTextField txtCodigoBuscar;
    private javax.swing.JTextField txtDuracionCancion;
    private javax.swing.JTextField txtNombreCancion;
    // End of variables declaration//GEN-END:variables
}
