
package db;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class konekdb {
    private static Connection koneksi;
    
    public static Connection GetConnection() throws SQLException {
        if (koneksi==null){
            new Driver();
            System.out.println("Terhubung");
        
        koneksi=DriverManager.getConnection("jdbc:mysql://localhost:3306/sticker","root","");
//        koneksi=DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6452648","sql6452648","B1fMNnfMCj");
        }
        return koneksi;
    }
}
