/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.View;

/**
 *
 * @author Barbara
 */
public class AlumnoView extends javax.swing.JInternalFrame {

    /**
     * Creates new form AlumnoView
     */
    public AlumnoView() {
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
        jSeparator1 = new javax.swing.JSeparator();
        jLegajo = new javax.swing.JLabel();
        jtidAlumno = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jLegajo1 = new javax.swing.JLabel();
        jtFechaNac = new javax.swing.JTextField();
        jNombreAlumno = new javax.swing.JLabel();
        jtApellidoAlumno = new javax.swing.JTextField();
        jFechaNac = new javax.swing.JLabel();
        jtNombreAlumno = new javax.swing.JTextField();
        jcEstado = new javax.swing.JCheckBox();
        jbLimpiar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();

        jMATERIAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMATERIAS.setText("-Alumnos-");

        jLegajo.setBackground(new java.awt.Color(255, 255, 255));
        jLegajo.setText("Lejajo");

        jbBuscar.setText("Buscar");

        jLegajo1.setBackground(new java.awt.Color(255, 255, 255));
        jLegajo1.setText("Apellido");

        jtFechaNac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtFechaNacActionPerformed(evt);
            }
        });

        jNombreAlumno.setBackground(new java.awt.Color(255, 255, 255));
        jNombreAlumno.setText("Nombre");

        jtApellidoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtApellidoAlumnoActionPerformed(evt);
            }
        });

        jFechaNac.setBackground(new java.awt.Color(255, 255, 255));
        jFechaNac.setText("Fecha Nac");

        jtNombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNombreAlumnoActionPerformed(evt);
            }
        });

        jcEstado.setText("Estado");

        jbLimpiar.setText("Limpiar");

        jbActualizar.setText("Actualizar");

        jbBorrar.setText("Borrar");

        jbGuardar.setText("Guardar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jMATERIAS))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLegajo1)
                                .addGap(18, 18, 18)
                                .addComponent(jtApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLegajo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jtidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(75, 75, 75)
                                .addComponent(jbBuscar))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jNombreAlumno)
                                .addGap(18, 18, 18)
                                .addComponent(jtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jFechaNac)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jcEstado)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jbGuardar)
                .addGap(18, 18, 18)
                .addComponent(jbBorrar)
                .addGap(18, 18, 18)
                .addComponent(jbActualizar)
                .addGap(18, 18, 18)
                .addComponent(jbLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jMATERIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLegajo)
                    .addComponent(jtidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbBuscar))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLegajo1)
                    .addComponent(jtApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombreAlumno)
                    .addComponent(jtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jFechaNac)
                    .addComponent(jtFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jcEstado)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbBorrar)
                    .addComponent(jbActualizar)
                    .addComponent(jbLimpiar))
                .addGap(19, 38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtFechaNacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtFechaNacActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtFechaNacActionPerformed

    private void jtApellidoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoAlumnoActionPerformed

    private void jtNombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreAlumnoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jFechaNac;
    private javax.swing.JLabel jLegajo;
    private javax.swing.JLabel jLegajo1;
    private javax.swing.JLabel jMATERIAS;
    private javax.swing.JLabel jNombreAlumno;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbActualizar;
    private javax.swing.JButton jbBorrar;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JCheckBox jcEstado;
    private javax.swing.JTextField jtApellidoAlumno;
    private javax.swing.JTextField jtFechaNac;
    private javax.swing.JTextField jtNombreAlumno;
    private javax.swing.JTextField jtidAlumno;
    // End of variables declaration//GEN-END:variables
}
