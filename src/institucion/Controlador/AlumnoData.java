/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.Controlador;

import institucion.Modelo.Alumno;
import java.sql.Connection;
import java.sql.Date;
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
public class AlumnoData {

    private Connection con = null;

    public AlumnoData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

    // agrega y  guarda al alumno en la base de datos//    
    public void guardarAlumno(Alumno alumno) {

        String sql = "INSERT INTO alumno (nombre, apellido, fechaNac, activo)  VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));//localDate a Date
            ps.setInt(4, alumno.isActivo() ? 1 : 0);
            // if reducido
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            JOptionPane.showMessageDialog(null, " Se genero el id del alumno exitosamente");

            if (rs.next()) {
                alumno.setIdAlumno(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "No genero el id del alumno ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar alumno " + ex);

        }

    }

    public Alumno buscarAlumno(int idAlumno) {
        Alumno alumno = null;

        String sql = "SELECT * FROM alumno WHERE activo =1 AND idAlumno =?;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);

            ResultSet rs = ps.executeQuery();
            
            if( rs.wasNull()== false){

            while (rs.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNac(rs.getDate("fechaNac").toLocalDate());
                alumno.setActivo(rs.getBoolean("activo"));

            }
  
            } else {
              JOptionPane.showMessageDialog(null, " Id de Alumno inexistente");  
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " Error de conexion desde buscar alumno " + ex);

        }

        return alumno;

    }

    public void borrarAlumno(int idAlumno) {

        String sql = "UPDATE alumno SET activo =0 WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Alumno borrado exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, "No se puede borrar, alumno inexistente ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar alumno " + ex);

        }

    }

    public void modificarAlumno(int idAlumno, Alumno alumno) {

        String sql = "UPDATE alumno SET nombre=?,apellido=?,fechaNac=?,activo=? WHERE idAlumno=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, alumno.getNombre());
            ps.setString(2, alumno.getApellido());
            ps.setDate(3, Date.valueOf(alumno.getFechaNac()));
            ps.setBoolean(4, alumno.isActivo());
            ps.setInt(5, idAlumno);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, " Alumno actualizado se exitosamente ");
            } else {
                JOptionPane.showMessageDialog(null, " Alumno: No se pudo actualizar ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar alumno " + ex);

        }

    }

    public void activarAlumno(int idAlumno) {

        String sql = "UPDATE alumno SET activo =1 WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se activo el estado del alumno ");
            } else {
                JOptionPane.showMessageDialog(null, "id no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar alumno " + ex);

        }
    }
    
       public void desactivarAlumno(int idAlumno) {

        String sql = "UPDATE alumno SET activo =0 WHERE idAlumno=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idAlumno);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se desactivo el estado del alumno ");
            } else {
                JOptionPane.showMessageDialog(null, "id no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar alumno " + ex);

        }
    }

    public List<Alumno> obtenerAlumnos() {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();

        try {
            String sql = "SELECT * FROM alumno;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Alumno alumno;
            while (resultSet.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultSet.getInt("idAlumno"));
                alumno.setApellido(resultSet.getString("apellido"));
                alumno.setNombre(resultSet.getString("nombre"));
                alumno.setFechaNac(resultSet.getDate("fechaNac").toLocalDate());
                alumno.setActivo(resultSet.getBoolean("activo"));

                alumnos.add(alumno);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alumnos: " + ex.getMessage());
        }

        return alumnos;
    }

}
