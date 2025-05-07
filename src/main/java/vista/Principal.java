package vista;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        escritorio = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        menuActualizarCompania = new javax.swing.JMenu();
        menuConsultarUno = new javax.swing.JMenuItem();
        menuConsultarTodos = new javax.swing.JMenuItem();
        menuEliminarCompania = new javax.swing.JMenuItem();
        menuInsertarCompania = new javax.swing.JMenuItem();
        menuActualizarCompa = new javax.swing.JMenuItem();
        consultarCancionUno = new javax.swing.JMenu();
        consultarUnaCancion = new javax.swing.JMenuItem();
        menuConsultarTodasCanciones = new javax.swing.JMenuItem();
        eliminarCancionMenuItem = new javax.swing.JMenuItem();
        menuInsertarCancion = new javax.swing.JMenuItem();
        actualizarCancion = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menuActualizarCompania.setText("Compañía");

        menuConsultarUno.setText("Consultar");
        menuConsultarUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarUnoActionPerformed(evt);
            }
        });
        menuActualizarCompania.add(menuConsultarUno);

        menuConsultarTodos.setText("Consultar Todos");
        menuConsultarTodos.setToolTipText("");
        menuConsultarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarTodosActionPerformed(evt);
            }
        });
        menuActualizarCompania.add(menuConsultarTodos);

        menuEliminarCompania.setText("Eliminar Compañía");
        menuEliminarCompania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEliminarCompaniaActionPerformed(evt);
            }
        });
        menuActualizarCompania.add(menuEliminarCompania);

        menuInsertarCompania.setText("Insertar Compañía");
        menuInsertarCompania.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertarCompaniaActionPerformed(evt);
            }
        });
        menuActualizarCompania.add(menuInsertarCompania);

        menuActualizarCompa.setText("Actualizar Compañía");
        menuActualizarCompa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuActualizarCompaActionPerformed(evt);
            }
        });
        menuActualizarCompania.add(menuActualizarCompa);

        menuBar.add(menuActualizarCompania);

        consultarCancionUno.setText("Cancion");
        consultarCancionUno.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        consultarCancionUno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarCancionUnoActionPerformed(evt);
            }
        });

        consultarUnaCancion.setText("Consultar Uno");
        consultarUnaCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultarUnaCancionActionPerformed(evt);
            }
        });
        consultarCancionUno.add(consultarUnaCancion);

        menuConsultarTodasCanciones.setText("Consultar Todo");
        menuConsultarTodasCanciones.setActionCommand("ConsultarTodos");
        menuConsultarTodasCanciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuConsultarTodasCancionesActionPerformed(evt);
            }
        });
        consultarCancionUno.add(menuConsultarTodasCanciones);

        eliminarCancionMenuItem.setText("Eliminar Canción");
        eliminarCancionMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarCancionMenuItemActionPerformed(evt);
            }
        });
        consultarCancionUno.add(eliminarCancionMenuItem);

        menuInsertarCancion.setText("Insertar Canción");
        menuInsertarCancion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInsertarCancionActionPerformed(evt);
            }
        });
        consultarCancionUno.add(menuInsertarCancion);

        actualizarCancion.setText("Actualizar Canción");
        consultarCancionUno.add(actualizarCancion);

        menuBar.add(consultarCancionUno);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void menuConsultarUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarUnoActionPerformed
        if (formularioConsultaUno == null || formularioConsultaUno.isClosed()) {
            formularioConsultaUno = new ConsultaCompania();
            escritorio.add(formularioConsultaUno);
            formularioConsultaUno.setVisible(true);
        }
    }//GEN-LAST:event_menuConsultarUnoActionPerformed

    private void menuConsultarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarTodosActionPerformed
        if (formularioConsultaTodos == null || formularioConsultaTodos.isClosed()) {
            formularioConsultaTodos = new ConsultaTodosCompanias();
            escritorio.add(formularioConsultaTodos);
            formularioConsultaTodos.setVisible(true);
        }
    }//GEN-LAST:event_menuConsultarTodosActionPerformed


    private void menuEliminarCompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEliminarCompaniaActionPerformed
        if (eliminarCompania == null || eliminarCompania.isClosed()) {
            eliminarCompania = new EliminarCompania();
            escritorio.add(eliminarCompania);
            eliminarCompania.setVisible(true);
        }
    }//GEN-LAST:event_menuEliminarCompaniaActionPerformed

    private void menuInsertarCompaniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertarCompaniaActionPerformed
        if (insertarCompania == null || insertarCompania.isClosed()) {
            insertarCompania = new InsertarCompania();
            escritorio.add(insertarCompania);
            insertarCompania.setVisible(true);
        }
    }//GEN-LAST:event_menuInsertarCompaniaActionPerformed

    private void menuActualizarCompaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuActualizarCompaActionPerformed
        if (actualizarCompania == null || actualizarCompania.isClosed()) {
            actualizarCompania = new ActualizarCompania();
            escritorio.add(actualizarCompania);
            actualizarCompania.setVisible(true);
        }
    }//GEN-LAST:event_menuActualizarCompaActionPerformed
    /**
     * ****************************** CANCION***********************
     */


    private void consultarUnaCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarUnaCancionActionPerformed
        if (formularioConsultaUnaCancion == null || formularioConsultaUnaCancion.isClosed()) {
            formularioConsultaUnaCancion = new ConsultarUnaCancion();

            escritorio.add(formularioConsultaUnaCancion);
            formularioConsultaUnaCancion.setVisible(true);
        }

    }//GEN-LAST:event_consultarUnaCancionActionPerformed


    private void menuConsultarTodasCancionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuConsultarTodasCancionesActionPerformed

        if (formularioConsultarTodasCanciones == null || formularioConsultarTodasCanciones.isClosed()) {
            formularioConsultarTodasCanciones = new ConsultarTodasCanciones();
            escritorio.add(formularioConsultarTodasCanciones);
            formularioConsultarTodasCanciones.setVisible(true);
        }
    }//GEN-LAST:event_menuConsultarTodasCancionesActionPerformed

    private void eliminarCancionMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarCancionMenuItemActionPerformed
         if (eliminarCancion == null || eliminarCancion.isClosed()) {
            eliminarCancion = new EliminarCancion();
            escritorio.add(eliminarCancion);
            eliminarCancion.setVisible(true);
        }
    }//GEN-LAST:event_eliminarCancionMenuItemActionPerformed
