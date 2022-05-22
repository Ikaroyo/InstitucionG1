/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.View;

import institucion.Controlador.AlumnoData;
import institucion.Controlador.Conexion;
import institucion.Modelo.Alumno;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbara
 */
public class AlumnoView extends javax.swing.JInternalFrame {
    
    Conexion conexion;
    AlumnoData ad;

    /**
     * Creates new form AlumnoView
     */
    public AlumnoView() throws ClassNotFoundException {
        initComponents();
        conexion = new Conexion();
        ad = new AlumnoData(conexion);
        agregarOModificar();
    }
    
    private void agregarOModificar() {
        String[] options = {"Agregar Alumno", "Buscar/Modificar/Actualizar Alumno"};
        
        int x = JOptionPane.showOptionDialog(null, "¿Que desea realizar?",
                "Selecciona una opcion",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        boolean layoutBoolean = x == 0;
        
        jbGuardar.setEnabled(layoutBoolean);
        jtidAlumno.setEnabled(!layoutBoolean);
        jbBuscar.setEnabled(!layoutBoolean);
        jbBorrar.setEnabled(false);
        jbActualizar.setEnabled(false);
        
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
        jNombreAlumno = new javax.swing.JLabel();
        jtApellidoAlumno = new javax.swing.JTextField();
        jFechaNac = new javax.swing.JLabel();
        jtNombreAlumno = new javax.swing.JTextField();
        jcEstado = new javax.swing.JCheckBox();
        jbLimpiar = new javax.swing.JButton();
        jbActualizar = new javax.swing.JButton();
        jbBorrar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jcFechaN = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        jMATERIAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMATERIAS.setText("-Alumnos-");

        jLegajo.setBackground(new java.awt.Color(255, 255, 255));
        jLegajo.setText("Legajo");

        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });

        jLegajo1.setBackground(new java.awt.Color(255, 255, 255));
        jLegajo1.setText("Apellido");

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
        jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimpiarActionPerformed(evt);
            }
        });

        jbActualizar.setText("Actualizar");

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
                                .addGap(18, 18, 18)
                                .addComponent(jcFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLegajo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtidAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbBuscar)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLegajo1)
                    .addComponent(jtApellidoAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jNombreAlumno)
                    .addComponent(jtNombreAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFechaNac)
                    .addComponent(jcFechaN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jcEstado)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbGuardar)
                    .addComponent(jbBorrar)
                    .addComponent(jbActualizar)
                    .addComponent(jbLimpiar))
                .addGap(19, 42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtApellidoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtApellidoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtApellidoAlumnoActionPerformed

    private void jtNombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNombreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNombreAlumnoActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        // TODO add your handling code here:
//        
//
        String apellido = jtApellidoAlumno.getText();
        String nombre = jtNombreAlumno.getText();
//        
//        // jcalendar//
        SimpleDateFormat formato = new SimpleDateFormat("dd-MM-yyyy");
//
        String fecha = formato.format(jcFechaN.getDate()); // FORMATO: date de jcalendar a string//
//
        DateTimeFormatter formato2 = DateTimeFormatter.ofPattern("dd-MM-yyyy"); // FORMATO: de string a localDate//
//
        LocalDate fechNac = LocalDate.parse(fecha, formato2);
//        
        boolean estado = jcEstado.isSelected();
//        
        Alumno a = new Alumno(nombre, apellido, fechNac, estado);
        ad.guardarAlumno(a);
//        

        jtidAlumno.setText(a.getIdAlumno() + "");
        // cargar casillero legajo con idAlumno recien creado//
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        // TODO add your handling code here:
        limpiar();
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBorrarActionPerformed
        // TODO add your handling code here:
        
        

    }//GEN-LAST:event_jbBorrarActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        // TODO add your handling code here:
        Alumno encontrado = new Alumno();
        
        encontrado = ad.buscarAlumno(Integer.parseInt(jtidAlumno.getText()));
        
        if (Objects.nonNull(encontrado)) {
            jtApellidoAlumno.setText(encontrado.getApellido());
            jtNombreAlumno.setText(encontrado.getNombre());

// Devuelve fecha de nacimiento //            
            LocalDate lc = encontrado.getFechaNac();
            Date date = Date.from(lc.atStartOfDay(ZoneId.systemDefault()).toInstant());
            jcFechaN.setDate(date);

// Devuelve estado activo//           
            jcEstado.setEnabled(encontrado.isActivo());
            
// BUSCAR : una vez encontrado://           
// se bloquea idAlumno//
          jtidAlumno.setEnabled(false);
          
// se activa:BORRAR y ACTUALIZAR //
            jbBorrar.setEnabled(true);
            jbActualizar.setEnabled(true);
            
            JOptionPane.showMessageDialog(this, "Alumno encontrado exitosamente");
        } else {
            
            JOptionPane.showMessageDialog(this, "Alumno inexistente");
        }
    }//GEN-LAST:event_jbBuscarActionPerformed
    private void limpiar() {
        
        jtidAlumno.setText("");
        jtApellidoAlumno.setText("");
        jtNombreAlumno.setText("");
        jcFechaN.setCalendar(null);
        jcEstado.setSelected(false);
        agregarOModificar();
        
    }

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
    private com.toedter.calendar.JDateChooser jcFechaN;
    private javax.swing.JTextField jtApellidoAlumno;
    private javax.swing.JTextField jtNombreAlumno;
    private javax.swing.JTextField jtidAlumno;
    // End of variables declaration//GEN-END:variables
}
