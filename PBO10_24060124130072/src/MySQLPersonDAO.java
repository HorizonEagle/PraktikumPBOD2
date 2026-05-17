/*
* File : MySQLPersonDAO.java
* Deskripsi : =implementasi PersonDAO untuk MySQL
*/
import java.sql.*;
public class MySQLPersonDAO implements PersonDAO{
    public void savePerson(Person person) throws Exception{
        String name = person.getName();

        //Membuat Koneksi,nama db,password menyesuaikan
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo","root","01100010");

        //Kerjakan mysql query
        String query = "INSERT INTO person(name) VALUES('"+name+"')";
        System.out.println(query);
        Statement s = con.createStatement();
        s.executeUpdate(query);

        //tutup koneksi database
        con.close();

    }
}
