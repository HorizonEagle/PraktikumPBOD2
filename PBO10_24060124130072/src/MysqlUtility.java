import java.sql.*;;

public class MysqlUtility {

    private static Connection koneksi;

    public static Connection getConnection() {

        if (koneksi == null) {

            try {

                Class.forName("com.mysql.jdbc.Driver");

                // Sesuaikan host, port, nama db
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";

                // sesuaikan username dan password
                String user = "root";
                String password = "01100010";

                koneksi = DriverManager.getConnection(url, user, password);

                if (koneksi != null) {
                    System.out.println("Koneksi berhasil");
                }

            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver : " + cne.getMessage());

            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi : " + sqle.getMessage());
            }
        }

        return koneksi;
    }
}