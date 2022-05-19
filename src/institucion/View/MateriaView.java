/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.View;

import institucion.Controlador.Conexion;
import institucion.Controlador.MateriaData;
import institucion.Modelo.Materia;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbara
 */
public class MateriaView extends javax.swing.JInternalFrame {

    Conexion conexion = new Conexion();

    /**
     * Creates new form MateriaView
     */
    public MateriaView() throws ClassNotFoundException {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMATERIAS = new javax.swing.JLabel();
        jCodigo = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jtCodigoMateria = new javax.swing.JTextField();
        jNombre = new javax.swing.JLabel();
        jtNombreMateria = new javax.swing.JTextField();
        jAnio = new javax.swing.JLabel();
        jtAnioMateria = new javax.swing.JTextField();
        jcEstado = new javax.swing.JCheckBox();
        jbBuscar = new javax.swing.JButton();
        jbLimpiar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();

        setClosable(true);

        jMATERIAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMATERIAS.setText("-Materias-");

        jCodigo.setBackground(new java.awt.Color(255, 255, 255));
        jCodigo.setText("Codigo");

        jNombre.setBackground(new java.awt.Color(255, 255, 255));
        jNombre.setText("Nombre ");

        jAnio.setBackground(new java.awt.Color(255, 255, 255));
        jAnio.setText("Año");

        jcEstado.setText("Estado");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jbLimpiar.setText("Limpiar");

        jbActualizar.setText("Actualizar");
        jbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbActualizarActionPerformed(evt);
            }
        });

        jbBorrar.setText("Borrar");
        jbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBorrarActionPerformed(evt);
            }
        });

        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(130, 130, 130)
                                .addComponent(jMATERIAS))
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbActualizar)
                                .addGap(18, 18, 18)
                                .addComponent(jbLimpiar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jNombre)
                                    .addComponent(jAnio, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcEstado)
                .addGap(101, 101, 101))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbBuscar)
                        .addGap(35, 35, 35))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbGuardar)
                        .addGap(28, 28, 28)
                        .addComponent(jbBorrar)
                        .addGap(213, 213, 213))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jMATERIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCodigo)
                    .addComponent(jtCodigoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNombreMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtAnioMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jAnio))
                .addGap(6, 6, 6)
                .addComponent(jcEstado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLimpiar)
                    .addComponent(jbActualizar)
                    .addComponent(jbBorrar)
                    .addComponent(jbGuardar))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        MateriaData md = new MateriaData(conexion);
        if (!"".equals(jtNombreMateria.getText()) && !"".equals(jtAnioMateria.getText()) && jcEstado.isSelected()) {
            Materia mate = new Materia(jtNombreMateria.getText(), Integer.parseInt(jtAnioMateria.getText()), jcEstado.isSelected());
            md.guardarMateria(mate);
        } else {
            JOptionPane.showMessageDialog(null, "Revise los campos: Nombre, Año y estado");
        }
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        jtNombreMateria.setText("");
        jtAnioMateria.setText("");
        MateriaData md = new MateriaData(conexion);
        if(!"".equals(jtCodigoMateria.getText())){
            Materia mate = md.buscarMateria(Integer.parseInt(jtCodigoMateria.getText()));
            if (!Objects.isNull(mate)) {
                jtNombreMateria.setText(mate.getNombre());
                jtAnioMateria.setText(Integer.toString(mate.getAnioMateria()));
                jcEstado.setSelected(mate.isActivo());
            }
        } else {
            JOptionPane.showMessageDialog(null, "Id a buscar vacio, por favor ingrese un valor");
        }


    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        MateriaData md = new MateriaData(conexion);
        md.borrarMateria(Integer.parseInt(jtCodigoMateria.getText()));
    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbActualizarActionPerformed
        MateriaData md = new MateriaData(conexion);
        if (!"".equals(jtNombreMateria.getText()) && !"".equals(jtAnioMateria.getText())) {
            Materia mate = new Materia(jtNombreMateria.getText(), Integer.parseInt(jtAnioMateria.getText()), jcEstado.isSelected());
            md.modificarMateria(mate, Integer.parseInt(jtCodigoMateria.getText()));
        } else {
            JOptionPane.showMessageDialog(null, "Revise los campos: Nombre, Año y estado");
        }

    }//GEN-LAST:event_jbActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jAnio;
    private javax.swing.JLabel jCodigo;
    private javax.swing.JLabel jMATERIAS;
    private javax.swing.JLabel jNombre;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JCheckBox jcEstado;
    private javax.swing.JTextField jtAnioMateria;
    private javax.swing.JTextField jtCodigoMateria;
    private javax.swing.JTextField jtNombreMateria;
    // End of variables declaration//GEN-END:variables
}
