/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.View;

import institucion.Controlador.AlumnoData;
import institucion.Controlador.Conexion;
import institucion.Controlador.InscripcionData;
import institucion.Controlador.MateriaData;
import institucion.Modelo.Alumno;
import institucion.Modelo.Inscripcion;
import institucion.Modelo.Materia;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Barbara
 */
public class InscripcionView extends javax.swing.JInternalFrame {

    Conexion conexion = new Conexion();
    private List<Alumno> alumnos = null;
    private List<Inscripcion> inscripciones = null;
    private List<Materia> materias;

    /**
     * Creates new form InscripcionView
     */
    public InscripcionView() throws ClassNotFoundException {
        initComponents();
        agregarAlumnos();
    }

    private void agregarAlumnos() {

        jComboALUMNO.removeAllItems();

        AlumnoData ad = new AlumnoData(conexion);

        this.alumnos = ad.obtenerAlumnos();
        for (Alumno a1 : alumnos) {

            jComboALUMNO.addItem(a1);

        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jMATERIAS = new javax.swing.JLabel();
        jlALUMNO = new javax.swing.JLabel();
        jListadodeMaterias = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jbAnularInscripcion = new javax.swing.JButton();
        jbInscribir = new javax.swing.JButton();
        jbSalir = new javax.swing.JButton();
        jComboALUMNO = new javax.swing.JComboBox<>();
        jrNoInscriptas = new javax.swing.JRadioButton();
        jrInscriptas = new javax.swing.JRadioButton();

        setClosable(true);

        jMATERIAS.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jMATERIAS.setText("- Formulario de Inscripcion-");

        jlALUMNO.setText("ALUMNO");

        jListadodeMaterias.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jListadodeMaterias.setText("LISTADO DE MATERIAS");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID Materia", "Nombre", "Año"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jbAnularInscripcion.setText("Anular Inscripcion");
        jbAnularInscripcion.setEnabled(false);
        jbAnularInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAnularInscripcionActionPerformed(evt);
            }
        });

        jbInscribir.setText("Inscribir");
        jbInscribir.setEnabled(false);
        jbInscribir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInscribirActionPerformed(evt);
            }
        });

        jbSalir.setText("Salir");
        jbSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalirActionPerformed(evt);
            }
        });

        jComboALUMNO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboALUMNOActionPerformed(evt);
            }
        });

        jrNoInscriptas.setText("Inscriptas");
        jrNoInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrNoInscriptasActionPerformed(evt);
            }
        });

        jrInscriptas.setText("No Inscriptas");
        jrInscriptas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrInscriptasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(41, 323, Short.MAX_VALUE)
                .addComponent(jMATERIAS)
                .addGap(120, 120, 120))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jListadodeMaterias))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jlALUMNO)
                        .addGap(56, 56, 56)
                        .addComponent(jComboALUMNO, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jrNoInscriptas)
                                .addGap(18, 18, 18)
                                .addComponent(jrInscriptas)
                                .addGap(143, 143, 143))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jbInscribir)
                        .addGap(18, 18, 18)
                        .addComponent(jbAnularInscripcion)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalir)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jMATERIAS, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlALUMNO)
                    .addComponent(jComboALUMNO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jListadodeMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrNoInscriptas)
                    .addComponent(jrInscriptas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAnularInscripcion)
                    .addComponent(jbSalir)
                    .addComponent(jbInscribir))
                .addContainerGap(94, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboALUMNOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboALUMNOActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        model.setRowCount(0);
        if (jrInscriptas.isSelected()) {
            rellenarTablaInscriptos();
        } else {

        }
    }//GEN-LAST:event_jComboALUMNOActionPerformed

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        dispose();
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbInscribirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInscribirActionPerformed
        InscripcionData id = new InscripcionData(conexion);
        MateriaData md = new MateriaData(conexion);
        Alumno ac = (Alumno) jComboALUMNO.getSelectedItem();
        Materia mc = md.buscarMateria((int) jTable1.getValueAt((int) jTable1.getSelectedRow(), 0));
        Inscripcion ic = new Inscripcion(ac, mc, 0);
        id.guardarInscripcion(ic);
        rellenarTablaNoInscriptos();
    }//GEN-LAST:event_jbInscribirActionPerformed

    private void jbAnularInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAnularInscripcionActionPerformed
        InscripcionData id = new InscripcionData(conexion);
        int idAlumno = ((Alumno) jComboALUMNO.getSelectedItem()).getIdAlumno();
        int idMateria = (int) jTable1.getValueAt((int) jTable1.getSelectedRow(), 0);
        id.borrarInscripcionDeUnaMateriaDeunAlumno(idAlumno, idMateria);
        rellenarTablaInscriptos();
    }//GEN-LAST:event_jbAnularInscripcionActionPerformed

    private void jrNoInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrNoInscriptasActionPerformed
        jrNoInscriptas.setSelected(true);
        jrInscriptas.setSelected(false);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        rellenarTablaInscriptos();
        jbInscribir.setEnabled(false);
        jbAnularInscripcion.setEnabled(true);
    }//GEN-LAST:event_jrNoInscriptasActionPerformed

    private void jrInscriptasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrInscriptasActionPerformed
        jrInscriptas.setSelected(true);
        jrNoInscriptas.setSelected(false);
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        rellenarTablaNoInscriptos();
        jbInscribir.setEnabled(true);
        jbAnularInscripcion.setEnabled(false);
    }//GEN-LAST:event_jrInscriptasActionPerformed

    public void rellenarTablaInscriptos() {
        InscripcionData id = new InscripcionData(conexion);
        inscripciones = id.obtenerInscripcionesXAlumno(((Alumno) jComboALUMNO.getSelectedItem()).getIdAlumno());

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        if (!inscripciones.isEmpty()) {
            for (Inscripcion i1 : inscripciones) {

                model.addRow(new Object[]{i1.getMateria().getIdMateria(), i1.getMateria().getNombre(), i1.getMateria().getAnioMateria()});

            }
        } else {
            JOptionPane.showMessageDialog(null, "No tiene inscripciones activas");
        }
    }

    public void rellenarTablaNoInscriptos() {
        InscripcionData id = new InscripcionData(conexion);
        materias = id.obtenerMateriasNOCursadas(((Alumno) jComboALUMNO.getSelectedItem()).getIdAlumno());

        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);

        if (!materias.isEmpty()) {
            for (Materia i1 : materias) {

                model.addRow(new Object[]{i1.getIdMateria(), i1.getNombre(), i1.getAnioMateria()});

            }
        } else {
            JOptionPane.showMessageDialog(null, "No tiene inscripciones activas");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<Alumno> jComboALUMNO;
    private javax.swing.JLabel jListadodeMaterias;
    private javax.swing.JLabel jMATERIAS;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton jbAnularInscripcion;
    private javax.swing.JButton jbInscribir;
    private javax.swing.JButton jbSalir;
    private javax.swing.JLabel jlALUMNO;
    private javax.swing.JRadioButton jrInscriptas;
    private javax.swing.JRadioButton jrNoInscriptas;
    // End of variables declaration//GEN-END:variables
}
