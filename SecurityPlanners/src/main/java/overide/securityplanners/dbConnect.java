/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overide.securityplanners;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class dbConnect {

    private static final String URL = "jdbc:mysql://localhost:3306/jadwal_jaga";
    private static final String USER = "root"; // Change to your MySQL username
    private static final String PASSWORD = ""; // Change to your MySQL password

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            throw new IllegalStateException("Cannot find the driver in the classpath!", e);
        }
    }

    /**
     * Gets a connection to the database.
     *
     * @return the database connection
     */
    public static Connection getConnection() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            throw new IllegalStateException("Cannot connect the database!", e);
        }
    }
    
    public static void closeConnection(Connection connection) throws SQLException {
        if (connection != null) {
            connection.close();
        }
    }


    public static void main(String[] args) {
        try {
            Connection connection = getConnection();
            System.out.println("Connection successful");
            closeConnection(connection);
        } catch (SQLException e) {
            System.out.println("Connection failed");
            e.printStackTrace();
        }
    }
}
