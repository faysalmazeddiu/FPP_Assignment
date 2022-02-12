package prog13_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import javax.swing.JOptionPane;

public class DBConnection {

    private  String database_url = "jdbc:mysql://localhost:3306/FPPDB";
    private  String username = "root";
    private String password = "12345678";

    public  Connection getConnection() throws SQLException {
        try {
            Connection connection = DriverManager.getConnection(database_url, username, password);
            
            JOptionPane.showMessageDialog(null, "Connection Establist with DB...");
            return connection;
        } catch (Exception exception) {
            
            JOptionPane.showMessageDialog(null, exception.getMessage());

        }
        return null;
    }

}
