package vista;

import acceso.AccesoArtista;
import java.sql.SQLException;
import modelo.Artista;

/**
 *
 * @author Usuario
 */
public class ConsultaArtista extends javax.swing.JInternalFrame {

    public ConsultaArtista() {
        initComponents();
        txtNombre.setEnabled(false);
        txtPais.setEnabled(false);
        jDateFecha.setEnabled(false);
        txtCompania.setEnabled(false);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblCodigo = new javax.swing.JLabel();
        lblNombre = new javax.swing.JLabel();
        lblPais = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblCodigoCompania = new javax.swing.JLabel();
        jDateFecha = new com.toedter.calendar.JDateChooser();
        txtCodigo = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtPais = new javax.swing.JTextField();
        txtCompania = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        lblError = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setFocusCycleRoot(false);
        setVisible(true);

        lblTitulo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitulo.setText("Consulta de Artista");

        lblCodigo.setText("Codigo");

        lblNombre.setText("Nombre Completo");

        lblPais.setText("Pais origen");

        lblFecha.setText("Fecha Nacimiento");

        lblCodigoCompania.setText("Codigo compañia");

        txtNombre.setEditable(false);

        txtPais.setEditable(false);
        txtPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaisActionPerformed(evt);
            }
        });

        txtCompania.setEditable(false);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        lblError.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblError.setForeground(new java.awt.Color(255, 0, 0));
        lblError.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblNombre)
                                .addGap(51, 51, 51)
                                .addComponent(txtNombre))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblCodigoCompania)
                                .addGap(56, 56, 56)
                                .addComponent(txtCompania, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblFecha)
                            .addComponent(lblPais)
                            .addComponent(lblCodigo))
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jDateFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPais))
                        .addGap(20, 20, 20))))
            .addComponent(lblError, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitulo)
                .addGap(5, 5, 5)
                .addComponent(lblError, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPais)
                    .addComponent(txtPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jDateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFecha))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigoCompania)
                    .addComponent(txtCompania, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaisActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            lblError.setText("");
            txtNombre.setText("");
            txtPais.setText("");
            jDateFecha.setDate(null);
            txtCompania.setText("");
            int codigo = Integer.parseInt(txtCodigo.getText());
            Artista artista = AccesoArtista.consultar(codigo);
            if (artista == null) {
                lblError.setText("No existe ninguna compañía con ese código.");
            } else {
                txtNombre.setText(artista.getNombreCompleto());
                txtPais.setText(artista.getPaisOrigen());
                jDateFecha.setDate(artista.getFechaNacimiento());
                txtCompania.setText(artista.getCompania().getNombreCompania());
            }
        } catch (NumberFormatException nfe) {
            lblError.setText("El código de la compañía debe ser un número entero.");
        } catch (ClassNotFoundException cnfe) {
            cnfe.getStackTrace();
            lblError.setText("Error al conectar con la base de datos.");
        } catch (SQLException sqle) {
            lblError.setText("Error en la base de datos.");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private com.toedter.calendar.JDateChooser jDateFecha;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblCodigoCompania;
    private javax.swing.JLabel lblError;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblPais;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtCompania;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPais;
    // End of variables declaration//GEN-END:variables
}
