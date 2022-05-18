/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.Controlador;

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
public class MateriaData {
    private Connection con = null;

    public MateriaData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

    public void guardarMateria(Materia materia) {
        String sql = "INSERT INTO materia (nombre, anioMateria,  activo)  VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setInt(3, materia.isActivo() ? 1 : 0);
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();

            JOptionPane.showMessageDialog(null, " Se genero la materia exitosamente");

            if (rs.next()) {
                materia.setIdMateria(rs.getInt(1));
            } else {
                JOptionPane.showMessageDialog(null, "Error, no se pudo generar la materia");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar materia" + ex.getMessage());

        }
    }

    public Materia buscarMateria(int idMateria) {
        Materia materia = null;

        String sql = "SELECT * FROM materia WHERE idMateria =? AND  activo =1;";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMateria);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                materia = new Materia();
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnioMateria(rs.getInt("anioMateria"));
                materia.setActivo(rs.getBoolean("activo"));

            }
            JOptionPane.showMessageDialog(null, " Materia encontrada :"+" "+ materia.getNombre());
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, " La materia ingresada es inexistente " + ex);

        }

        return materia;

    }

    public void modificarMateria(Materia materia, int idMateria) {

        String sql = "UPDATE materia SET nombre=?,anioMateria=?,activo=? WHERE idMateria=?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnioMateria());
            ps.setBoolean(3, materia.isActivo());
            ps.setInt(4, idMateria);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se modifico correctamente la materia");
            } else {
                JOptionPane.showMessageDialog(null, "Error, la materia ingresada no existe");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde insertar alumno " + ex);

        }

    }

    public void borrarMateria(int idMateria) {

        String sql = "UPDATE materia SET activo =0 WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMateria);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Materia borrada exitosamente" );
            } else {
                JOptionPane.showMessageDialog(null, "Error, ingresÃ³ una materia inexistente ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde borrar materia " + ex);

        }
    }

    public List<Materia> obtenerMaterias() {
        ArrayList<Materia> materias = new ArrayList<>();

        try {
            String sql = "SELECT * FROM materia WHERE activo=1;";
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            Materia materia;
            while (resultSet.next()) {
                materia = new Materia();
                materia.setIdMateria(resultSet.getInt("idMateria"));
                materia.setNombre(resultSet.getString("nombre"));
                materia.setAnioMateria(resultSet.getInt("anioMateria"));
                materia.setActivo(resultSet.getBoolean("activo"));

                materias.add(materia);
            }
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener las materias: " + ex.getMessage());
        }

        return materias;
    }

    public void activarMateria(int idMateria) {

        String sql = "UPDATE materia SET activo =1 WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMateria);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se activo el estado de la materia ");
            } else {
                JOptionPane.showMessageDialog(null, "Error, la materia ingresada no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar materia " + ex);

        }
    }
    
        public void desactivarMateria(int idMateria) {

        String sql = "UPDATE materia SET activo =0 WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, idMateria);

            int rs = ps.executeUpdate();

            if (rs > 0) {
                JOptionPane.showMessageDialog(null, "Se desactivo el estado de la materia ");
            } else {
                JOptionPane.showMessageDialog(null, "Error, la materia ingresada no existe ");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error de conexion desde activar materia " + ex);

        }
    }

    
}
