package mustafa_cms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class SQLiteJDBCDriverConnection {
   
    public  void connect() {
        Connection conn = null;
        try {
            // db parameters
            String url = "jdbc:sqlite:data";
            conn = DriverManager.getConnection(url);
            ResultSet var;
            Statement sat =conn.createStatement();
            var = sat.executeQuery("select * from admin");
            System.out.println(var.getString("name")); 
            System.out.println(var.getString("isadmin")); 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
 
}

