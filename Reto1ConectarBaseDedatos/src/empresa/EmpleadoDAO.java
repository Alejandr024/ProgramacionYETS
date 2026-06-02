package empresa;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class EmpleadoDAO {

    // ?? Conexión ??????????????????????????????????????????????????????????????
    private Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/nominas_empresa";
        return DriverManager.getConnection(url, "admin", "1q2w3e$R");
    }

    // ?? READ ALL ??????????????????????????????????????????????????????????????
    public List<Empleado> readAll() {
        String sql = "SELECT * FROM empleados ORDER BY id";
        List<Empleado> lista = new ArrayList<>();

        try (Connection con = conectar(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Empleado(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("puesto"),
                        rs.getDouble("salario_base"),
                        rs.getDate("fecha_contratacion")
                ));
            }

        } catch (SQLException e) {
            System.err.println("Error en readAll(): " + e.getMessage());
        }
        return lista;
    }

    // ?? READ (por ID) ?????????????????????????????????????????????????????????
    public Empleado read(int id) {
        String sql = "SELECT * FROM empleados WHERE id = ?";
        Empleado empleado = null;

        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                empleado = new Empleado(
                        rs.getInt("id"),
                        rs.getString("nombre"),
                        rs.getString("puesto"),
                        rs.getDouble("salario_base"),
                        rs.getDate("fecha_contratacion")
                );
            }

        } catch (SQLException e) {
            System.err.println("Error en read(): " + e.getMessage());
        }
        return empleado;
    }

    // ?? CREATE ????????????????????????????????????????????????????????????????
    public void create(Empleado e) {
        String sql = "INSERT INTO empleados (nombre, puesto, salario_base, fecha_contratacion) VALUES (?, ?, ?, ?)";

        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, e.getNombre());
            ps.setString(2, e.getPuesto());
            ps.setDouble(3, e.getSalarioBase());
            ps.setDate(4, e.getFechaContratacion());

            int filas = ps.executeUpdate();
            System.out.println("INSERT: " + filas + " fila(s) insertada(s).");

        } catch (SQLException ex) {
            System.err.println("Error en create(): " + ex.getMessage());
        }
    }

    // ?? DELETE ????????????????????????????????????????????????????????????????
    public void delete(int id) {
        String sql = "DELETE FROM empleados WHERE id = ?";

        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            System.out.println("DELETE: " + filas + " fila(s) eliminada(s).");

        } catch (SQLException e) {
            System.err.println("Error en delete(): " + e.getMessage());
        }
    }
    
}//end class