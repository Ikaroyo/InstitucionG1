/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.View;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbara
 */
public class InstitucionMenuView extends javax.swing.JFrame {

    public boolean adminUser;

    /**
     * Creates new form InstituicionMenuView
     */
    public InstitucionMenuView() {
        initComponents();
        setSize(875, 700);
        setLocationRelativeTo(null);
        adminUser = isAdministrador();
    }

    boolean isAdministrador() {
        String[] options = {"Si", "No"};

        int x = JOptionPane.showOptionDialog(null, "¿Es usted un administrador?",
                "Selecciona una opcion",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        return x == 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuInstitucion = new javax.swing.JMenu();
        escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jArchivo = new javax.swing.JMenu();
        jSalir = new javax.swing.JMenuItem();
        jMaterias = new javax.swing.JMenu();
        jFormulariodeMaterias = new javax.swing.JMenuItem();
        jAlumnos = new javax.swing.JMenu();
        jFormulariodeAlumnos = new javax.swing.JMenuItem();
        jInscripciones = new javax.swing.JMenu();
        jManejodeInscripciones = new javax.swing.JMenuItem();
        jCargadeNotas = new javax.swing.JMenu();
        jManipulaciondeNotas = new javax.swing.JMenuItem();
        jConsultas = new javax.swing.JMenu();
        jListadodeAlumnosxMateria = new javax.swing.JMenuItem();

        jMenuInstitucion.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );

        jArchivo.setText("Archivo");
        jArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jArchivoActionPerformed(evt);
            }
        });

        jSalir.setText("Salir");
        jSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSalirActionPerformed(evt);
            }
        });
        jArchivo.add(jSalir);

        jMenuBar1.add(jArchivo);

        jMaterias.setText("Materias");

        jFormulariodeMaterias.setText("Formulario de Materias");
        jFormulariodeMaterias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormulariodeMateriasActionPerformed(evt);
            }
        });
        jMaterias.add(jFormulariodeMaterias);

        jMenuBar1.add(jMaterias);

        jAlumnos.setText("Alumnos");

        jFormulariodeAlumnos.setText("Formulario de Alumnos");
        jFormulariodeAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormulariodeAlumnosActionPerformed(evt);
            }
        });
        jAlumnos.add(jFormulariodeAlumnos);

        jMenuBar1.add(jAlumnos);

        jInscripciones.setText("Inscripciones");

        jManejodeInscripciones.setText("Manejo de Inscripciones");
        jManejodeInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManejodeInscripcionesActionPerformed(evt);
            }
        });
        jInscripciones.add(jManejodeInscripciones);

        jMenuBar1.add(jInscripciones);

        jCargadeNotas.setText("Carga de Notas");

        jManipulaciondeNotas.setText("Carga de Notas");
        jManipulaciondeNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jManipulaciondeNotasActionPerformed(evt);
            }
        });
        jCargadeNotas.add(jManipulaciondeNotas);

        jMenuBar1.add(jCargadeNotas);

        jConsultas.setText("Consultas");

        jListadodeAlumnosxMateria.setText("Listado de Alumnos por Materia");
        jListadodeAlumnosxMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jListadodeAlumnosxMateriaActionPerformed(evt);
            }
        });
        jConsultas.add(jListadodeAlumnosxMateria);

        jMenuBar1.add(jConsultas);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jArchivoActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jArchivoActionPerformed

    private void jFormulariodeMateriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormulariodeMateriasActionPerformed
        // TODO add your handling code here:
        if (adminUser) {
            escritorio.removeAll();
            MateriaView agregar;
            try {
                agregar = new MateriaView();
                agregar.setVisible(true);
                escritorio.add(agregar);
                escritorio.repaint();
                escritorio.moveToFront(agregar);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InstitucionMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usted no tiene permiso de abrir esta ventana, no es un administrador");
        }


    }//GEN-LAST:event_jFormulariodeMateriasActionPerformed

    private void jSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSalirActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jSalirActionPerformed

    private void jFormulariodeAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormulariodeAlumnosActionPerformed
        if (adminUser) {
            escritorio.removeAll();
            AlumnoView agregar;
            try {
                agregar = new AlumnoView();
                agregar.setVisible(true);
                escritorio.add(agregar);
                escritorio.repaint();
                escritorio.moveToFront(agregar);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InstitucionMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usted no tiene permiso de abrir esta ventana, no es un administrador");
        }


    }//GEN-LAST:event_jFormulariodeAlumnosActionPerformed

    private void jManejodeInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManejodeInscripcionesActionPerformed
        escritorio.removeAll();
        InscripcionView agregar;
        try {
            agregar = new InscripcionView();
            agregar.setVisible(true);
            escritorio.add(agregar);
            escritorio.repaint();
            escritorio.moveToFront(agregar);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InstitucionMenuView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jManejodeInscripcionesActionPerformed

    private void jManipulaciondeNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jManipulaciondeNotasActionPerformed
        if (adminUser) {
            escritorio.removeAll();
            CargaNotas agregar;
            try {
                agregar = new CargaNotas();
                agregar.setVisible(true);
                escritorio.add(agregar);
                escritorio.repaint();
                escritorio.moveToFront(agregar);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InstitucionMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usted no tiene permiso de abrir esta ventana, no es un administrador");
        }


    }//GEN-LAST:event_jManipulaciondeNotasActionPerformed

    private void jListadodeAlumnosxMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jListadodeAlumnosxMateriaActionPerformed

        if (adminUser) {
            escritorio.removeAll();
            ListaAlumnosxMateria agregar;
            try {
                agregar = new ListaAlumnosxMateria();
                agregar.setVisible(true);
                escritorio.add(agregar);
                escritorio.repaint();
                escritorio.moveToFront(agregar);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(InstitucionMenuView.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Usted no tiene permiso de abrir esta ventana, no es un administrador");
        }

    }//GEN-LAST:event_jListadodeAlumnosxMateriaActionPerformed

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
            java.util.logging.Logger.getLogger(InstitucionMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InstitucionMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InstitucionMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InstitucionMenuView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InstitucionMenuView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jAlumnos;
    private javax.swing.JMenu jArchivo;
    private javax.swing.JMenu jCargadeNotas;
    private javax.swing.JMenu jConsultas;
    private javax.swing.JMenuItem jFormulariodeAlumnos;
    private javax.swing.JMenuItem jFormulariodeMaterias;
    private javax.swing.JMenu jInscripciones;
    private javax.swing.JMenuItem jListadodeAlumnosxMateria;
    private javax.swing.JMenuItem jManejodeInscripciones;
    private javax.swing.JMenuItem jManipulaciondeNotas;
    private javax.swing.JMenu jMaterias;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInstitucion;
    private javax.swing.JMenuItem jSalir;
    // End of variables declaration//GEN-END:variables
}