/*************************Se quedo esto de la anterior clase que habia creado, no puedo elimnar preguntar a Cami  ******************/
    
    
    private void consultarCancionUnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultarCancionUnoActionPerformed


    }//GEN-LAST:event_consultarCancionUnoActionPerformed

    private void menuInsertarCancionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInsertarCancionActionPerformed
       
          if (insertarCancion == null || insertarCancion.isClosed()) {
            insertarCancion = new InsertarCancion();
            escritorio.add(insertarCancion);
            insertarCancion.setVisible(true);
        }
        
    }//GEN-LAST:event_menuInsertarCancionActionPerformed
  
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem actualizarCancion;
    private javax.swing.JMenu consultarCancionUno;
    private javax.swing.JMenuItem consultarUnaCancion;
    private javax.swing.JMenuItem eliminarCancionMenuItem;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem menuActualizarCompa;
    private javax.swing.JMenu menuActualizarCompania;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem menuConsultarTodasCanciones;
    private javax.swing.JMenuItem menuConsultarTodos;
    private javax.swing.JMenuItem menuConsultarUno;
    private javax.swing.JMenuItem menuEliminarCompania;
    private javax.swing.JMenuItem menuInsertarCancion;
    private javax.swing.JMenuItem menuInsertarCompania;
    // End of variables declaration//GEN-END:variables

    /**
     * *****************COMPAÑIA**********************
     */
    ConsultaCompania formularioConsultaUno = null;
    ConsultaTodosCompanias formularioConsultaTodos = null;
    EliminarCompania eliminarCompania = null;
    InsertarCompania insertarCompania = null;
    ActualizarCompania actualizarCompania = null;

    /**
     * *********************CANCION****************************
     */
    ConsultarTodasCanciones formularioConsultarTodasCanciones = null;
    ConsultarUnaCancion formularioConsultaUnaCancion = null;
    EliminarCancion eliminarCancion = null;
    InsertarCancion insertarCancion = null;

    /**
     * **********VARIABLES***********************
     */
}
