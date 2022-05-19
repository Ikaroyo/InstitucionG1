/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.Controlador;

import institucion.Modelo.Alumno;
import institucion.Modelo.Inscripcion;
import institucion.Modelo.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbara
 */
public class InscripcionData {

     private Connection con = null;
     private Conexion conexion;

    public InscripcionData(Conexion conexion) {
        try {
            this.conexion=conexion;
            this.con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error al abrir al obtener la conexion");
        }
    }


        public Alumno buscarAlumno(int idAlumno){
    
        AlumnoData ad=new AlumnoData(conexion);
        
        return ad.buscarAlumno(idAlumno);
        
    }
    
        public Materia buscarMateria(int idMateria){
    
        MateriaData md=new MateriaData(conexion);
        return md.buscarMateria(idMateria);
    
    }


    public void guardarInscripcion(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (idAlumno, idMateria, nota) VALUES (?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa");

            } else {
                JOptionPane.showMessageDialog(null, "Error el generar la inscripcion" );

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error en la conexíon:" +" "+ ex.getMessage());
        }

    }
    
        public List<Inscripcion> obtenerInscripciones(){
    
        ArrayList<Inscripcion> inscripciones = new ArrayList<>();
            

        try {
            String sql = "SELECT * FROM inscripcion;";
            PreparedStatement statement = con.prepareStatement(sql);
            
            ResultSet resultSet = statement.executeQuery();
            Inscripcion inscripcion;
            
            while(resultSet.next()){
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(resultSet.getInt("idInscripcion"));
                
                Alumno a= buscarAlumno(resultSet.getInt("idAlumno"));
                inscripcion.setAlumno(a);
                
                Materia m =buscarMateria(resultSet.getInt("idMateria"));
                
                inscripcion.setMateria(m);
                inscripcion.setNota(resultSet.getInt("nota"));
               

                inscripciones.add(inscripcion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return inscripciones;
}
        public List<Inscripcion> obtenerInscripcionesXAlumno(int id){
            
            ArrayList<Inscripcion> inscripciones = new ArrayList<>();   

        try {
            String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?;";
             
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1,id);
            
            ResultSet resultSet = statement.executeQuery();
            
            Inscripcion inscripcion;
            
            while(resultSet.next()){
                
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripcion(resultSet.getInt("idInscripcion"));
                
                Alumno a=buscarAlumno(resultSet.getInt("idAlumno"));
                inscripcion.setAlumno(a);
                
                Materia m=buscarMateria(resultSet.getInt("idMateria"));
                inscripcion.setMateria(m);
                inscripcion.setNota(resultSet.getInt("nota"));
               

                inscripciones.add(inscripcion);
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return inscripciones;
    }
        
        public List<Materia> obtenerMateriasCursadas(int id){
        List<Materia> materias = new ArrayList<Materia>();
            

        try {
            String sql = "SELECT inscripcion.idMateria, nombre FROM inscripcion, materia WHERE inscripcion.idMateria = materia.idMateria\n" +
            "and inscripcion.idAlumno = ?;";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
                
               JOptionPane.showMessageDialog(null,"El alumno esta inscripto en :" +" "+materia.getNombre());
            }   
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return materias;
      
    }
        
            public List<Materia> obtenerMateriasNOCursadas(int id){
           List<Materia> materias = new ArrayList<Materia>();
            

        try {
            String sql = "Select * from materia where idMateria not in "
                    + "(select idMateria from inscripcion where idAlumno =?);";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            Materia materia;
            while(resultSet.next()){
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materias.add(materia);
                JOptionPane.showMessageDialog(null,"El no alumno esta inscripto en :" +" "+materia.getNombre());
            }      
            statement.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }
        
        
        return materias;
      
    }

       public void borrarInscripcionDeUnaMateriaDeunAlumno(int idAlumno,int idMateria){
    
        try {
            
            String sql = "DELETE FROM inscripcion WHERE idAlumno =? and idMateria =?;";

            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, idAlumno);
            statement.setInt(2, idMateria);
           
            
            statement.executeUpdate();
            
           JOptionPane.showMessageDialog(null,"Se borro al alumno");
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
           
       
    }
 
    
    public void actualizarNotaCursada(int idAlumno,int idMateria, int nota){
    
        try {
            
            String sql = "UPDATE inscripcion SET nota = ? WHERE idAlumno =? and idMateria =?;";

           PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1,nota);
            statement.setInt(2, idAlumno);
            statement.setInt(3, idMateria);
           
            
            statement.executeUpdate();
            
            JOptionPane.showMessageDialog(null,"Nota actualizada");
            statement.close();
    
        } catch (SQLException ex) {
            System.out.println("Error al insertar un alumno: " + ex.getMessage());
        }
           
    
    }
    
}


