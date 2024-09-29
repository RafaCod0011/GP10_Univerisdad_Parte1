package accesoADatos;

import com.sun.jdi.connect.spi.Connection;
import entidades.Alumno;
import java.beans.Statement;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author Rafa
 */
public class AlumnoData {
    private Connection con = null;
    
    public AlumnoData(){
        con = (Connection) Conexion.getConexion();
    }
    
    /*public void guardarAlumno (Alumno alumno) {
        
        String sql = "INSERT INTO alumno (dni, apellido, nombre, fechaNacimiento, estado)"
                + "VALUES(?, ?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS); // esto deberia solucionarse cuando se cree la tabla sql
            ps.setInt(1,alumno.getIdAlumno());
            ps.setString(2, alumno.getApellido());
            ps.setString(3, alumno.getNombre());
            ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNacimiento()));
            ps.setBoolean(5, alumno.isActivo());
            ps.executeUpdate();
            
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                alumno.setIdAlumno(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno guardado correctamente");
            }
            ps.close();
            
        }catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Alumno");
        }
    }*/
    
    /*public void modificarAlumno (Alumno alumno) {
        String sql= "UPDATE alumno SET dni= ?, apellido = ?, nombre = ?, fechaNacimiento = ?,"
                + "WHERE idAlumno = ?";
        
        try {
        PreparedStatement ps = con.prepareStatement(sql); // esto deberia solucionarse cuando se cree la tabla sql
        ps.setInt(1,alumno.getIdAlumno());
        ps.setString(2, alumno.getApellido());
        ps.setString(3, alumno.getNombre());
        ps.setDate(4, java.sql.Date.valueOf(alumno.getFechaNacimiento()));
        ps.setBoolean(5, alumno.isActivo());
        int exito = ps.executeUpdate();
        if (exito == 1){
            JOptionPane.showMessageDialog(null,"Alumno Modificado Correctamente");
        }
                
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Alumno");
        }
    }*/
}

