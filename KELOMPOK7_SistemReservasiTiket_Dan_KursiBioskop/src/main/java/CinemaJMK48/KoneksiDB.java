package CinemaJMK48;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class KoneksiDB {
    private static Connection koneksi;

    public static Connection getKoneksi() {
        // Cek apakah koneksi sudah ada atau belum
        if (koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/cinema_jmk48";
                String user = "root";
                String password = ""; // Kosongkan jika XAMPP default
                
                koneksi = DriverManager.getConnection(url, user, password);
                
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Koneksi Database Gagal: " + e.getMessage());
            }
        }
        return koneksi;
    }
}