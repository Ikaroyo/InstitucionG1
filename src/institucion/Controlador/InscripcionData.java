/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package institucion.Controlador;

import institucion.Modelo.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Barbara
 */
public class InscripcionData {

    private Connection con = null;

    public InscripcionData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }

    public void inscribir(Inscripcion insc) {
        String sql = "INSERT INTO inscripcion (id_alumno, id_materia, nota) VALUES (?, ?, ?)";

        try {

            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            JOptionPane.showMessageDialog(null, "llegue hasta aca");
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            JOptionPane.showMessageDialog(null, "llegue hasta aca 2");
            ps.setInt(2, insc.getMateria().getIdMateria());
            JOptionPane.showMessageDialog(null, "llegue hasta aca 3");
            ps.setDouble(3, insc.getNota());
            JOptionPane.showMessageDialog(null, "llegue hasta aca 4");

            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "llegue hasta aca 5");
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                insc.setIdInscripcion(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion exitosa");

            } else {
                JOptionPane.showMessageDialog(null, "No se pudo ingresar la inscripción.");

            }
            ps.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "error en la conexíon.");
        }

    }
}
