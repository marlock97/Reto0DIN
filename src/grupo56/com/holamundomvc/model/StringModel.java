/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grupo56.com.holamundomvc.model;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Model implementation that returns a greeting saved in the database.
 *
 * @author Martin Angulo
 */
public class StringModel implements Model {

    private Statement stmt = null;
    private ResultSet rs = null;
    private Connection conn = null;

    /**
     * StringModel constructor, sets greeting to default.
     */
    public StringModel() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            // handle any errors
            System.out.println("ERROR.");
            System.out.println("SQLException: " + ex.getMessage());
        }
    }

    /**
     * Connects to the database.
     *
     * @return Connection
     */
    public Connection Connect() {
        try {
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/Reto0_MVC?" + "user=root&password=abcd*1234&useSSL=false");
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("ERROR: Connect.");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
            return null;
        }
    }

    /**
     * Disconnects from the database.
     */
    public void Disconnect() {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("ERROR: Disconnect.");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
    }

    @Override
    public String getGreeting() {
        String greeting = null;
        try {
            conn = Connect();
            stmt = conn.createStatement();

            if (stmt.execute("SELECT * FROM greeting")) {
                rs = stmt.getResultSet();
                while (rs.next()) {
                    greeting = rs.getString("Greeting_String");
                }
            }

            Disconnect();
        } catch (SQLException ex) {
            // handle any errors
            System.out.println("ERROR: Consult customer data.");
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }

        return greeting;
    }
}
