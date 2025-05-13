package vista;

import acceso.AccesoCompania;
import java.sql.SQLException;
import modelo.Compania_Discografica;

public class ActualizarCompania extends javax.swing.JInternalFrame {

    public ActualizarCompania() {
        initComponents();
        jDateCompania.getDateEditor().setEnabled(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        lblUbicacion = new javax.swing.JLabel();
        lblConfirmación = new javax.swing.JLabel();
        lblUbicacion1 = new javax.swing.JLabel();
        btnActualizarCompania = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        lblValido = new javax.swing.JLabel();
        txtNombreActualizar = new javax.swing.JTextField();
        txtUbicacionActualizar = new javax.swing.JTextField();
        jDateCompania = new com.toedter.calendar.JDateChooser();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Actualizar compañía");
        setVisible(true);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Actualizar compañía");

        lblCodigo.setText("Código");

        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        lblUbicacion.setText("Ubicación");

        lblConfirmación.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblConfirmación.setForeground(new java.awt.Color(255, 0, 0));
        lblConfirmación.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblUbicacion1.setText("Fecha");

        btnActualizarCompania.setText("Actualizar Compañía");
        btnActualizarCompania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarCompaniaActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        lblValido.setBackground(new java.awt.Color(51, 255, 0));
        lblValido.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        txtUbicacionActualizar.setBorder(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, Short.MAX_VALUE)
                            .addComponent(btnActualizarCompania))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblUbicacion1)
                                .addComponent(lblUbicacion)
                                .addComponent(lblNombre))
                            .addGap(21, 21, 21)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtUbicacionActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                .addComponent(jDateCompania, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblCodigo)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblConfirmación, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblValido, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtNombreActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(2, 2, 2)))))
                .addContainerGap(151, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblConfirmación, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValido))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUbicacion)
                    .addComponent(txtUbicacionActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblUbicacion1)
                    .addComponent(jDateCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizarCompania)
                    .addComponent(btnLimpiar))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            lblConfirmación.setText("");
            txtNombreActualizar.setText("");
            txtUbicacionActualizar.setText("");
            jDateCompania.setDate(null);

            int codigo = Integer.parseInt(txtCodigo.getText());
            Compania_Discografica compania = AccesoCompania.consultar(codigo);

            if (compania == null) {
                lblConfirmación.setText("No existe ninguna compañía con ese código.");
            } else {
                txtNombreActualizar.setText(compania.getNombreCompania());
                txtUbicacionActualizar.setText(compania.getUbicacion());
                jDateCompania.setDate(compania.getAnioFundacion());
                txtCodigo.setEnabled(false);
                txtNombreActualizar.setEnabled(true);
                txtUbicacionActualizar.setEnabled(true);
                jDateCompania.setEnabled(true);
                jDateCompania.getDateEditor().setEnabled(false);

            }
        } catch (NumberFormatException nfe) {
            lblConfirmación.setText("El código de la compañía debe ser un número entero.");
        } catch (ClassNotFoundException cnfe) {
            cnfe.getStackTrace();
            lblConfirmación.setText("Error al conectar con la base de datos.");
        } catch (SQLException sqle) {
            lblConfirmación.setText("Error en la base de datos.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarCompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarCompaniaActionPerformed
        try {

            java.util.Date mFecha = jDateCompania.getDate();
            java.sql.Date anioFundacion = null;

            if (mFecha != null) {
                anioFundacion = new java.sql.Date(mFecha.getTime());
            }

            int codigo = Integer.parseInt(txtCodigo.getText());
            String nombreCompania = txtNombreActualizar.getText();
            String ubicacion = txtUbicacionActualizar.getText();

            Compania_Discografica compania = new Compania_Discografica(codigo, nombreCompania, ubicacion, anioFundacion);

            boolean valido = AccesoCompania.modificar(compania);

            if (valido) {
                lblValido.setText("Compañía actualizada correctamente");
                txtNombreActualizar.setText("");
                txtUbicacionActualizar.setText("");
                txtCodigo.setText("");
                jDateCompania.setDate(null);

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
    }//GEN-LAST:event_btnActualizarCompaniaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCodigo.setEnabled(true);
        txtNombreActualizar.setEnabled(false);
        txtUbicacionActualizar.setEnabled(false);
        jDateCompania.setEnabled(false);
        
        txtCodigo.setText("");
        txtNombreActualizar.setText("");
        txtUbicacionActualizar.setText("");
        jDateCompania.setDate(null);
    }//GEN-LAST:event_btnLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizarCompania;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiar;
    private com.toedter.calendar.JDateChooser jDateCompania;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblConfirmación;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblUbicacion;
    private javax.swing.JLabel lblUbicacion1;
    private javax.swing.JLabel lblValido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtNombreActualizar;
    private javax.swing.JTextField txtUbicacionActualizar;
    // End of variables declaration//GEN-END:variables
}
