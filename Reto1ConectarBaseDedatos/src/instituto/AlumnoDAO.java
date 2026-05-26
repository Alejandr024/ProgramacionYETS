package instituto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alejandro Miguel Gomez Gonzalez
 */
public class AlumnoDAO {

    private Connection conectar() throws SQLException {
        String url = "jdbc:mysql://localhost:3307/Instituto";
        return DriverManager.getConnection(url, "Pepe", "12345");
    }

    public void create(Alumno a) {
        String sql = "INSERT INTO Alumnos (nombre, fnac, media, curso) VALUES (?, ?, ?, ?)";
// los signos de interrogacion son variables que detecta el preparestatement, evitando que se inserten datos que no deberian
        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {//conecta el la base de datos con java

            ps.setString(1, a.getNombre());
            ps.setDate(2, a.getfNacimiento());
            ps.setDouble(3, a.getNotaMedia());
            ps.setString(4, a.getCurso());

            int filas = ps.executeUpdate();
            System.out.println("INSERT: " + filas + " fila(s) insertada(s).");

        } catch (SQLException e) {
            System.err.println("Error en create(): " + e.getMessage());
        }
    }

    public Alumno read(int id) {
        String sql = "SELECT * FROM Alumnos WHERE num = ?";
        Alumno alumno = null;

        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                alumno = new Alumno(
                        rs.getInt("num"),
                        rs.getString("nombre"),
                        rs.getDate("fnac"),
                        rs.getDouble("media"),
                        rs.getString("curso")
                );
            }

        } catch (SQLException e) {
            System.err.println("Error en read(): " + e.getMessage());
        }
        return alumno;
    }

    public List<Alumno> readAll() {
        String sql = "SELECT * FROM Alumnos ORDER BY num";
        List<Alumno> lista = new ArrayList<>();

        try (Connection con = conectar(); Statement st = con.createStatement(); ResultSet rs = st.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(new Alumno(
                        rs.getInt("num"),
                        rs.getString("nombre"),
                        rs.getDate("fnac"),
                        rs.getDouble("media"),
                        rs.getString("curso")
                ));
            }

        } catch (SQLException e) {
            System.err.println("Error en readAll(): " + e.getMessage());
        }
        return lista;
    }

    public void update(Alumno a) {
        String sql = "UPDATE Alumnos SET nombre=?, fnac=?, media=?, curso=? WHERE num=?";

        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, a.getNombre());
            ps.setDate(2, a.getfNacimiento());
            ps.setDouble(3, a.getNotaMedia());
            ps.setString(4, a.getCurso());
            ps.setInt(5, a.getNum());

            int filas = ps.executeUpdate();
            System.out.println("UPDATE: " + filas + " fila(s) actualizada(s).");

        } catch (SQLException e) {
            System.err.println("Error en update(): " + e.getMessage());
        }
    }

    public void delete(int id) {
        String sql = "DELETE FROM Alumnos WHERE num = ?";

        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);
            int filas = ps.executeUpdate();
            System.out.println("DELETE: " + filas + " fila(s) eliminada(s).");

        } catch (SQLException e) {
            System.err.println("Error en delete(): " + e.getMessage());
        }
    }

    public void incrementarMediaCurso(String curso, double incremento) {
        String sql = "UPDATE Alumnos SET media = media + ? WHERE curso = ?";

        try (Connection con = conectar(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, incremento);
            ps.setString(2, curso);

            int filas = ps.executeUpdate();
            System.out.println("Medias actualizadas en " + filas + " alumno(s) del curso " + curso);

        } catch (SQLException e) {
            System.err.println("Error en incrementarMediaCurso(): " + e.getMessage());
        }
    }
    
    // Buscar alumnos por curso
    public List<Alumno> readByCurso(String curso) {
        String sql = "SELECT * FROM Alumnos WHERE curso = ?";
        List<Alumno> lista = new ArrayList<>();

        try (Connection con = conectar();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setString(1, curso);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                lista.add(new Alumno(
                    rs.getInt("num"),
                    rs.getString("nombre"),
                    rs.getDate("fnac"),
                    rs.getDouble("media"),
                    rs.getString("curso")
                ));
            }

        } catch (SQLException e) {
            System.err.println("Error en readByCurso(): " + e.getMessage());
        }
        return lista;
    }
    
}//end class