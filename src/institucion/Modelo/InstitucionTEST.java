/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.Modelo;

import institucion.*;
import institucion.Controlador.AlumnoData;
import institucion.Controlador.Conexion;
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
        
                Alumno yo = new Alumno("Borrelli", "Angel", LocalDate.of(1989, 9, 03),true);
        Materia m= new Materia("Matematicas",2,true);
        Inscripcion i1 = new Inscripcion(yo,m,7);
        i1.setNota(10);
        
        System.out.println(i1);

        
        
        try {
            // TODO code application logic here
            Conexion conexion = new Conexion();
            AlumnoData ad = new AlumnoData(conexion);

//            Alumno alumno = new Alumno("Borrello", "Hector", LocalDate.of(1945, 9, 03),true);
//            ad.insertarAlumno(alumno);
            //ad.guardarAutor(autor2)
//            System.out.println(ad.buscarAlumno(5).toString());
//            System.out.println(ad.buscarAlumno(4).toString());
//
//           ad.borrarAlumno(1);
////         ad.borrarAlumno(20);
//
//
//            Alumno juan = new Alumno("Jose", "Gomez", LocalDate.of(1983, 4, 25), true);
//            ad.modificarAlumno(2, juan);
//            ad.modificarAlumno(20, juan);
       

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InstitucionTEST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

        
        
    }
    

