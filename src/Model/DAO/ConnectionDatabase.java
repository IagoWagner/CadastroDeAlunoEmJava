
package Model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConnectionDatabase {
    private static final String DRIVER ="com.msql.cj.jnc.Driver";
    private static final String URL ="";
    private static final String USER ="root";
    private static final String PASS ="1234";
    public static Connection getConnection(){
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (ClassNotFoundException ex) {
           ex.printStackTrace();
        } catch (SQLException ex) {
            throw new RuntimeException(ex);
        }
        return null;
    }

    static Connection getConnetion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
