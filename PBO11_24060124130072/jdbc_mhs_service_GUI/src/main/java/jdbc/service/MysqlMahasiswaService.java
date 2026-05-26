package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.utilities.*;
import jdbc.model.*;
public class MysqlMahasiswaService {

    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        koneksi = MysqlUtility.getConnection();
    }

    /** Membuat objek mahasiswa
     * @return  */
    public Mahasiswa makeMhsObject() {
        int id = 0;
        String nama = "";
        return new Mahasiswa(id, nama);
    }

    /** Menambahkan data mahasiswa
     * @param mhs */
    public void add(Mahasiswa mhs) {

        String query = "INSERT INTO mahasiswa(id,nama) VALUES(?,?)";

        try {
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setInt(1, mhs.getId());
            ps.setString(2, mhs.getNama());

            ps.executeUpdate();

            System.out.println("Berhasil insert");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Update data mahasiswa */
    public void update(Mahasiswa mhs) {

        String query = "UPDATE mahasiswa SET nama=? WHERE id=?";

        try {
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setString(1, mhs.getNama());
            ps.setInt(2, mhs.getId());

            ps.executeUpdate();

            System.out.println("Berhasil update");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Delete data mahasiswa sesuai id */
    public void delete(int id) {

        String query = "DELETE FROM mahasiswa WHERE id=?";

        try {
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setInt(1, id);

            ps.executeUpdate();

            System.out.println("Berhasil delete");

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    /** Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {

        String query = "SELECT * FROM mahasiswa WHERE id=?";

        Mahasiswa mhs = null;

        try {
            PreparedStatement ps = koneksi.prepareStatement(query);

            ps.setInt(1, id);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                mhs = new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return mhs;
    }

    /** Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {

        String query = "SELECT * FROM mahasiswa";

        List<Mahasiswa> listMhs = new ArrayList<>();

        try {

            Statement s = koneksi.createStatement();

            ResultSet rs = s.executeQuery(query);

            while (rs.next()) {

                Mahasiswa mhs = new Mahasiswa(
                        rs.getInt("id"),
                        rs.getString("nama")
                );

                listMhs.add(mhs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listMhs;
    }
    
    
public void indexReset() {
    String queryDelete = "DELETE FROM mahasiswa";
    String queryReset  = "ALTER TABLE mahasiswa AUTO_INCREMENT = 1";
    try {
        Statement s = koneksi.createStatement();
        s.executeUpdate(queryDelete);
        s.executeUpdate(queryReset);
        System.out.println("Index berhasil direset");
    } catch (SQLException e) {
        e.printStackTrace();
    }
}
}