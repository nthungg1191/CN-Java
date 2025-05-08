package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class connectDtb {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testeclipse"; 
        String username = "root"; 
        String password = ""; 

        try {
            
            Connection conn = DriverManager.getConnection(url, username, password);
            System.out.println("Kết nối thành công!");

            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Kết nối thất bại!");
        }
    }
}

