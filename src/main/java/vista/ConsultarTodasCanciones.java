package vista;

import acceso.AccesoCancion;
import modelo.Cancion;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class ConsultarTodasCanciones extends javax.swing.JInternalFrame {

    public ConsultarTodasCanciones() {
        initComponents();
        lblErrorConsultarTodasCanciones.setText("");

       
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Código");
        modelo.addColumn("Nombre canción");
        modelo.addColumn("Fecha Lanzamiento");
        modelo.addColumn("Duración");
        modelo.addColumn("Artista");
        tablaConsultarTodasCanciones.setModel(modelo);
        Object[] fila;
        try {
            for (Cancion cancion : AccesoCancion.consultarTodos()) {
                fila = new Object[5];
                fila[0] = cancion.getIdCancion();
                fila[1] = cancion.getNombreCancion();
                fila[2] = cancion.getFechaLanzamiento();
                fila[3] = cancion.getDuracion();
                fila[4] = cancion.getArtista().getNombreCompleto();

                modelo.addRow(fila);

            }
        } catch (ClassNotFoundException cnfe) {
            lblErrorConsultarTodasCanciones.setText("Error al conectar a la Base de Datos.");
        } catch (SQLException sqle) {
            lblErrorConsultarTodasCanciones.setText("Error de SQL.");

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloListaConsultarTodasCanciones = new javax.swing.JLabel();
        lblErrorConsultarTodasCanciones = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaConsultarTodasCanciones = new javax.swing.JTable();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Gestión de Canciones");

        lblTituloListaConsultarTodasCanciones.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lblTituloListaConsultarTodasCanciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTituloListaConsultarTodasCanciones.setText("Listado de Todas las Canciones");

        lblErrorConsultarTodasCanciones.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblErrorConsultarTodasCanciones.setForeground(new java.awt.Color(255, 0, 51));
        lblErrorConsultarTodasCanciones.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblErrorConsultarTodasCanciones.setText("Mensaje de error");

        jScrollPane1.setViewportView(tablaConsultarTodasCanciones);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(lblTituloListaConsultarTodasCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 393, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addComponent(lblErrorConsultarTodasCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(lblTituloListaConsultarTodasCanciones, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblErrorConsultarTodasCanciones)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(78, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblErrorConsultarTodasCanciones;
    private javax.swing.JLabel lblTituloListaConsultarTodasCanciones;
    private javax.swing.JTable tablaConsultarTodasCanciones;
    // End of variables declaration//GEN-END:variables
/**
     * ** preguntar***
     */

}
