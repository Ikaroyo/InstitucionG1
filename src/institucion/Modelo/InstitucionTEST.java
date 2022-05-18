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
import java.util.ArrayList;
import java.util.Iterator;
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
            AlumnoData ad = new AlumnoData(conexion);
            MateriaData md = new MateriaData(conexion);
            InscripcionData id1 = new InscripcionData(conexion);

//            Alumno alumno1 = new Alumno("Fariolli", "Santiago", LocalDate.of(1987, 7, 13), true);

//            System.out.println(alumno1);
//            ad.guardarAlumno(alumno1);

//            Alumno alumno2 = new Alumno("Borrello", "Barbara", LocalDate.of(1977, 2, 9), true);
//            System.out.println(alumno2);
//            ad.guardarAlumno(alumno2);


//            Alumno alumno3 = new Alumno("Borrello", "Hector", LocalDate.of(1949, 1, 5), true);
//            System.out.println(alumno3);
//            ad.guardarAlumno(alumno3);
//
//            Alumno alumno4 = new Alumno("Lopez", "Jesica", LocalDate.of(1989, 5, 30), false);
//            System.out.println(alumno4);
//            ad.guardarAlumno(alumno4);

            
//            System.out.println(ad.buscarAlumno(3));
//            System.out.println(ad.buscarAlumno(20));
//            ad.borrarAlumno(3);
//            ad.activarAlumno(6);
//            ad.desactivarAlumno(4);
//            ad.modificarAlumno(3, new Alumno ("Gonzalez", "Franco", LocalDate.of(1987, 1, 26), true));
////            
//             System.out.println(ad.obtenerAlumnos());
////
//             ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
//             Iterator<Alumno> it = alumnos.iterator();
//
//             while(it.hasNext()){
//     
//             System.out.println(it.hasNext());
//             }
//-------------------------------------------------------------------------------------------------------------              
//             Materia m = new Materia("Matematica",1, true);
//             System.out.println(m1);
//             md.guardarMateria(m1);
//
//             Materia m2 = new Materia("Web",2, true);
//             System.out.println(m2);
////           md.guardarMateria(m2);
//
//             Materia m3 = new Materia("Laboratorio",2, true);
//             System.out.println(m3);
//             md.guardarMateria(m3);
//
//             Materia m4 = new Materia("Ingles",1, true);
//             System.out.println(m4);
//             md.guardarMateria(m4);
//
//             Materia m5 = new Materia("Eda",2, false);
//             System.out.println(m5);
//             md.guardarMateria(m5);
//
//             System.out.println(md.obtenerMaterias());
//             ArrayList<Materia> materias = new ArrayList<>();
//  
//             Iterator<Materia> it = materias.iterator();
//
//             while(it.hasNext()){
//     
//             System.out.println(it.hasNext());
//              }
//
//              System.out.println(md.buscarMateria(3));
//              System.out.println(md.buscarMateria(4));
//
//              Materia m6 = new Materia("Eda",2, false);
//              System.out.println(m6);

////            md.guardarMateria(m6);
//
//              md.borrarMateria(6);
//                
//              md.activarMateria(5);
                
//              md1.desactivarMateria(1);
//
//              md.modificarMateria(new Materia ("Laboratorio 2",3,true) , 6);
//-------------------------------------------------------------------------------------------------------------        


                


              

            
//
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(InstitucionTEST.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
