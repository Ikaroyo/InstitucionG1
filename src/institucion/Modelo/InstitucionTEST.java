/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.Modelo;

import institucion.*;
import institucion.Controlador.AlumnoData;
import institucion.Controlador.Conexion;
import institucion.Controlador.InscripcionData;
import institucion.Controlador.MateriaData;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Barbara
 */
public class InstitucionTEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        try {
            // TODO code application logic here
            Conexion conexion = new Conexion();

            Alumno alumno = new Alumno("Fariolli", "Santiago", LocalDate.of(1987, 7, 13), true);
            System.out.println(alumno);
            AlumnoData ad = new AlumnoData(conexion);
            ad.insertarAlumno(alumno);

            Materia m3 = new Materia(4, "Web", 3, true);
            System.out.println(m3);
            MateriaData mat = new MateriaData (conexion);
            mat.insetarMateria(m3);

            Inscripcion i2 = new Inscripcion(alumno, m3, 5);
            System.out.println(i2);
            InscripcionData id = new InscripcionData(conexion);
            id.inscribir(i2);
            

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InstitucionTEST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
