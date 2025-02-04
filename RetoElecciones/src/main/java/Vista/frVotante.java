/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.ctlEleccion;
import clases.clsVotante;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author TOSHIBA
 */
public class frVotante extends javax.swing.JFrame {

    /**
     * Creates new form frVotante
     */
    ctlEleccion ctlEleccion;
    JFrame frMenu;

    public frVotante(JFrame frMenu) {
        initComponents();
        this.ctlEleccion = new ctlEleccion();
        this.frMenu = frMenu;

        this.btnEliminarVotante.setVisible(false);
        this.btnModVotante.setVisible(false);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtIdCandidato = new javax.swing.JTextField();
        cbGenero = new javax.swing.JComboBox<>();
        txtNombreCandidato = new javax.swing.JTextField();
        txtTelCandidato = new javax.swing.JTextField();
        txtPartidoPolitico = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbCiudadCandidato = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtIdVotante = new javax.swing.JTextField();
        cbGeneroVotante = new javax.swing.JComboBox<>();
        txtNombreVotante = new javax.swing.JTextField();
        txtTelVotante = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cbCiudadVotante = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        txtEdadVotante = new javax.swing.JTextField();
        menuPrincipalV = new javax.swing.JButton();
        btnGuardarVotante = new javax.swing.JButton();
        btnModVotante = new javax.swing.JButton();
        btnEliminarVotante = new javax.swing.JButton();
        btnBuscarVotante = new javax.swing.JButton();

        jLabel8.setText("Partido Politico");

        jLabel9.setText("Ciudad Origen");

        cbGenero.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        cbGenero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroActionPerformed(evt);
            }
        });

        jLabel4.setText("Genero");

        jLabel5.setText("Numero de Documento");

        jLabel6.setText("Nombre");

        jLabel7.setText("Telefono");

        cbCiudadCandidato.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOGOTÁ", "MEDELLÍN", "CALI", "BARRANQUILLA", "CARTAGENA", "CÚCUTA", "SOLEDAD", "IBAGUÉ", "BUCARAMANGA", "SANTA MARTA", "VILLAVICENCIO", "SOACHA", "PEREIRA", "BELLO", "VALLEDUPAR", "MONTERÍA", "PASTO", "MANIZALES", "BUENAVENTURA", "NEIVA", "BARRANCABERMEJA", "PALMIRA", "ARMENIA", "POPAYÁN", "SINCELEJO", "ITAGUI", "FLORIDABLANCA", "RIOHACHA", "ENVIGADO", "TULUÁ", "DOSQUEBRADAS", "SAN ANDRÉS DE TUMACO", "TUNJA", "GIRÓN", "APARTADÓ", "FLORENCIA", "URIBIA", "IPIALES", "TURBO", "MAICAO", "PIEDECUESTA", "YOPAL", "OCAÑA", "FUSAGASUGÁ", "CARTAGO", "FACATATIVÁ", "CHÍA", "MAGANGUÉ", "PITALITO", "CAUCASIA", "ZIPAQUIRÁ", "MALAMBO", "RIONEGRO", "LORICA", "JAMUNDI", "QUIBDÓ", "GUADALAJARA DE BUGA", "YUMBO", "SOGAMOSO", "DUITAMA", "GIRARDOT", "CIÉNAGA" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 2, 24)); // NOI18N
        jLabel3.setText("SISTEMA DE ELECCIONES");

        jLabel10.setText("Correo electronico");

        jLabel11.setText("Ciudad Votación");

        cbGeneroVotante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculino", "Femenino", "Otro" }));
        cbGeneroVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbGeneroVotanteActionPerformed(evt);
            }
        });

        jLabel12.setText("Genero");

        jLabel13.setText("Numero de Documento");

        jLabel14.setText("Nombre");

        jLabel15.setText("Telefono");

        cbCiudadVotante.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BOGOTÁ", "MEDELLÍN", "CALI", "BARRANQUILLA", "CARTAGENA", "CÚCUTA", "SOLEDAD", "IBAGUÉ", "BUCARAMANGA", "SANTA MARTA", "VILLAVICENCIO", "SOACHA", "PEREIRA", "BELLO", "VALLEDUPAR", "MONTERÍA", "PASTO", "MANIZALES", "BUENAVENTURA", "NEIVA", "BARRANCABERMEJA", "PALMIRA", "ARMENIA", "POPAYÁN", "SINCELEJO", "ITAGUI", "FLORIDABLANCA", "RIOHACHA", "ENVIGADO", "TULUÁ", "DOSQUEBRADAS", "SAN ANDRÉS DE TUMACO", "TUNJA", "GIRÓN", "APARTADÓ", "FLORENCIA", "URIBIA", "IPIALES", "TURBO", "MAICAO", "PIEDECUESTA", "YOPAL", "OCAÑA", "FUSAGASUGÁ", "CARTAGO", "FACATATIVÁ", "CHÍA", "MAGANGUÉ", "PITALITO", "CAUCASIA", "ZIPAQUIRÁ", "MALAMBO", "RIONEGRO", "LORICA", "JAMUNDI", "QUIBDÓ", "GUADALAJARA DE BUGA", "YUMBO", "SOGAMOSO", "DUITAMA", "GIRARDOT", "CIÉNAGA" }));

        jLabel1.setText("Edad");

        txtEdadVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadVotanteActionPerformed(evt);
            }
        });

        menuPrincipalV.setText("Menu Principal");
        menuPrincipalV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuPrincipalVActionPerformed(evt);
            }
        });

        btnGuardarVotante.setText("GUARDAR");
        btnGuardarVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVotanteActionPerformed(evt);
            }
        });

        btnModVotante.setText("MODIFICAR");
        btnModVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModVotanteActionPerformed(evt);
            }
        });

        btnEliminarVotante.setText("ELIMINAR");
        btnEliminarVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarVotanteActionPerformed(evt);
            }
        });

        btnBuscarVotante.setText("BUSCAR");
        btnBuscarVotante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarVotanteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtTelVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtIdVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnBuscarVotante))
                                .addGap(17, 17, 17))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(menuPrincipalV)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(84, 84, 84)
                                .addComponent(txtEdadVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbCiudadVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnGuardarVotante)
                                    .addComponent(jLabel10))
                                .addGap(55, 55, 55)
                                .addComponent(btnModVotante)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminarVotante)))
                        .addContainerGap(31, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel12)
                        .addComponent(jLabel14))
                    .addGap(66, 66, 66)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(2, 2, 2)
                            .addComponent(cbGeneroVotante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(txtNombreVotante, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(jLabel15))
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(32, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menuPrincipalV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtIdVotante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtTelVotante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEdadVotante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11)
                    .addComponent(cbCiudadVotante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnModVotante)
                            .addComponent(btnEliminarVotante))
                        .addGap(44, 44, 44))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarVotante)
                            .addComponent(btnBuscarVotante))
                        .addGap(34, 34, 34))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(99, 99, 99)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(cbGeneroVotante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel14)
                        .addComponent(jLabel15)
                        .addComponent(txtNombreVotante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(149, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbGeneroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroActionPerformed

    private void cbGeneroVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbGeneroVotanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbGeneroVotanteActionPerformed

    private void txtEdadVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadVotanteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadVotanteActionPerformed

    private void menuPrincipalVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuPrincipalVActionPerformed
        this.setVisible(false);
        this.frMenu.setVisible(true);
    }//GEN-LAST:event_menuPrincipalVActionPerformed

    private void btnGuardarVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVotanteActionPerformed
        try {
            String genero = cbGeneroVotante.getSelectedItem().toString();
            String id = txtIdVotante.getText();
            String nombre = txtNombreVotante.getText();
            String telefono = txtTelVotante.getText();
            String correo = txtCorreo.getText();
            String edad = txtEdadVotante.getText();
            String ciudad = cbCiudadVotante.getSelectedItem().toString();

            if (id.equals("") || nombre.equals("") || telefono.equals("") || correo.equals("") || edad.equals("")) {
                JOptionPane.showMessageDialog(this, "Por favor agregue todos los datos");
            } else {
                clsVotante votante = new clsVotante(correo, edad, ciudad, id, nombre, telefono, genero);
                this.ctlEleccion.crearVotante(votante);
                JOptionPane.showMessageDialog(this, "La información ha sido almacenada!");
                eliminarCampos();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Agregue los datos correctos");
            JOptionPane.showMessageDialog(this, "El error es: " + e.getLocalizedMessage());
        }
    }//GEN-LAST:event_btnGuardarVotanteActionPerformed

    private void btnBuscarVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarVotanteActionPerformed
        String id = txtIdVotante.getText();
        clsVotante votante = (clsVotante) ctlEleccion.buscarVotante(id);

        if (votante == null) {
            JOptionPane.showMessageDialog(this, "Documento no encontrado");
        } else {
            cbGeneroVotante.setSelectedItem(votante.getGenero());
            txtIdVotante.setText(votante.getIdDocumento());
            txtNombreVotante.setText(votante.getNombre());
            txtTelVotante.setText(votante.getTelefono());
            txtCorreo.setText(votante.getCorreo());
            txtEdadVotante.setText(votante.getEdad());
            cbCiudadVotante.setSelectedItem(votante.getCiuadVotacion());

            this.btnGuardarVotante.setEnabled(false);
            this.txtIdCandidato.setEnabled(false);
            this.btnEliminarVotante.setVisible(true);
            this.btnModVotante.setVisible(true);

            JOptionPane.showMessageDialog(rootPane, "Si desea modificar sus datos,\n" + ""
                    + "corrijalos y de click en el boton 'Modificar'\n\n"
                    + "Dar click en 'Eliminar' si desea eliminar su registro");
        }

    }//GEN-LAST:event_btnBuscarVotanteActionPerformed

    private void btnModVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModVotanteActionPerformed

        String genero = cbGeneroVotante.getSelectedItem().toString();
        String nombre = txtNombreVotante.getText();
        String telefono = txtTelVotante.getText();
        String correo = txtCorreo.getText();
        String edad = txtEdadVotante.getText();
        String ciudad = cbCiudadVotante.getSelectedItem().toString();

        try {
            String id = txtIdVotante.getText();
            clsVotante votante = new clsVotante(correo, edad, ciudad, id, nombre, telefono, genero);
            boolean respuesta = this.ctlEleccion.modificarVotante(votante);
            if (!respuesta) {
                JOptionPane.showMessageDialog(this,"Error en la modificacion de la informacion");
            } else {
                JOptionPane.showMessageDialog(this, "Informacion modificada con exito");
                eliminarCampos();
                this.txtIdVotante.setEnabled(true);
                this.btnGuardarVotante.setEnabled(true);
                this.btnModVotante.setVisible(false);
                this.btnEliminarVotante.setVisible(false);
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnModVotanteActionPerformed

    private void btnEliminarVotanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarVotanteActionPerformed
        try {
            String id = txtIdVotante.getText();
            boolean respuesta = this.ctlEleccion.eliminarVotante(id);
            if (!respuesta) {
                JOptionPane.showMessageDialog(this, "Registro NO eliminado");
            } else {
                JOptionPane.showMessageDialog(this, "Registro eliminado con exito");
                eliminarCampos();
                this.btnGuardarVotante.setEnabled(true);
                this.txtIdVotante.setEnabled(true);
                this.btnModVotante.setVisible(false);
                this.btnEliminarVotante.setVisible(false);

            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnEliminarVotanteActionPerformed

    public void eliminarCampos() {
        cbGeneroVotante.setSelectedIndex(0);
        txtIdVotante.setText("");
        txtNombreVotante.setText("");
        txtTelVotante.setText("");
        txtCorreo.setText("");
        txtEdadVotante.setText("");
        cbCiudadVotante.setSelectedIndex(0);
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(frVotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frVotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frVotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frVotante.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frVotante(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarVotante;
    private javax.swing.JButton btnEliminarVotante;
    private javax.swing.JButton btnGuardarVotante;
    private javax.swing.JButton btnModVotante;
    private javax.swing.JComboBox<String> cbCiudadCandidato;
    private javax.swing.JComboBox<String> cbCiudadVotante;
    private javax.swing.JComboBox<String> cbGenero;
    private javax.swing.JComboBox<String> cbGeneroVotante;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton menuPrincipalV;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtEdadVotante;
    private javax.swing.JTextField txtIdCandidato;
    private javax.swing.JTextField txtIdVotante;
    private javax.swing.JTextField txtNombreCandidato;
    private javax.swing.JTextField txtNombreVotante;
    private javax.swing.JTextField txtPartidoPolitico;
    private javax.swing.JTextField txtTelCandidato;
    private javax.swing.JTextField txtTelVotante;
    // End of variables declaration//GEN-END:variables
}
