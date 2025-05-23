/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package vista;

import acceso.AccesoArtista;
import acceso.AccesoCompania;
import java.sql.SQLException;
import modelo.Artista;
import modelo.Compania_Discografica;

/**
 *
 * @author Camilo Marín
 */
public class ActualizarArtista extends javax.swing.JInternalFrame{

    /**
     * Creates new form ActualizarArtista
     */
    public ActualizarArtista() {
        initComponents();
        jDateFechaNacimiento.getDateEditor().setEnabled(false);

    }
     private void cargarCompaniasActualizar() {
        jComboBoxCompanias.removeAllItems();
        try {
            for (Compania_Discografica compania : AccesoCompania.consultarTodos()) {
                jComboBoxCompanias.addItem(compania);
            }
        } catch (ClassNotFoundException | SQLException ex) {
            ex.printStackTrace();
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblCompania = new javax.swing.JLabel();
        txtCodigoBuscar = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        jDateFechaNacimiento = new com.toedter.calendar.JDateChooser();
        jComboBoxCompanias = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();
        lblValido = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Actualizar Artista");

        lblCodigo.setText("Codigo Artista");

        lblNombre.setText("Nombre completo");
        lblNombre.setToolTipText("");

        lblPais.setText("Pais Origen");

        lblFecha.setText("Fecha Nacimiento");

        lblCompania.setText("Compañia");

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

        btnActualizar.setText("Actualizar Canción");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        lblError.setForeground(new java.awt.Color(255, 0, 51));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblValido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitulo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCodigo)
                            .addComponent(lblNombre)
                            .addComponent(lblPais)
                            .addComponent(lblFecha)
                            .addComponent(lblCompania))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPais)
                            .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBoxCompanias, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnActualizar)))
                .addGap(117, 117, 117))
            .addComponent(lblValido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(lblError, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblValido, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigoBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFecha)
                    .addComponent(jDateFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCompanias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCompania))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnActualizar))
                .addGap(38, 38, 38))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        try {

            int codigo = Integer.parseInt(txtCodigoBuscar.getText());
            Artista artista = AccesoArtista.consultar(codigo);

            if (artista == null) {
                lblError.setText("No existe ninguna Artista con ese código.");
            } else {
                txtNombre.setText(artista.getNombreCompleto());
                txtPais.setText(artista.getPaisOrigen());
                jDateFechaNacimiento.setDate(artista.getFechaNacimiento());

                cargarCompaniasActualizar();
               Compania_Discografica companiaArtista = artista.getCompania();
               boolean Encontrado = false;
               
                for (int i = 0; i < jComboBoxCompanias.getItemCount(); i++) {
                    Compania_Discografica compania = (Compania_Discografica) jComboBoxCompanias.getItemAt(i);
                    if (compania.getIdCompania() == companiaArtista.getIdCompania()) {
                        jComboBoxCompanias.setSelectedIndex(i);
                        
                    }
                }

                txtCodigoBuscar.setEnabled(false);
                txtNombre.setEnabled(true);
                txtPais.setEnabled(true);
                jComboBoxCompanias.setEnabled(true);
                jComboBoxCompanias.setEditable(true);
                jDateFechaNacimiento.setEnabled(true);
                jDateFechaNacimiento.getDateEditor().setEnabled(false);
                
            }
        } catch (NumberFormatException nfe) {
            lblError.setText("El código de la Artista debe ser un número entero.");
        } catch (ClassNotFoundException cnfe) {
            cnfe.getStackTrace();
            lblError.setText("Error al conectar con la base de datos.");
        } catch (SQLException sqle) {
            lblError.setText("Error en la base de datos.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCodigoBuscar.setEnabled(true);
        txtNombre.setEnabled(false);
        txtPais.setEnabled(false);
        jDateFechaNacimiento.setEnabled(false);
        jComboBoxCompanias.setEnabled(false);
        txtCodigoBuscar.setText("");
        txtNombre.setText("");
        txtPais.setText("");
        jDateFechaNacimiento.setDate(null);
        jComboBoxCompanias.removeAllItems();

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed

        try {

            java.util.Date mFecha = jDateFechaNacimiento.getDate();
            java.sql.Date fechaNacimiento = null;

            if (mFecha != null) {
                fechaNacimiento = new java.sql.Date(mFecha.getTime());
            }

            int codigo = Integer.parseInt(txtCodigoBuscar.getText());
            String nombreArtista = txtNombre.getText();
            String pais = txtPais.getText();
            Compania_Discografica companiaSeleccionado = (Compania_Discografica) jComboBoxCompanias.getSelectedItem();

            Artista artista = new Artista(codigo, nombreArtista, pais, fechaNacimiento, companiaSeleccionado);

            boolean valido = AccesoArtista.modificar(artista);

            if (valido) {
                lblValido.setText("Artista actualizada correctamente");
                txtNombre.setText("");
                txtPais.setText("");
                jDateFechaNacimiento.setDate(null);
                jComboBoxCompanias.removeAllItems();
                txtCodigoBuscar.setText("");
                txtCodigoBuscar.setEnabled(true);

            } else {
                lblError.setText("Error al actualizar.");
            }
        } catch (NumberFormatException nfe) {
            lblError.setText("El código de la Artista debe ser un número entero.");
        } catch (ClassNotFoundException cnfe) {
            cnfe.getStackTrace();
            lblError.setText("Error al conectar con la base de datos.");
        } catch (SQLException sqle) {
            lblError.setText("Error en la base de datos.");
        }

    }//GEN-LAST:event_btnActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JComboBox<Compania_Discografica> jComboBoxCompanias;
    private com.toedter.calendar.JDateChooser jDateFechaNacimiento;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCompania;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblValido;
    private javax.swing.JTextField txtCodigoBuscar;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
